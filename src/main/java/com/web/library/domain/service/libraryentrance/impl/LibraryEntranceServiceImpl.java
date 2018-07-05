/**
 * @date 2018/05/23
 * @class: LoginServiceImpl.java
 * @discription:
 *
 */
package com.web.library.domain.service.libraryentrance.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.library.dao.ex.entity.TBookInfoEx;
import com.web.library.dao.ex.entity.TBookInfoMapperEx;
import com.web.library.dao.ex.entity.TUserInfoEx;
import com.web.library.dao.ex.entity.TUserInfoMapperEx;
import com.web.library.domain.service.common.CommonFactory;
import com.web.library.domain.service.common.JsonUtil;
import com.web.library.domain.service.libraryentrance.LibraryEntranceService;

/**
 * @作成日 2018/02/04
 * @ファイル名 LibraryEntranceServiceImpl.java
 * @description LibraryEntranceサービス
 */
public class LibraryEntranceServiceImpl implements LibraryEntranceService {

  /* (非 Javadoc)
   * @see com.web.library.domain.service.libraryentrance.LibraryEntranceService#getUserList(com.web.library.app.controller.libraryentrance.LibraryEntranceForm)
   */
  @Override
  public String getUserList() throws IOException {

    List<TUserInfoEx> resutList = null; // Bean
    String jsonConvert = null;
    // SqlSessionオープン
    SqlSession session = CommonFactory.openSession();
    try {
      // インターフェースの取得
      TUserInfoMapperEx mapEx = session.getMapper(TUserInfoMapperEx.class);
      // ユーザ一覧情報TBL検索
      resutList = mapEx.selectUserInfo();
    } finally {
      session.close();
    }
    if (resutList != null) {
      jsonConvert = new JsonUtil().convert(resutList);
    }

    return jsonConvert;
  }

  /* (非 Javadoc)
   * @see com.web.library.domain.service.libraryentrance.LibraryEntranceService#getBookList()
   */
  @Override
  public String getBookList() throws IOException {

    List<TBookInfoEx> resutList = null; // Bean
    String jsonConvert = null;
    // SqlSessionオープン
    SqlSession session = CommonFactory.openSession();
    try {
      // インターフェースの取得
      TBookInfoMapperEx mapEx = session.getMapper(TBookInfoMapperEx.class);
      // 図書一覧情報TBL検索
      resutList = mapEx.selectBookInfo();
    } finally {
      session.close();
    }
    if (resutList != null) {
      jsonConvert = new JsonUtil().convert(resutList);
    }

    return jsonConvert;
  }
}
