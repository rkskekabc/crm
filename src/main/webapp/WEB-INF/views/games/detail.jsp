<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Game Detail</title>
	    <link rel="stylesheet" href="/css/lib/bootstrap.min.css">
	</head>
	<body>
		<jsp:include page="../partials/nav.jsp" flush="true"></jsp:include>
		<input type="hidden" id="game_id" value="${game.id}" />
		<input type="hidden" id="sell_price" value="${game.price}" />
		<div class="jumbotron">
		  <h1 class="display-4">${game.name}</h1>
		  <hr class="my-4">
		  <p>장르 : ${game.genre}</p>
		  <p>가격 : ${game.price}</p>
		  <p>발매일 : ${game.release_date}</p>
		  <p>설명 : ${game.description}</p>
		  <button type="button" class="btn btn-primary" id="btn-buy">구매</button>
		</div>
		
		<script src="/js/lib/jquery.min.js"></script>
    	<script src="/js/lib/bootstrap.min.js"></script>
    	
    	<script src="/js/app/gameDetail.js"></script>
	</body>
</html>