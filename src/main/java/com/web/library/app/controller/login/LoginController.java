package com.web.library.app.controller.login;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.apache.ibatis.session.SqlSession;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.library.app.controller.signup.SignupForm;
import com.web.library.dao.generate.entity.TMngUserInfo;
import com.web.library.domain.service.common.CommonFactory;
import com.web.library.domain.service.login.impl.LoginServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

  private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

  @ModelAttribute // (1)
  public LoginForm setUpLoginForm() {
    LoginForm loginForm = new LoginForm();
      return loginForm;
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
   * 初期画面表示
   */
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String Home(Locale locale, Model model) {
    logger.info("Welcome Home! The client locale is {}.", locale);
    // SqlSessionオープン
    SqlSession session = CommonFactory.openSession();

    Date date = new Date();
    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

    String formattedDate = dateFormat.format(date);

    model.addAttribute("serverTime", formattedDate);

    return "login";
  }

  /**
   * ログインボタンコントローラ
   */
  @RequestMapping(value = "/login/login", method = RequestMethod.POST)
  public String login(@Valid @ModelAttribute LoginForm loginForm, BindingResult result, Locale locale, Model model) {
    logger.info("Welcome login! The client locale is {}.", locale);

    if (!result.hasErrors()) {

      LoginServiceImpl loginServiceImpl = new LoginServiceImpl();

      TMngUserInfo mngUserInfo = null;
      try {
        mngUserInfo = loginServiceImpl.getMngUser(loginForm);

      } catch (IOException e) {
        e.printStackTrace();
      }
      if (mngUserInfo != null) {
        model.addAttribute("user_name", mngUserInfo.getMngUserName());
        return "LibraryEntrance";
      }
      model.addAttribute("error", msg.getMessage("User_not_exist", null, locale));
    }
    return "login";

  }

  /**
   * ゲストボタンコントローラ
   */
  @RequestMapping(value = "/login/guest", method = RequestMethod.GET)
  public String guest(@RequestParam String guest, Model model) {
    logger.info("Welcome guest!");
    model.addAttribute("user_name", guest);
    return "LibraryEntrance";

  }

  /**
   * サインアップボタンコントローラ
   */
  @RequestMapping(value = "/login/signup", method = RequestMethod.GET)
  public ModelAndView  signup() {
    logger.info("Welcome signup!");
    return new ModelAndView("/signup","signupForm", new SignupForm());
  }

  /**
   * ログアウトボタンコントローラ
   */
  @RequestMapping(value = "/login/logout", method = RequestMethod.GET)
  public String logout() {
    logger.info("Welcome logout!");
    return "login";

  }



}
