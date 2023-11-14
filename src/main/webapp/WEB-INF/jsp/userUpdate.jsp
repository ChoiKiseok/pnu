<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보 수정</title>
</head>
<body>
	<form action="userUpdate" method="post" id="userUpdateForm">
		<table>
			<thead>
				<tr>
					<th colspan="2">회원정보 수정</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>아이디*</th>
					<td><input type="text" value="${USER.userId}" name="userId" required="required" readonly/></td>
				</tr>
				<tr>
					<th>비밀번호*</th>
					<td><input type="password" name="pwd" id="pwdInput" required="required" onchange="vaildatePwd()"/></td>
				</tr>
				<tr>
					<th>비밀번호 확인*</th>
					<td><input type="password" id="pwdCheckInput" required="required" onchange="vaildatePwd()"/></td>
				</tr>
				<tr>
					<th>이름*</th>
					<td><input type="text" value="${USER.name}" name="name" required="required"/></td>
				</tr>
				<tr>
					<th>부서*</th>
					<td>
						<select name="deptCd" required="required">
                            <c:forEach items="${dept}" var="item">
                                <c:choose>
                                    <c:when test="${USER.deptCd eq item.deptCd}">
                                        <option value="${item.deptCd}" selected>${item.deptNm}</option>
                                    </c:when>
                                    <c:otherwise>
                                        <option value="${item.deptCd}">${item.deptNm}</option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<th>직급</th>
					<td><input type="text" value="${USER.job}" name="job"/></td>
				</tr>
				<tr>
					<th>연락처</th>
					<td><input type="text" value="${USER.email}" name="phone"/></td>
				</tr>
				<tr>
					<th>메일</th>
					<td><input type="text" value="${USER.phone}" name="email"/></td>
				</tr>
			</tbody>
		</table>
		
		<button type="button" onclick="window.history.back()">이전</button>
		<button type="submit">수정</button>
		<button type="button" id="deleteBtn" onclick="userDelete()">회원 탈퇴</button>
	</form>
</body>

<script src="https://code.jquery.com/jquery-3.6.1.js"></script>
<script>

    function vaildatePwd() {
        var pwd = $("#pwdInput");
        var pwdCheck = $("#pwdCheckInput");

        if(pwd.val() != pwdCheck.val()) {
            pwdCheck[0].setCustomValidity("비밀번호가 일치하지 않습니다.");
        } else {
            pwdCheck[0].setCustomValidity("");
        }
    }

    function userDelete() {
        if(confirm("회원탈퇴하시겠습니까?")){
            window.location.href="userDelete";
        } else {
            return;
        }
    }
	
	// window.onload = function(){
		
	// 	$("#okBtn").click(function() {
	// 		var pwd = $("#pwdInput").val();
	// 		var pwdCheck = $("#pwdCheckInput").val();
			
	// 		if(pwd == pwdCheck){
	// 			$("#signUpForm").submit();
	// 		} else {
	// 			alert("비밀번호를 확인해주세요.");
	// 		}
	// 	});
	// } 
	
</script>
</html>