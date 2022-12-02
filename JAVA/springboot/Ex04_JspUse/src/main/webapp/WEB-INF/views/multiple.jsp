<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Dan</title>
</head>
<body>
<form method='get' action='/multipleDan' id=frmGugu> 
숫자를 입력하시오:<input type=text name=Dan id=Dan><br>
<input type=submit value='구구단계산' name=btnSubmit id=btnSubmit>
<input type=reset value='비우기' name=btnReset id=btnReset>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>                                                //REST APT(주소창 정보 가리기)
$(document)												//							
.on('submit','#frmGugu', function(){					//
	document.location='/multipleDan/'+$('#Dan').val();	//
	return false;										//
})														//
</script>																			
</html>