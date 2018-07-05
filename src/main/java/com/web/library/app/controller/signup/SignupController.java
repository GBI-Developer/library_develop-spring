package com.web.library.app.controller.signup;

import java.io.IOException;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.library.dao.generate.entity.TMngUserInfo;
import com.web.library.domain.service.signup.impl.SignupServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SignupController {

  private static final Logger logger = LoggerFactory.getLogger(SignupController.class);

  @ModelAttribute // (1)
  public SignupForm setUpSignupForm() {
    SignupForm signupForm = new SignupForm();
      return signupForm;
  }

  @Autowired
  private Validator validator;
  @Autowired
  private MessageSource msg;

  @InitBinder
  protected void initBinder(WebDataBinder binder) {
    binder.setValidator(validator);
  }

  /**
   * 登録ボタンコントローラ
   */
  @RequestMapping(value = "/signup/mng/user/registe", method = RequestMethod.POST)
  public String mngUserRegiste(@Valid @ModelAttribute SignupForm signupForm, BindingResult result, Locale locale, Model model) {
    logger.info("Welcome signup! The client locale is {}.", locale);

    if (!result.hasErrors()) {

      SignupServiceImpl signupServiceImpl = new SignupServiceImpl();

      TMngUserInfo tMngUserInfo = null;
      try {
        tMngUserInfo = signupServiceImpl.insertMngUser(signupForm);

      } catch (IOException e) {
        e.printStackTrace();
      }
      if (tMngUserInfo != null) {
        model.addAttribute("user_name", tMngUserInfo.getMngUserName());
        return "LibraryEntrance";
      }
      model.addAttribute("error", msg.getMessage("User_not_exist", null, locale));
    }
    return "signup";

  }

}
