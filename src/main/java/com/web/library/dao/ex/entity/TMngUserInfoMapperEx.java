package com.web.library.dao.ex.entity;

import org.apache.ibatis.annotations.Param;

import com.web.library.dao.generate.entity.TMngUserInfo;

public interface TMngUserInfoMapperEx {

  /**
   * @method: TMngUserInfoMapperEx
   * @discription: 管理者が登録した利用者情報を取得する
   * @projectPass: library_web.com.web.library.dao.ex.entity.TMngUserInfoMapperEx.java
   * @param mngUserId
   * @return
   * TMngUserInfoEx
   */
  TMngUserInfoEx selectUserRegisteredManagerList(String mngUserId);


  /**
   * @method: TMngUserInfoMapperEx
   * @discription:
   * @projectPass: library_web.com.web.library.dao.ex.entity.TMngUserInfoMapperEx.java
   * @param mngUserId
   * @param mngUserPass
   * @return
   * TMngUserInfo
   */
  TMngUserInfo selectMngUser(@Param("mngUserId") String mngUserId, @Param("mngUserPass") String mngUserPass);
}