/**
 * @date 2018/05/23
 * @class: LoginServiceImpl.java
 * @discription:
 *
 */
package com.web.library.domain.service.booklendinglist.impl;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.library.dao.ex.entity.TBookInfoEx;
import com.web.library.dao.ex.entity.TBookInfoMapperEx;
import com.web.library.dao.ex.entity.TBookStatusMapperEx;
import com.web.library.dao.ex.entity.TLendingBookTmpMapperEx;
import com.web.library.dao.ex.entity.TUserInfoEx;
import com.web.library.dao.ex.entity.TUserInfoMapperEx;
import com.web.library.dao.ex.entity.TUserStatusMapperEx;
import com.web.library.domain.service.booklendinglist.BookLendingListService;
import com.web.library.domain.service.common.CommonFactory;
import com.web.library.domain.service.common.JsonUtil;
import com.web.library.domain.service.common.LibraryUtil;

/**
 * @作成日 2018/02/04
 * @ファイル名 BookLendingListServiceImpl.java
 * @description 図書貸出一覧情報処理
 */
@Service
public class BookLendingListServiceImpl implements BookLendingListService {

  /* (非 Javadoc)
   * @see com.web.library.domain.service.booklendinglist.BookLendingListService#getBookList()
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
      // 図書一覧検索
      resutList = mapEx.selectBookInfo();

      session.commit();
    } finally {
      session.close();
    }
    if (resutList != null) {
      jsonConvert = new JsonUtil().convert(resutList);
    }

    return jsonConvert;
  }

  /* (非 Javadoc)
   * @see com.web.library.domain.service.booklendinglist.BookLendingListService#getUserList()
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
     * @see com.web.library.domain.service.booklendinglist.BookLendingListService#getCheckedBooksList()
     */
    @Override
    public String getCheckedBooksList(String[] list) throws IOException {

      List<TBookInfoEx> resutList = null; // Bean
      String jsonConvert = null;

      // 不要なカンマを削除
      list = LibraryUtil.DeletingDesignatedCharacter(list, "'");
      // SqlSessionオープン
      SqlSession session = CommonFactory.openSession();
      try {
        // インターフェースの取得
        TBookInfoMapperEx mapEx = session.getMapper(TBookInfoMapperEx.class);
        //  チェックした図書一覧検索
        resutList = mapEx.selectCheckedBooksList(list);
      } finally {
        session.close();
      }
      if (resutList != null) {
        jsonConvert = new JsonUtil().convert(resutList);
      }

      return jsonConvert;
    }

    /* (非 Javadoc)
     * @see com.web.library.domain.service.booklendinglist.BookLendingListService#lendRegist(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    @Transactional
    public int lendRegist(String userId, String booksId, String mngUserId, String mngUserName) throws IOException {

      int result = 0;

      // 配列に変換
      String[] bookIdList = booksId.split(",");
      // 貸出数
      int lendNum = bookIdList.length;
      // カンマ連結
      String tmpUserId = userId + ",";
      // 貸出日
      Date date = LibraryUtil.getSystemDate();
      // 返却日を取得
      Date returnDate = LibraryUtil.calcDay(date, "yyyy-MM-dd", 7);

      Map<String, Object> map = new HashMap<>();

/*      // 貸出数
      map.put("lendNum", bookIdList.length);
      // 図書ID
      map.put("booksId", booksId);
      // ユーザID
      map.put("userId", userId);
      // カンマ連結
      map.put("tmpUserId", userId + ",");
      // 管理ユーザ名
      map.put("mngUserName", mngUserName);
      // 返却日
      map.put("returnDate", returnDate);*/

      // SqlSessionオープン
      SqlSession session = CommonFactory.openSession();
      try {

        //  貸出更新
        TBookStatusMapperEx mapEx1 = session.getMapper(TBookStatusMapperEx.class);
        result = mapEx1.updateLend(bookIdList, tmpUserId, mngUserName);

        if (result > 0) {

          TUserStatusMapperEx mapEx2 = session.getMapper(TUserStatusMapperEx.class);
          result = mapEx2.updateLend(lendNum, booksId, userId, mngUserName);
          if (result > 0) {

            TLendingBookTmpMapperEx mapEx3 = session.getMapper(TLendingBookTmpMapperEx.class);
          result = mapEx3.updateLend(bookIdList, userId, returnDate, mngUserId, mngUserName);
          }
        }

        session.commit();

      } finally {
        session.close();
      }

      return result;
    }
}
