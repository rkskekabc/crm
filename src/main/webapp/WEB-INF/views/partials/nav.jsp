<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Game Shop</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li id="navHomeItem" class="nav-item">
        <a class="nav-link" href="/">홈 </a>
      </li>
      <li id="navListItem" class="nav-item">
        <a class="nav-link" href="/gameList">게임 목록 </a>
      </li>
      <li id="navCommentItem" class="nav-item">
        <a class="nav-link" href="#">평가 </a>
      </li>
    </ul>
    <sec:authorize access="isAnonymous()">
	    <a class="btn btn-success" href="/login" role="button">로그인</a>
	    &nbsp;
	    <a class="btn btn-success" href="/register" role="button">회원가입</a>
    </sec:authorize>
    <sec:authorize access="isAuthenticated()">
	    <sec:authentication property="principal.name"/> 님 안녕하세요
    	<input type="hidden" id="member_id" name="member_id" value='<sec:authentication property="principal.id"/>' />
    </sec:authorize>
  </div>
  <br/>
  <br/>
</nav>