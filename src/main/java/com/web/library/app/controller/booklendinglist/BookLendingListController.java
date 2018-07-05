package com.web.library.app.controller.booklendinglist;

import java.io.IOException;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.library.domain.service.booklendinglist.impl.BookLendingListServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BookLendingListController {

  private static final Logger logger = LoggerFactory.getLogger(BookLendingListController.class);

  @ModelAttribute // (1)
  public BookLendingListForm setUpBookLendingListForm() {
    BookLendingListForm bookLendingListForm = new BookLendingListForm();
      return bookLendingListForm;
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
   * 図書貸出ボタンコントローラ
   */
  @RequestMapping(value = "/booklendinglist/bookLendingList", method = RequestMethod.GET)
  public ModelAndView bookLendingList(Locale locale, Model model) {
    logger.info("Welcome bookLendingList! The client locale is {}.", locale);

    BookLendingListServiceImpl bookLendingListServiceImpl = new BookLendingListServiceImpl();

    String tBookInfo = null;
    try {
      tBookInfo = bookLendingListServiceImpl.getBookList();

    } catch (IOException e) {
      e.printStackTrace();
    }
    if (tBookInfo != null) {
      model.addAttribute("displayInfo", "図書貸出");
      model.addAttribute("tBookInfo", tBookInfo);
      model.addAttribute("user_name","testadmin");
    }
    return new ModelAndView("/bookLendingList","BookLendingListForm", new BookLendingListForm());

  }

  /**
   * 貸出確認ボタンコントローラ
   */
  @RequestMapping(value = "/booklendinglist/bookLendConfirm", method = RequestMethod.GET)
  public String bookLendConfirm(@RequestParam("list") String list[], Locale locale, Model model) {
    logger.info("Welcome bookLendingList! The client locale is {}.", locale);

    BookLendingListServiceImpl bookLendingListServiceImpl = new BookLendingListServiceImpl();

    String tBookInfo = null;
    String tUserInfo = null;
    try {

      tBookInfo = bookLendingListServiceImpl.getCheckedBooksList(list);

      if (!StringUtils.isEmpty(tBookInfo)) {

        tUserInfo = bookLendingListServiceImpl.getUserList();
      }


    } catch (IOException e) {
      e.printStackTrace();
    }
    if (!StringUtils.isEmpty(tBookInfo) && !StringUtils.isEmpty(tUserInfo)) {
      model.addAttribute("displayInfo", "貸出確認");
      model.addAttribute("tUserInfo", tUserInfo);
      model.addAttribute("tBookInfo", tBookInfo);
      model.addAttribute("user_name","testadmin");
    }
    return "bookLendConfirm";

  }

  /**
   * モーダル決定ボタンコントローラ
   * @return
   */
  @RequestMapping(value = "/booklendinglist/lendDecision", method = RequestMethod.POST)
  public ModelAndView lendDecision(@RequestParam("user_id") String userId,
                                @RequestParam("book_id") String bookId,
                                Locale locale, Model model) {

    int result = 0;
    String mngUserId = "103";
    String mngUserName = "user103";
    logger.info("Welcome lendDecision! The client locale is {}.", locale);

    BookLendingListServiceImpl bookLendingListServiceImpl = new BookLendingListServiceImpl();

    try {
      // 貸出登録
      result = bookLendingListServiceImpl.lendRegist(userId, bookId, mngUserId, mngUserName);

    } catch (IOException e) {
      e.printStackTrace();
    }
    String tBookInfo = null;
    try {
      tBookInfo = bookLendingListServiceImpl.getBookList();

    } catch (IOException e) {
      e.printStackTrace();
    }
    if (tBookInfo != null) {
      model.addAttribute("displayInfo", "図書貸出");
      model.addAttribute("tBookInfo", tBookInfo);
      model.addAttribute("user_name","testadmin");
    }
    if (result > 0) {

      model.addAttribute("lendDecision", "success");
    } else {

      model.addAttribute("lendDecision", "failed");
    }
    return new ModelAndView("/bookLendingList","BookLendingListForm", new BookLendingListForm());

  }

}
