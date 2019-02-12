<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link rel="stylesheet" href="/css/app/loginForm.css">
</head>
<body>
	<div class="login">
		<h1>Login</h1>
	    <form method="post">
			<input type="hidden" id="_csrf" name="${_csrf.parameterName}" value="${_csrf.token}" />
	    	<input type="text" name="username" placeholder="Username" required="required" />
	        <input type="password" name="password" placeholder="Password" required="required" />
	        <button type="submit" class="btn btn-primary btn-block btn-large">로그인</button>
	    </form>
	</div>
</body>
</html>