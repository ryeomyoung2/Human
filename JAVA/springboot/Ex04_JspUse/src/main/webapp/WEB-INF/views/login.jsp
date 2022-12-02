<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form method='post' action='/checkUser'> <!--메소드가 get이면 보낸 데이터가 주소창에 보이고 post방식으로 하면 안보임-->
로그인아이디:<input type=text name=loginid id=loginid><br>
비밀번호:<input type=password name=passcode id=passcode><br>
<input type=submit value='전송' name=btnSubmit id=btnSubmit>
&nbsp;&nbsp;
<input type=reset value='비우기' name=btnReset id=btnReset>
</form>
</body>
</html>  --%> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
로그인아이디:<input type=text name=loginid id=loginid><br>
비밀번호:<input type=password name=passcode id=passcode><br>
<input type=button value='전송' name=btnSubmit id=btnSubmit>
&nbsp;&nbsp;
<input type=reset value='비우기' name=btnReset id=btnReset>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnSubmit',function(){
	if( $('#loginid').val()!='' && $('#passcode').val()!=''){
		let url='/checkUser?loginid='+$('#loginid').val()+
				'&passcode='+$('#passcode').val();
		document.location=url;
	} else {
		alert('로그인아이디 또는 비밀번호가 입력되지 않았습니다.');
		return false;
	}	
})
</script>
</html>  


