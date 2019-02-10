<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
${msg}
<h1>Employee registration</h1>
<form:form action="reg" method="post">
    id: <input type="text" name="id"/><br>
    name:<input type="text" name="name"/><br>
    salary:<input type="text" name="salary"/><br>
    <input type="submit" value="register">

</form:form>
<a href="${pageContext.request.contextPath}/get">get details of emp</a>
<c:if test="${not empty empl}">
    <table border="1">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>salary</th>
            <th>edit</th>
            <th>delete</th>
        </tr>
        </thead>
        <c:choose>
            <c:when test="${not empty empl}">
                <c:forEach items="${empl}" var="emp">
                    <tbody>
                    <tr>
                        <td>${emp.id}</td>
                        <td>${emp.name}</td>
                        <td>${emp.salary}</td>

                        <td><a href="${pageContext.request.contextPath}/edit?id=${emp.id}">edit</a></td>
                        <td><a href="${pageContext.request.contextPath}/delete?id=${emp.id}">delete</a></td>

                    </tr>
                    </tbody>
                </c:forEach>
            </c:when>
        </c:choose>
    </table>
</c:if>
</body>
</html>