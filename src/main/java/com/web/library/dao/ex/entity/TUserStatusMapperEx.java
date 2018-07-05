package com.web.library.dao.ex.entity;

import org.apache.ibatis.annotations.Param;

public interface TUserStatusMapperEx {

  /**
   * @method: TBookStatusMapperEx
   * @discription: 貸出更新
   * @projectPass: library_web.com.web.library.dao.ex.entity.TUserStatusMapperEx.java
   * @param lendNum
   * @param booksId
   * @param userId
   * @param mngUserId
   * @return int
   */
  Integer updateLend(@Param("lendNum") int lendNum,
                      @Param("booksId") String booksId,
                      @Param("userId") String userId,
                      @Param("mngUserName") String mngUserName);

}