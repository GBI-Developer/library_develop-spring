package com.web.library.dao.ex.entity;

import com.web.library.dao.generate.entity.TBookInfo;

public class TBookInfoEx extends TBookInfo {


  private String bookRegisteDateToString; // 文字列型 date
  private String bookNumLending; // 関連TBL T_BOOK_STATUS
  private String bookLendStatus; // 関連TBL T_BOOK_STATUS

  /**
   * @summary bookNumLendingを返却する
   * @type String
   * @return bookNumLending
   */
  public String getBookNumLending() {
    return bookNumLending;
  }
  /**
   * @summary bookNumLendingをセットする
   * @type String
   * @param bookNumLending
   */
  public void setBookNumLending(String bookNumLending) {
    this.bookNumLending = bookNumLending;
  }
  /**
   * @summary bookLendStatusを返却する
   * @type String
   * @return bookLendStatus
   */
  public String getBookLendStatus() {
    return bookLendStatus;
  }
  /**
   * @summary bookLendStatusをセットする
   * @type String
   * @param bookLendStatus
   */
  public void setBookLendStatus(String bookLendStatus) {
    this.bookLendStatus = bookLendStatus;
  }
  /**
   * @summary bookRegisteDateを返却する
   * @type String
   * @return bookRegisteDate
   */
  public String getBookRegisteDateToString() {
    return bookRegisteDateToString;
  }
  /**
   * @summary bookRegisteDateをセットする
   * @type String
   * @param bookRegisteDate
   */
  public void setBookRegisteDateToString(String bookRegisteDate) {
    this.bookRegisteDateToString = bookRegisteDate;
  }

}