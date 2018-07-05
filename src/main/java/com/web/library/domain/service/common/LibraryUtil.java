/**
 * @date 2018/06/23
 * @class: LibraryUtil.java
 * @discription:
 *
 */
package com.web.library.domain.service.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @作成日 2018/02/04
 * @ファイル名 LibraryUtil.java
 * @description ユーティリティクラス.
 */
public class LibraryUtil {

    /**
     * コンストラクタです。
     * インスタンス化禁止です。
     */
    private LibraryUtil() { }

  /**
   * @method: LibraryUtil
   * @discription: リストの最初と最後の指定文字の削除
   * @projectPass: library_web.com.web.library.domain.service.common.LibraryUtil.java
   * @param list
   * @param string
   * @return String[]
   */
  public static String[] DeletingDesignatedCharacter(String[] list, String target ) {

    if (list.length > 1) {

      String fast = list[0];
      String last = list[list.length - 1];
      fast = fast.replace(target, "");
      last = last.replace(target, "");
      list[0] = fast;
      list[list.length - 1] = last;
    } else {

      String fast = list[0];
      fast = fast.replace(target, "");
      list[0] = fast;
    }
    return list;

  }

  /**
   * @method: LibraryUtil
   * @discription: 現在の日時を取得する
   * @projectPass: library_web.com.web.library.domain.service.common.LibraryUtil.java
   * @return Date
   */
  public static Date getSystemDate() {
    Date date = new Date();
    return date;
  }

  /**
   * @method: LibraryUtil
   * @discription: 日を計算する
   * @projectPass: library_web.com.web.library.domain.service.common.LibraryUtil.java
   * @param target
   * @param targetDay
   * @return Date
   * @throws ParseException
   */
  public static Date calcDay(Date targetDate, String format, int targetDay) {

    SimpleDateFormat sdf = new SimpleDateFormat(format);
    Calendar cal = Calendar.getInstance();
    cal.setTime(targetDate);
    cal.add(Calendar.DATE, targetDay);
    Date resultDate = cal.getTime();
    String tmpDate = sdf.format(resultDate);
    try {
      resultDate = sdf.parse(tmpDate);
    } catch (ParseException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
    return resultDate;

  }

}
