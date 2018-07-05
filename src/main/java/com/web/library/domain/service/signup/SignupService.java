/**
 * @date 2018/05/22
 * @class: LoginService.java
 * @discription:
 *
 */
package com.web.library.domain.service.signup;

import java.io.IOException;

import com.web.library.app.controller.signup.SignupForm;
import com.web.library.dao.generate.entity.TMngUserInfo;

/**
 * @作成日 2018/02/04
 * @ファイル名 LoginService.java
 * @description 管理ユーザー関連の処理を行うクラス.
 */
public interface SignupService {


  /**
   * @method: LoginServiceImpl
   * @discription: 管理ユーザ登録処理
   * @projectPass: library_web.com.web.library.domain.service.login.impl.LoginServiceImpl.java
   * @param signupForm
   * @return TMngUserInfo
   * @throws IOException
   */
  public TMngUserInfo insertMngUser(SignupForm signupForm) throws IOException;

}
