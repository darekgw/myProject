<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@	taglib	prefix="form"
				uri="http://www.springframework.org/tags/form"	%>
				 <%@	taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c"%>
         <%@	page	isELIgnored="false"	%>
				
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

${question}


<form	method="post">
${answer1}
<input type="radio" name="answer" value="${answer1}">
</br>
${answer2}
<input type="radio" name="answer" value="${answer2}">
</br>
${answer3}
<input type="radio" name="answer" value="${answer3}">
</br>
<input	type="submit"	value="Save">
</form>

</body>
</html>