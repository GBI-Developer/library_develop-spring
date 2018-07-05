<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- パラメータ格納 start -->
<spring:message code="title.login.login" var="titleLogin" />
<spring:message code="label.logout" var="labelLogout" />
<!-- パラメータ格納 end -->
<c:if test="${user_name != null}">
 <header>
  <div class="container" style="margin-top: 10px">
   <div style="float: left;">
    <h4>${titleLogin}</h4>
   </div>
   <div style="float: right;">
    <p>「<a href="#" >${user_name}</a>」でログイン中です
    <a href="/library/login/logout">
      <button class="btn btn-success logout">${labelLogout}</button>
     </a>
    </p>
   </div>
  </div>
 </header>
</c:if>