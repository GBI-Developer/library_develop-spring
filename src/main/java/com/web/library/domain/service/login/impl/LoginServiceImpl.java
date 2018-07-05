/**
 * @date 2018/05/23
 * @class: LoginServiceImpl.java
 * @discription:
 *
 */
package com.web.library.domain.service.login.impl;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.web.library.app.controller.login.LoginForm;
import com.web.library.dao.ex.entity.TMngUserInfoMapperEx;
import com.web.library.dao.generate.entity.TMngUserInfo;
import com.web.library.domain.service.common.CommonFactory;
import com.web.library.domain.service.login.LoginService;

public class LoginServiceImpl implements LoginService {


  /**
   * @method: LoginServiceImpl
   * @discription: 管理ユーザ情報取得処理
   * @projectPass: library_web.com.web.library.domain.service.login.impl.LoginServiceImpl.java
   * @param loginForm
   * @return TMngUserInfo
   * @throws IOException
   */
  public TMngUserInfo getMngUser(LoginForm loginForm) throws IOException {

    TMngUserInfo entity;

    // SqlSessionオープン
    SqlSession session = CommonFactory.openSession();
    try{
      // インターフェースの取得
      TMngUserInfoMapperEx mapEx = session.getMapper(TMngUserInfoMapperEx.class);
      // 管理ユーザ情報TBL検索
      entity = mapEx.selectMngUser(loginForm.getMngUserId(), loginForm.getMngUserPass());
    } finally {
      session.close();
    }

    return entity;
  }
}
