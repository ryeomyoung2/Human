<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CreatePage</title>
</head>
<body>
<form action="/create">
작성자: <input type=text name=writer value="${dto.writer}"><br>
내용: <input type=text name=content value="${dto.content}"><br>
<input type=submit value="전송">
</form>
</body>
</html>
