<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file='css/table_dark.css' %>
</style>
<html>
<head>
    <title>Computer store</title>
</head>
<body>
<form method="post" id="redirect"></form>
<h1 class="table_dark">Computer store</h1>
<table class="table_dark">
    <tr>
        <th>Redirect to</th>
    </tr>

    <tr><td><form action="${pageContext.request.contextPath}/computers" method="get">
        <input type="submit" value="shop">
    </form></td></tr>
    <tr><td><form action="${pageContext.request.contextPath}/shoppingCart" method="get">
        <input type="submit" value="shopping cart">
    </form></td></tr>
</table>
</body>
</html>
