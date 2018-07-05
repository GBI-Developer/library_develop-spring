/**
 * @date 2018/05/22
 * @class: LoginService.java
 * @discription:
 *
 */
package com.web.library.domain.service.libraryentrance;

import java.io.IOException;

/**
 * @作成日 2018/02/04
 * @ファイル名 LibraryEntranceService.java
 * @description LibraryEntranceServiceインターフェース.
 */
public interface LibraryEntranceService {

  /**
   * @method: getUserList
   * @discription: ユーザ一覧情報取得処理
   * @projectPass: library_web.com.web.library.domain.service.libraryentrance.LibraryEntranceService.java
   * @return String
   * @throws IOException
   */
  String getUserList() throws IOException;

  /**
   * @method: getBookList
   * @discription: 図書一覧情報取得処理
   * @projectPass: library_web.com.web.library.domain.service.libraryentrance.LibraryEntranceService.java
   * @return String
   * @throws IOException
   */
  String getBookList() throws IOException;
}
