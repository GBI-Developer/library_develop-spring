/**
 * @date 2018/05/14
 * @class: LoginForm.java
 * @discription:
 *
 */
package com.web.library.app.controller.libraryentrance;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author 拓真
 *
 */
public class LibraryEntranceForm {

  @NotNull(message="IDは、必須入力です")
  @Pattern(regexp="^[a-zA-Z0-9]+$", message="IDは、半角英数字で指定してください")
  private String mngUserId;

  @NotNull(message="パスワードは、必須入力です")
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
