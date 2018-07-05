package com.web.library.dao.ex.entity;

import java.util.List;

import com.web.library.dao.generate.entity.TBookInfo;
import com.web.library.dao.generate.entity.TMngUserInfo;
import com.web.library.dao.generate.entity.TUserInfo;

public class TMngUserInfoEx extends TMngUserInfo{

    private List<TUserInfo> tUserInfo;

    private List<TBookInfo> tBookInfo;


    /**
     * @summary tUserInfoを返却する
     * @type List<TUserInfo>
     * @return tUserInfo
     */
    public List<TUserInfo> gettUserInfo() {
      return tUserInfo;
    }

    /**
     * @summary tUserInfoをセットする
     * @type List<TUserInfo>
     * @param tUserInfo
     */
    public void settUserInfo(List<TUserInfo> tUserInfo) {
      this.tUserInfo = tUserInfo;
    }

    /**
     * @summary tBookInfoを返却する
     * @type List<TBookInfo>
     * @return tBookInfo
     */
    public List<TBookInfo> gettBookInfo() {
      return tBookInfo;
    }

    /**
     * @summary tBookInfoをセットする
     * @type List<TBookInfo>
     * @param tBookInfo
     */
    public void settBookInfo(List<TBookInfo> tBookInfo) {
      this.tBookInfo = tBookInfo;
    }

}