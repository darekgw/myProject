<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@	taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c"%>
         <%@	page	isELIgnored="false"	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</p>Otrzymałeś ${points} puntów</p>
</br>
Prawidłowe odpowiedzi to: 
<table>
<tr><th>nr</th><th>difficulty</th><th>question</th><th>answer1</th><th>answer2</th><th>answer3</th>
<th>rightAnswer</th><th>used</th><th>pointsScored</th></tr>
<c:forEach var="quest" items="${answeredQuestions}">
<tr><td>${quest.no}</td><td>${quest.difficulty}</td><td>${quest.quest}</td><td>${quest.answer1}</td>
<td>${quest.answer2}</td><td>${quest.answer3}</td><td>${quest.rightAnswer}</td><td>${quest.used}</td></tr>
</c:forEach>
</table>
</body>
</html>