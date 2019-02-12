<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Game List</title>
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
					<th scope="col">가격</th>
					<th scope="col">발매일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${games}" var="game">
					<tr>
						<th scope="row"><a href="/gameList/${game.id}">${game.name}</a></th>
						<td>${game.genre}</td>
						<td>${game.price}</td>
						<td>${game.release_date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="col-md-12">
	        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#savePostsModal">게임 등록</button>
	    </div>
		
		<div class="modal fade" id="savePostsModal" tabindex="-1" role="dialog" aria-labelledby="savePostsLabel" aria-hidden="true">
	        <div class="modal-dialog" role="document">
	            <div class="modal-content">
	                <div class="modal-header">
	                    <h5 class="modal-title" id="savePostsLabel">게임 등록</h5>
	                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	                        <span aria-hidden="true">&times;</span>
	                    </button>
	                </div>
	                <div class="modal-body">
	                    <form>
	                        <div class="form-group">
	                            <label for="name">게임 이름</label>
	                            <input type="text" class="form-control" id="name" placeholder="이름을 입력하세요" />
	                        </div>
	                        <div class="form-group">
	                            <label for="genre"> 장르 </label>
	                            <input type="text" class="form-control" id="genre" placeholder="장르를 입력하세요" />
	                        </div>
	                        <div class="form-group">
	                            <label for="release_date"> 발매일 </label>
	                            <input type="date" class="form-control" id="release_date" />
	                        </div>
	                        <div class="form-group">
	                            <label for="price"> 판매가격 </label>
	                            <input type="text" class="form-control" id="price" placeholder="판매가격을 입력하세요" />
	                        </div>
	                        <div class="form-group">
	                            <label for="description"> 게임설명 </label>
	                            <textarea class="form-control" id="description" placeholder="설명을 입력하세요"></textarea>
	                        </div>
	                    </form>
	                </div>
	                <div class="modal-footer">
	                    <button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
	                    <button type="button" class="btn btn-primary" id="btn-save">등록</button>
	                </div>
	            </div>
	        </div>
	    </div>
		<script src="/js/lib/jquery.min.js"></script>
		<script src="/js/lib/bootstrap.min.js"></script>
	
		<script src="/js/app/gameList.js"></script>
	</body>
</html>