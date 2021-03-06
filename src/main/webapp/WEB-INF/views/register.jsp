<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Game Shop</title>
	    <link rel="stylesheet" href="/css/lib/bootstrap.min.css">
	</head>
	<body>
		<jsp:include page="./partials/nav.jsp" flush="true"></jsp:include>
		<h1>회원가입</h1>
			<input type="hidden" id="_csrf" name="${_csrf.headerName}" value="${_csrf.token}" />
			<div class="container">
				<div class="input-group mb-3">
				  <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1">아이디</span>
				  </div>
				  <input type="text" id="user_id" name="user_id" class="form-control" placeholder="아이디를 입력하세요" aria-label="Username" aria-describedby="basic-addon1">
				</div>
				<div class="input-group mb-3">
				  <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1">비밀번호</span>
				  </div>
				  <input type="password" id="password" name="password" class="form-control" placeholder="비밀번호를 입력하세요" aria-label="Password" aria-describedby="basic-addon1">
				</div>
				<div class="input-group mb-3">
				  <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1">이름</span>
				  </div>
				  <input type="text" id="name" name="name" class="form-control" placeholder="이름을 입력하세요" aria-label="Name" aria-describedby="basic-addon1">
				</div>
				<div class="input-group mb-3">
				  <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1">생년월일</span>
				  </div>
				  <input type="date" id="birthday" name="birthday" class="form-control" placeholder="생년월일을 입력하세요" aria-label="Birthday" aria-describedby="basic-addon1">
				</div>
				<div class="input-group mb-3">
				  <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1">E-mail</span>
				  </div>
				  <input type="text" id="email" name="email" class="form-control" placeholder="E-mail을 입력하세요" aria-label="Email" aria-describedby="basic-addon1">
				</div>
				<div class="input-group mb-3">
				  <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1">전화번호</span>
				  </div>
				  <input type="text" id="phone" name="phone" class="form-control" placeholder="전화번호를 입력하세요" aria-label="Phone" aria-describedby="basic-addon1">
				</div>
			</div>
		<div style="text-align: center">
	        <button class="btn btn-secondary" data-dismiss="modal" id="btn-cancel">취소</button>
	        <button class="btn btn-primary" id="btn-save">완료</button>
        </div>
		<script src="/js/lib/jquery.min.js"></script>
		<script src="/js/lib/bootstrap.min.js"></script>
		
		<script src="/js/app/register.js"></script>
	</body>
</html>