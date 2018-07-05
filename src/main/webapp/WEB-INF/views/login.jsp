<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>ログイン</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/library.css" />" rel="stylesheet">

</head>
<!-- パラメータ格納 start -->
<spring:message code="title.login.login" var="titleLogin" />
<spring:message code="label.id" var="labelId" />
<spring:message code="label.password" var="labelPassword" />
<spring:message code="label.login" var="labelLogin" />
<spring:message code="label.guest" var="labelGuest" />
<spring:message code="label.signup" var="labelSignup" />
<spring:message code="a0001" arguments="${labelId}" var="a0001Id" htmlEscape="true" />
<spring:message code="a0001" arguments="${labelPassword}" var="a0001Password" htmlEscape="true" />
<!-- パラメータ格納 end -->

<body>
 <div class="container">
  <div style="margin-top: 50px;">
   <div class="panel panel-primary">
    <div class="panel-heading">
     <h4>${titleLogin}</h4>
    </div>
    <div class="panel-body">
     <p style="color:red">${error}</p>
     <form:form modelAttribute="loginForm" action="/library/login/login" method="POST">
      <form:errors path="*" element="div" cssStyle="color:red;"/>
      <div class="form-group">
       <label for="InputEmail">${labelId}</label>
       <form:input class="form-control" path="mngUserId" placeholder="${a0001Id}" />
      </div>
      <div class="form-group">
       <label for="InputPassword">${labelPassword}</label>
       <form:input class="form-control" path="mngUserPass" type="password" placeholder="${a0001Password}" />
      </div>
      <input class="btn btn-primary" type="submit" name="submit" value="${labelLogin}" />
     </form:form>
     <div class="floatl-btn">
      <div class="guestLogin">
       <a href="/library/login/guest?guest=${labelGuest}">
        <button class="btn btn-success">${labelGuest}</button>
       </a>
      </div>
      <div class="signUp">
       <a href="/library/login/signup">
        <button class="btn btn-success">${labelSignup}</button>
       </a>
      </div>
     </div>
    </div>
   </div>
  </div>
 </div>
 <jsp:include page="common/footer.jsp"/>
</body>
</html>