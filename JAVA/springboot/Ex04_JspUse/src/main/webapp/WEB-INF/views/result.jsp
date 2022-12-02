<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 계산결과</title>
</head>
<body>

${Dan}단 결과:<br>${result2}
<!--
<script>
    for (j = 1; j < 10; j++) {
        document.write(${Dan} + " X " + j + " = " + (${Dan} * j) + "<br>");
    }

</script>
-->
</body>
</html>