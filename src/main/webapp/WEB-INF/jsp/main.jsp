<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Main Page</title>
</head>
<body>
  <h1>[<c:out value="${USER.name}"></c:out>]님 반갑습니다.</h1>
  <h1>id : <c:out value="${USER.userId}"></c:out></h1>
  <h1>deptNm : <c:out value="${USER.deptNm}"></c:out></h1>
  <h1>email : <c:out value="${USER.email}"></c:out></h1>
  <h1>job: <c:out value="${USER.job}"></c:out></h1>
  <h1>phone: <c:out value="${USER.phone}"></c:out></h1>

  <button type="button" onclick="window.location='logout'">로그아웃</button>
  <button type="button" onclick="window.location='userUpdatePage'">회원정보 수정</button>
  <button type="button" onclick="window.location='boardListPage'">게시판</button>
</body>
</html>