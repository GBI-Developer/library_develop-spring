<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>メニュー</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/library.css" />" rel="stylesheet">

</head>
<!-- パラメータ格納 start -->
<spring:message code="label.guestMenu" var="labelGuestMenu" />
<spring:message code="label.managementMenu" var="labelManagementMenu" />
<spring:message code="title.userList.userList" var="titleUserList" />
<spring:message code="title.bookList.bookList" var="titleBookList" />
<spring:message code="label.guest" var="labelGuest" />
<spring:message code="label.signup" var="labelSignup" />
<!-- パラメータ格納 end -->

<body class="drawer drawer--left">
<jsp:include page="common/header.jsp"/>
 <div class="container">
  <div style="margin-top: 20px;">
   <div class="panel panel-primary">
    <c:if test="${user_name != 'ゲスト'}">
     <div class="panel-heading">
      <h4>${labelManagementMenu}</h4>
     </div>
     <div class="panel-body">
      <a href="/library/libraryentrance/userList"><button class="btn btn-primary">${titleUserList}</button></a>
      <a href="/library/libraryentrance/bookList?submit=${titleBookList}&access_user=${login}"><button class="btn btn-primary">${titleBookList}</button></a>
     </div>
    </c:if>
    <c:if test="${user_name == 'ゲスト'}">
     <div class="panel-heading">
      <h4>${labelGuestMenu}</h4>
     </div>
     <div class="panel-body">
      <a href="/library/libraryentrance/bookList?submit=${titleBookList}&access_user=${guest}"><button class="btn btn-primary">${titleBookList}</button></a>
     </div>
    </c:if>
   </div>
  </div>
 </div>
 <jsp:include page="common/footer.jsp"/>
</body>
</html>