<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  <title>회원가입</title>
</head>
<body style="
position: absolute;
height: 100%;
max-height: 1200px;
min-height: 500px;
width: 100%;
">
  <div style="
  position: relative;
  width: 100%;
  max-width: 350px;
  top: 30%;
  left: 44%;
  background: #dbd8d3;
  padding: 25px;
  border: 1px solid;
">
    <form method="post" action="/user/insert">
      <div class="mb-3">
        <label for="userId" class="form-label">Email address</label>
        <input type="email" class="form-control" id="userId" name="userId" aria-describedby="emailHelp">
      </div>
      <div class="mb-3">
        <label for="userPwd" class="form-label">Password</label>
        <input type="password" class="form-control" name="userPwd" id="userPwd">
      </div>
      <div class="mb-3">
        <label for="userName" class="form-label">Name</label>
        <input type="text" class="form-control" name="userNm" id="userName">
      </div>
      <div class="mb-3">
        <label for="tel" class="form-label">Tel.</label>
        <input type="tel" class="form-control" name="tel" id="tel">
      </div>
      <button type="submit" class="btn btn-primary">SignUp</button>
    </form>
  </div>
</body>
</html>