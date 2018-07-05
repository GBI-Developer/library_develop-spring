/**
 * @date 2018/05/23
 * @class: LoginServiceImpl.java
 * @discription:
 *
 */
package com.web.library.domain.service.userdetails;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.web.library.dao.generate.entity.TMngUserInfo;

public class UserDetail extends User {


  private static final long serialVersionUID = 1L;

  private final TMngUserInfo mngUserInfo; // (2)

  public UserDetail(TMngUserInfo mngUserInfo) {
      // (3)
      super(mngUserInfo.getMngUserName(), mngUserInfo.getMngUserPass(), AuthorityUtils
              .createAuthorityList("ROLE_USER")); // (4)
      this.mngUserInfo = mngUserInfo;
  }

  public TMngUserInfo getAccount() { // (5)
      return mngUserInfo;
  }

}
