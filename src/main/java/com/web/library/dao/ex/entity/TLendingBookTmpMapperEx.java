package com.web.library.dao.ex.entity;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TLendingBookTmpMapperEx {

  /**
   * @method: TUserInfoMapperEx
   * @discription: 超過者一覧を取得する
   * @projectPass: library_web.com.web.library.dao.ex.entity.TUserInfoMapperEx.java
   * @return TUserInfo
   */
  List<TLendingBookTmpEx> selectUserExceedingList();

  /**
   * @method: TUserInfoMapperEx
   * @discription: 超過図書一覧を取得する
   * @projectPass: library_web.com.web.library.dao.ex.entity.TUserInfoMapperEx.java
   * @return TUserInfo
   */
  List<TLendingBookTmpEx> selectBookExceedingList();

  /**
   * @method: TBookStatusMapperEx
   * @discription: 貸出更新
   * @projectPass: library_web.com.web.library.dao.ex.entity.TBookStatusMapperEx.java
   * @param bookIdList
   * @param userId
   * @param returnDate
   * @param mngUserId
   * @param mngUserName
   * @return int
   */
  Integer updateLend(@Param("bookIdList") String[] bookIdList,
                        @Param("userId") String userId,
                        @Param("returnDate") Date returnDate,
                        @Param("mngUserId") String mngUserId,
                        @Param("mngUserName") String mngUserName);

}