<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>로그인화면</title>
</head>
<body>
로그인화면
<br />



<form method=post action='dologin' >
	로그인아이디:<input type="text" name="loginid" required ><br />
	비밀번호:<input type="password" name="passcode" required ><br />
	<input type="submit" value="로그인"><br />
	<input type=reset value='비우기' name=btnReset id=btnReset>
</form>
<button onclick="location='signon'">회원가입</button>


</body>
</html>