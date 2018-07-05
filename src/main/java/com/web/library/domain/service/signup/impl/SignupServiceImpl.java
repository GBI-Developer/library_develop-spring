/**
 * @date 2018/05/23
 * @class: SignupServiceImpl.java
 * @discription:
 *
 */
package com.web.library.domain.service.signup.impl;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.web.library.app.controller.signup.SignupForm;
import com.web.library.dao.ex.entity.TMngUserInfoMapperEx;
import com.web.library.dao.generate.entity.TMngUserInfo;
import com.web.library.domain.service.common.CommonFactory;
import com.web.library.domain.service.signup.SignupService;

public class SignupServiceImpl implements SignupService {


  /* (非 Javadoc)
   * @see com.web.library.domain.service.signup.SignupService#insertMngUser(com.web.library.app.controller. signup.SignupForm)
   */
  @Override
  public TMngUserInfo insertMngUser(SignupForm signupForm) throws IOException {

    TMngUserInfo resutList = null; // 返却用Bean
    TMngUserInfo entity;

    // SqlSessionオープン
    SqlSession session = CommonFactory.openSession();
    try{
      // インターフェースの取得
      TMngUserInfoMapperEx mapEx = session.getMapper(TMngUserInfoMapperEx.class);
      // 管理ユーザ情報TBL検索
      entity = mapEx.selectMngUser(signupForm.getMngUserId(), signupForm.getMngUserPass());
    } finally {
      session.close();
    }

    if (entity != null) {
      resutList = new TMngUserInfo();
      resutList.setMngUserId(entity.getMngUserId());
      resutList.setMngUserName(entity.getMngUserName());
      resutList.setMngRegistDate(entity.getMngRegistDate());
    }

    return resutList;
  }

}
