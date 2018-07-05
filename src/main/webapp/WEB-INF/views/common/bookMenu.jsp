<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<spring:message code="title.login.login" var="titleLogin" />
  <div class="menu">
   <a href="/library/libraryentrance/bookList"><button  id="active1" class="btn btn-primary">図書一覧</button></a>
   <a href="/library/booklendinglist/bookLendingList"><button  id="active2" class="btn btn-primary lendChange">図書貸出</button></a>
   <a href="/library/bookMenu/bookList?submit=${user_list}&access_user=${login}"><button id="active3" class="btn btn-primary">貸出中一覧</button></a>
   <a href="/library/bookMenu/bookList?submit=${user_list}&access_user=${login}"><button id="active4" class="btn btn-primary">ブックランキング</button></a>
   <a href="/library/bookMenu/bookList?submit=${user_list}&access_user=${login}"><button id="active5" class="btn btn-primary">図書登録</button></a>
   <a href="/library/bookMenu/bookList?submit=${user_list}&access_user=${login}"><button id="active6" class="btn btn-primary deleteChange">図書削除</button></a>
  </div>
  <p></p>
  <p style="border-bottom: medium solid #337ab7;"></p>