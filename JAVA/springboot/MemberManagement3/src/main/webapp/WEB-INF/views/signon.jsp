<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>회원가입창</title>
</head>
<body>
회원가입창
<br />


<form method=post action='dosign' >
	로그인아이디:<input type="text" name="loginid" required ><br />
	비밀번호:<input type="password" name="passcode" required ><br />
	비밀번호확인:<input type="password" name="passcode2" required ><br />
	이름:<input type="text" name="name" required ><br />
	모바일:<input type="text" name="mobile" required ><br />
	<input type="submit" value="등록"><br />
	<input type=reset value='비우기' name=btnReset id=btnReset>
</form>


</body>
</html>