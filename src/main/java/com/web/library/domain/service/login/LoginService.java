/**
 * @date 2018/05/22
 * @class: LoginService.java
 * @discription:
 *
 */
package com.web.library.domain.service.login;

import java.io.IOException;

import com.web.library.app.controller.login.LoginForm;
import com.web.library.dao.generate.entity.TMngUserInfo;

/**
 * @作成日 2018/02/04
 * @ファイル名 LoginService.java
 * @description 管理ユーザー関連の処理を行うクラス.
 */
public interface LoginService {

  /**
   * @method: LoginServiceImpl
   * @discription: 管理ユーザ情報取得処理
   * @projectPass: library_web.com.web.library.domain.service.login.impl.LoginServiceImpl.java
   * @param loginForm
   * @return TMngUserInfo
   */
  TMngUserInfo getMngUser(LoginForm loginForm) throws IOException;
}
