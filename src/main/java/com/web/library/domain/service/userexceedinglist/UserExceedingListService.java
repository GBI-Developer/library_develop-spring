/**
 * @date 2018/05/22
 * @class: LoginService.java
 * @discription:
 *
 */
package com.web.library.domain.service.userexceedinglist;

import java.io.IOException;

/**
 * @作成日 2018/02/04
 * @ファイル名 LoginService.java
 * @description 超過者一覧情報インターフェース.
 */
public interface UserExceedingListService {

  /**
   * @method: LibraryEntranceService
   * @discription: 超過者一覧情報取得処理
   * @projectPass: library_web.com.web.library.domain.service.libraryentrance.LibraryEntranceService.java
   * @return List<TUserInfo>
   * @throws IOException
   */
  String getUserExceedingList() throws IOException;

  /**
   * @method: LibraryEntranceService
   * @discription: 超過図書一覧情報取得処理
   * @projectPass: library_web.com.web.library.domain.service.libraryentrance.LibraryEntranceService.java
   * @return String
   * @throws IOException
   */
  String getBookExceedingList() throws IOException;
}
