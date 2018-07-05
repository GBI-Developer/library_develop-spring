package com.web.library.dao.ex.entity;

import com.web.library.dao.generate.entity.TUserInfo;

public class TUserInfoEx extends TUserInfo {

  private String userRegisteDateToString; // 文字列型 date
  private String userNumLending; // 関連TBL T_USER_STATUS

  /**
   * @summary userRegisteDateToStringを返却する
   * @type Date
   * @return userRegisteDateToString
   */
  public String getUserRegisteDateToString() {
    return userRegisteDateToString;
  }

  /**
   * @summary userRegisteDateToStringをセットする
   * @type Date
   * @param userRegisteDateToString
   */
  public void setUserRegisteDateToString(String userRegisteDate) {
    this.userRegisteDateToString = userRegisteDate;
  }

  /**
   * @summary userNumLendingを返却する
   * @type String
   * @return userNumLending
   */
  public String getUserNumLending() {
    return userNumLending;
  }

  /**
   * @summary userNumLendingをセットする
   * @type String
   * @param userNumLending
   */
  public void setUserNumLending(String userNumLending) {
    this.userNumLending = userNumLending;
  }

}