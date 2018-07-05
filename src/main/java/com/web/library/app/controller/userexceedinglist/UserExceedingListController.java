package com.web.library.app.controller.userexceedinglist;

import java.io.IOException;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.library.domain.service.userexceedinglist.impl.UserExceedingListServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserExceedingListController {

  private static final Logger logger = LoggerFactory.getLogger(UserExceedingListController.class);

  @ModelAttribute // (1)
  public UserExceedingListForm setUpLibraryEntranceForm() {
    UserExceedingListForm userExceedingListForm = new UserExceedingListForm();
      return userExceedingListForm;
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
   * 超過者一覧ボタンコントローラ
   */
  @RequestMapping(value = "/userexceedinglist/userExceedingList", method = RequestMethod.GET)
  public String userExceedingList(Locale locale, Model model) {
    logger.info("Welcome userExceedingList! The client locale is {}.", locale);

    UserExceedingListServiceImpl userExceedingServiceImpl = new UserExceedingListServiceImpl();

    String tUserInfo = null;
    String tBookInfo = null;
    try {
      tUserInfo = userExceedingServiceImpl.getUserExceedingList();
      tBookInfo = userExceedingServiceImpl.getBookExceedingList();

    } catch (IOException e) {
      e.printStackTrace();
    }
    if (tUserInfo != null) {
      model.addAttribute("displayInfo", "超過者一覧");
      model.addAttribute("tUserInfo", tUserInfo);
      model.addAttribute("tBookInfo", tBookInfo);
      model.addAttribute("user_name","testadmin");
    }
    return "userExceedingList";

  }

}
