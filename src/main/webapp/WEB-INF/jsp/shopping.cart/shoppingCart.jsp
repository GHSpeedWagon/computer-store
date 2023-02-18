<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    <%@include file='/WEB-INF/jsp/css/table_dark.css' %>
</style>
<head>
    <title>Shopping Cart</title>
</head>
<body>
    <h1 lass="table_dark">Your shopping cart</h1>
    <h4 lass="table_dark">${message}</h4>
    <tr><td><form action="${pageContext.request.contextPath}/index" method="get">
        <input type="submit" value="menu">
    </form></td></tr>
</body>
</html>
