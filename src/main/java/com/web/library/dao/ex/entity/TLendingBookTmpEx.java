package com.web.library.dao.ex.entity;

import java.util.Date;

import com.web.library.dao.generate.entity.TLendingBookTmp;

public class TLendingBookTmpEx extends TLendingBookTmp{

    private String bookId;
    private String userId;
    private Date lendingDate;
    private Date returnDate;
    private String mngUserId;
    private Date createDate;
    private Date updateDate;

    /**
     * @summary bookIdを返却する
     * @type String
     * @return bookId
     */
    public String getBookId() {
      return bookId;
    }
    /**
     * @summary bookIdをセットする
     * @type String
     * @param bookId
     */
    public void setBookId(String bookId) {
      this.bookId = bookId;
    }
    /**
     * @summary userIdを返却する
     * @type String
     * @return userId
     */
    public String getUserId() {
      return userId;
    }
    /**
     * @summary userIdをセットする
     * @type String
     * @param userId
     */
    public void setUserId(String userId) {
      this.userId = userId;
    }
    /**
     * @summary lendingDateを返却する
     * @type Date
     * @return lendingDate
     */
    public Date getLendingDate() {
      return lendingDate;
    }
    /**
     * @summary lendingDateをセットする
     * @type Date
     * @param lendingDate
     */
    public void setLendingDate(Date lendingDate) {
      this.lendingDate = lendingDate;
    }
    /**
     * @summary returnDateを返却する
     * @type Date
     * @return returnDate
     */
    public Date getReturnDate() {
      return returnDate;
    }
    /**
     * @summary returnDateをセットする
     * @type Date
     * @param returnDate
     */
    public void setReturnDate(Date returnDate) {
      this.returnDate = returnDate;
    }
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
     * @summary createDateを返却する
     * @type Date
     * @return createDate
     */
    public Date getCreateDate() {
      return createDate;
    }
    /**
     * @summary createDateをセットする
     * @type Date
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
      this.createDate = createDate;
    }
    /**
     * @summary updateDateを返却する
     * @type Date
     * @return updateDate
     */
    public Date getUpdateDate() {
      return updateDate;
    }
    /**
     * @summary updateDateをセットする
     * @type Date
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
    }


}