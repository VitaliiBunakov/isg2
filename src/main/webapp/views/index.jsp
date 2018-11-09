<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Vitalii
  Date: 09.11.2018
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:forEach items="${AllAuthors}" var="u">
    <p>${u.name}--${u.id}--${u.posted} </p>

</c:forEach>

</body>
</html>
