/**
 * @date 2018/05/23
 * @class: LoginServiceImpl.java
 * @discription:
 *
 */
package com.web.library.domain.service.userexceedinglist.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.library.dao.ex.entity.TLendingBookTmpEx;
import com.web.library.dao.ex.entity.TLendingBookTmpMapperEx;
import com.web.library.domain.service.common.CommonFactory;
import com.web.library.domain.service.common.JsonUtil;
import com.web.library.domain.service.userexceedinglist.UserExceedingListService;

/**
 * @作成日 2018/02/04
 * @ファイル名 LoginService.java
 * @description 超過者一覧情報処理
 */
public class UserExceedingListServiceImpl implements UserExceedingListService {

  /* (非 Javadoc)
   * @see com.web.library.domain.service.libraryentrance.LibraryEntranceService#getUserList(com.web.library.app.controller.libraryentrance.LibraryEntranceForm)
   */
  public String getUserExceedingList() throws IOException {

    List<TLendingBookTmpEx> resutList = null; // Bean
    String jsonConvert = null;
    // SqlSessionオープン
    SqlSession session = CommonFactory.openSession();
    try {
      // インターフェースの取得
      TLendingBookTmpMapperEx mapEx = session.getMapper(TLendingBookTmpMapperEx.class);
      // 超過者一覧情報検索
      resutList = mapEx.selectUserExceedingList();
    } finally {
      session.close();
    }
    if (resutList != null) {
      jsonConvert = new JsonUtil().convert(resutList);
    }

    return jsonConvert;
  }

  /* (非 Javadoc)
   * @see com.web.library.domain.service.libraryentrance.LibraryEntranceService#getUserList(com.web.library.app.controller.libraryentrance.LibraryEntranceForm)
   */
  public String getBookExceedingList() throws IOException {

    List<TLendingBookTmpEx> resutList = null; // Bean
    String jsonConvert = null;
    // SqlSessionオープン
    SqlSession session = CommonFactory.openSession();
    try {
      // インターフェースの取得
      TLendingBookTmpMapperEx mapEx = session.getMapper(TLendingBookTmpMapperEx.class);
      // 超過図書一覧情報検索
      resutList = mapEx.selectBookExceedingList();
    } finally {
      session.close();
    }
    if (resutList != null) {
      jsonConvert = new JsonUtil().convert(resutList);
    }

    return jsonConvert;
  }
}
