<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Module A Output</title>
</head>
<body>
    <h1>Module A Output</h1>
    <ul>
        <c:forEach items="${ params }" var="entry">
            <li><c:out value="${ entry.key }"></c:out>=<c:out value="${ entry.value[0] }"></c:out></li>
        </c:forEach>
    </ul>
</body>
</html>