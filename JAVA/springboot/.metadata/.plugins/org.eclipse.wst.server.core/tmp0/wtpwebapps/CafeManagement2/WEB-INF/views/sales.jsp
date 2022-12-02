<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table style='width:100%; border:1px solid green;'>
	<tr><td style='width:33%; text-align:center'><a href='/menu'><h3>메뉴관리</h3></a></td>
		<td style='width:33%; text-align:center'><a href='/order'><h3>주문관리</h3></a></td>
		<td style='width:33%; text-align:center'><h3>실적관리</h3></a></td>
	</tr>
</table>
<table style='text-align:center;' align=center>
	<tr>
		<td><input type=date id=start>&nbsp;~&nbsp;<input type=date id=end>
			&nbsp;<input type=button id=btnFind value='찾기'>
		</td>
	</tr>
	<tr>
		<td style='vertical-align:top'>
			<select id=selSales size=20 style='width:240px;'></select></td>
	</tr>
	<tr>
		<td>매출액<input type=number id=outgo>원
	</tr>	
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	getList();
})
$(function(){
	$('#start').val(),

});
.on('click','#btnFind',function(){   
	return false;
	
})			

</script>
</html>