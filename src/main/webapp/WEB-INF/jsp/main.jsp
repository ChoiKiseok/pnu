<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>메인화면</title>
</head>
<body>
  <h1>[<c:out value="${USER.name}"></c:out>]님 반갑습니다.</h1>
  <h1>id : <c:out value="${USER.userId}"></c:out></h1>
  <h1>deptNm : <c:out value="${USER.deptNm}"></c:out></h1>
  <h1>email : <c:out value="${USER.email}"></c:out></h1>
  <h1>job: <c:out value="${USER.job}"></c:out></h1>
  <h1>phone: <c:out value="${USER.phone}"></c:out></h1>

  <button type="button" onclick="window.location='logout'">로그아웃</button>
</body>
</html>