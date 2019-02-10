<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Update Employee</h1>
<form:form action="update" method="post">
    id: <input type="text" name="id" value="${empl.id}"/><br>
    name:<input type="text" name="name" value="${empl.name}"/><br>
    salary:<input type="text" name="salary" value="${empl.salary}"/><br>
    <input type="submit" value="register">

</form:form>
</body>
</html>