package com.web.library.app.controller.libraryentrance;

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

import com.web.library.domain.service.libraryentrance.impl.LibraryEntranceServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LibraryEntranceController {

  private static final Logger logger = LoggerFactory.getLogger(LibraryEntranceController.class);

  @ModelAttribute // (1)
  public LibraryEntranceForm setUpLibraryEntranceForm() {
    LibraryEntranceForm libraryEntranceForm = new LibraryEntranceForm();
      return libraryEntranceForm;
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
   * ユーザ一覧ボタンコントローラ
   */
  @RequestMapping(value = "/libraryentrance/userList", method = RequestMethod.GET)
  public String userList(Locale locale, Model model) {
    logger.info("Welcome userList! The client locale is {}.", locale);

    LibraryEntranceServiceImpl libraryEntranceServiceImpl = new LibraryEntranceServiceImpl();

    String tUserInfo = null;
    try {
      tUserInfo = libraryEntranceServiceImpl.getUserList();

    } catch (IOException e) {
      e.printStackTrace();
    }
    if (tUserInfo != null) {
      model.addAttribute("displayInfo", "ユーザ一覧");
      model.addAttribute("tUserInfo", tUserInfo);
      model.addAttribute("user_name","testadmin");
    }
    return "userList";

  }

  /**
   * 図書一覧ボタンコントローラ
   */
  @RequestMapping(value = "/libraryentrance/bookList", method = RequestMethod.GET)
  public String bookList(Locale locale, Model model) {
    logger.info("Welcome bookList! The client locale is {}.", locale);

    LibraryEntranceServiceImpl libraryEntranceServiceImpl = new LibraryEntranceServiceImpl();

    String tBookInfo = null;
    try {
      tBookInfo = libraryEntranceServiceImpl.getBookList();

    } catch (IOException e) {
      e.printStackTrace();
    }
    if (tBookInfo != null) {
      model.addAttribute("displayInfo", "図書一覧");
      model.addAttribute("tBookInfo", tBookInfo);
      model.addAttribute("user_name","testadmin");
    }
    return "bookList";

  }

}
