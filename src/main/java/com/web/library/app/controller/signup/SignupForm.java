/**
 * @date 2018/05/14
 * @class: LoginForm.java
 * @discription:
 *
 */
package com.web.library.app.controller.signup;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 拓真
 *
 */
public class SignupForm {

  @NotEmpty(message="{NotEmpty}")
  @Pattern(regexp="^[a-zA-Z0-9]+$", message="IDは、半角英数字で指定してください")
  private String mngUserId;

  @NotEmpty(message="{password}{NotEmpty}")
  @Pattern(regexp="^[a-zA-Z0-9]+$", message="パスワードは、半角英数字で指定してください")
  private String mngUserPass;

  /**
   * @summary mngUserIdを返却する
   * @type String
   * @return mngUserId
   */
  public String getMngUserId() {
    return mngUserId;
  }

  /**
   * @summary mngUserIdをセットする
   * @type String
   * @param mngUserId
   */
  public void setMngUserId(String mngUserId) {
    this.mngUserId = mngUserId;
  }

  /**
   * @summary mngUserPassを返却する
   * @type String
   * @return mngUserPass
   */
  public String getMngUserPass() {
    return mngUserPass;
  }

  /**
   * @summary mngUserPassをセットする
   * @type String
   * @param mngUserPass
   */
  public void setMngUserPass(String mngUserPass) {
    this.mngUserPass = mngUserPass;
  }



}
