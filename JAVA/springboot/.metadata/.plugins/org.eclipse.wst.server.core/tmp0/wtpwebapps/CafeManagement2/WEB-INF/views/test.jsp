<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
function convertDateFormat(date) {
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    month = month >= 10 ? month : '0' + month;
    var day = date.getDate();
    day = day >= 10 ? day : '0' + day;
    return [year, month, day].join('-');
}

var date = new Date();
var convertedDate = convertDateFormat(new Date());
console.log(date);
console.log(convertedDate);		

</script>
</body>
</html>