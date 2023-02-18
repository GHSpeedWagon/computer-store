<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file='/WEB-INF/jsp/css/table_dark.css' %>
</style>
<html>
<head>
    <title>All computers</title>
</head>
<body>
<h1 class="table_dark">All computers:</h1>
<h1></h1>
<h2 class="table_dark">All PCs:</h2>
<table border="1" class="table_dark">
    <tr>
        <th>ID</th>
        <th>CPU</th>
        <th>GPU</th>
        <th>RAM</th>
        <th>memory</th>
        <th>mother board</th>
        <th>power unit</th>
        <th>price</th>
        <th>details</th>
        <th>Add to shopping cart</th>
    </tr>
    <c:forEach items="${pcs}" var="pc">
        <tr>
            <td>
                <c:out value="${pc.id}"/>
            </td>
            <td>
                <c:out value="${pc.cpu}"/>
            </td>
            <td>
                <c:out value="${pc.gpu}"/>
            </td>
            <td>
                <c:out value="${pc.ram}"/>
            </td>
            <td>
                <c:out value="${pc.memory}"/>
            </td>
            <td>
                <c:out value="${pc.motherBoard}"/>
            </td>
            <td>
                <c:out value="${pc.powerUnit}"/>
            </td>
            <td>
                <c:out value="${pc.details}"/>
            </td>
            <td>
                <c:out value="${pc.price}"/>
            </td>
            <td>
                <form action="http://localhost:8080/add-to-shopping-cart?type=pc&id=${pc.id}" method="post">
                    <input type="submit" value="Add to shopping cart">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<h1></h1>
<h2 class="table_dark">All laptops:</h2>
<table border="1" class="table_dark">
    <tr>
        <th>ID</th>
        <th>CPU</th>
        <th>GPU</th>
        <th>RAM</th>
        <th>memory</th>
        <th>mother board</th>
        <th>monitor resolution</th>
        <th>battery size</th>
        <th>price</th>
        <th>details</th>
        <th>Add to shopping cart</th>
    </tr>
    <c:forEach var="laptop" items="${laptops}">
        <tr>
            <td>
                <c:out value="${laptop.id}"/>
            </td>
            <td>
                <c:out value="${laptop.cpu}"/>
            </td>
            <td>
                <c:out value="${laptop.gpu}"/>
            </td>
            <td>
                <c:out value="${laptop.ram}"/>
            </td>
            <td>
                <c:out value="${laptop.memory}"/>
            </td>
            <td>
                <c:out value="${laptop.motherBoard}"/>
            </td>
            <td>
                <c:out value="${laptop.monitor}"/>
            </td>
            <td>
                <c:out value="${laptop.batterySize}"/>
            </td>
            <td>
                <c:out value="${laptop.details}"/>
            </td>
            <td>
                <c:out value="${laptop.price}"/>
            </td>
            <td>
                <form action="http://localhost:8080/add-to-shopping-cart?type=laptop&id=${laptop.id}" method="post">
                    <input type="submit" value="Add to shopping cart">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<h1></h1>
<h2 class="table_dark">All consoles:</h2>
<table border="1" class="table_dark">
    <tr>
        <th>ID</th>
        <th>CPU</th>
        <th>GPU</th>
        <th>RAM</th>
        <th>memory</th>
        <th>teraflops</th>
        <th>price</th>
        <th>details</th>
        <th>Add to shopping cart</th>
    </tr>
    <c:forEach var="console" items="${consoles}">
        <tr>
            <td>
                <c:out value="${console.id}"/>
            </td>
            <td>
                <c:out value="${console.cpu}"/>
            </td>
            <td>
                <c:out value="${console.gpu}"/>
            </td>
            <td>
                <c:out value="${console.ram}"/>
            </td>
            <td>
                <c:out value="${console.memory}"/>
            </td>
            <td>
                <c:out value="${console.teraflops}"/>
            </td>
            <td>
                <c:out value="${console.details}"/>
            </td>

            <td>
                <c:out value="${console.price}"/>
            </td>
            <td>
                <form action="http://localhost:8080/add-to-shopping-cart?type=console&id=${console.id}" method="post">
                    <input type="submit" value="Add to shopping cart">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
