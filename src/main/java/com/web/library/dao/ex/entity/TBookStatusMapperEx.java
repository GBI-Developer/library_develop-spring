package com.web.library.dao.ex.entity;

import org.apache.ibatis.annotations.Param;

public interface TBookStatusMapperEx {


  /**
   * @method: TBookStatusMapperEx
   * @discription: 貸出更新
   * @projectPass: library_web.com.web.library.dao.ex.entity.TBookStatusMapperEx.java
   * @param bookIdList
   * @param userId
   * @param mngUserId
   * @return int
   */
  Integer updateLend(@Param("bookIdList") String[] bookIdList,
                   @Param("userId") String userId,
                   @Param("mngUserName") String mngUserName);
}