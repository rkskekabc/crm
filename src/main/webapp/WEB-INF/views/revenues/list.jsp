<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Revenue List</title>
	    <link rel="stylesheet" href="/css/lib/bootstrap.min.css">
	</head>
	<body>
		<jsp:include page="../partials/nav.jsp" flush="true"></jsp:include>
		<h1>목록</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">게임명</th>
					<th scope="col">장르</th>
					<th scope="col">판매일</th>
					<th scope="col">판매가격</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${revenues}" var="revenue">
					<tr>
						<th scope="row">${revenue.games.name}</a></th>
						<td>${revenue.games.genre}}</td>
						<td>${revenue.sell_date}</td>
						<td>${revenue.sell_price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<script src="/js/lib/jquery.min.js"></script>
		<script src="/js/lib/bootstrap.min.js"></script>
	
		<script src="/js/app/gameList.js"></script>
	</body>
</html>