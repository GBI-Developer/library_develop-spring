<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<spring:message code="title.login.login" var="titleLogin" />
  <div class="menu">
   <a href="/library/libraryentrance/userList?submit=${user_list}&access_user=${login}"><button id="active1" class="btn btn-primary">ユーザ一覧</button></a>
   <a href="/library/userexceedinglist/userExceedingList?submit=${user_list}&access_user=${login}"><button id="active2" class="btn btn-primary">貸出超過者一覧</button></a>
   <a href="/library/userMenu/userList?submit=${user_list}&access_user=${login}"><button id="active3" class="btn btn-primary">ユーザランキング</button></a>
   <a href="/library/userMenu/userList?submit=${user_list}&access_user=${login}"><button id="active4" class="btn btn-primary">ユーザ登録</button></a>
   <a href="/library/userMenu/userList?submit=${user_list}&access_user=${login}"><button id="active5" class="btn btn-primary deleteChange">ユーザ削除</button></a>
  </div>
  <p></p>
  <p style="border-bottom: medium solid #337ab7;"></p>