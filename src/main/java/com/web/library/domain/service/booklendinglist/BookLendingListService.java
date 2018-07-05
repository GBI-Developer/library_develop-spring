/**
 * @date 2018/05/22
 * @class: LoginService.java
 * @discription:
 *
 */
package com.web.library.domain.service.booklendinglist;

import java.io.IOException;

/**
 * @作成日 2018/02/04
 * @ファイル名 LoginService.java
 * @description 図書貸出一覧情報インターフェース.
 */
public interface BookLendingListService {

  /**
   * @method: LibraryEntranceService
   * @discription: 図書一覧情報取得処理
   * @projectPass: library_web.com.web.library.domain.service.libraryentrance.LibraryEntranceService.java
   * @return String
   * @throws IOException
   */
  String getBookList() throws IOException;

  /**
   * @method: LibraryEntranceService
   * @discription: ユーザ一覧情報取得処理
   * @projectPass: library_web.com.web.library.domain.service.libraryentrance.LibraryEntranceService.java
   * @return String
   * @throws IOException
   */
  String getUserList() throws IOException;

  /**
   * @method: LibraryEntranceService
   * @discription: チェックした図書一覧を取得処理
   * @projectPass: library_web.com.web.library.domain.service.libraryentrance.LibraryEntranceService.java
   * @return String
   * @throws IOException
   */
  String getCheckedBooksList(String[] list) throws IOException;


  /**
   * @method: BookLendingListService
   * @discription: 図書の貸出登録処理
   * @projectPass: library_web.com.web.library.domain.service.booklendinglist.BookLendingListService.java
   * @param userId
   * @param bookId
   * @param mngUserId
   * @param mngUserName
   * @return int
   * @throws IOException
   */
  int lendRegist(String userId, String bookId, String mngUserId, String mngUserName) throws IOException;

}
