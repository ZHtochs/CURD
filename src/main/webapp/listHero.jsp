<%--
  Created by IntelliJ IDEA.
  User: zhuhe
  Date: 2018/9/11/0011
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
<table class="table table-striped table-bordered table-hover  table-condensed"
       style="width: 500px;margin: 0 auto;">
    <thead>
    <th>id</th>
    <th>name</th>
    <th>hp</th>
    <th>damage</th>
    <th>edit</th>
    <th>delete</th>
    </thead>
    <tbody>
    <c:forEach items="${heros}" var="hero" varStatus="st">
        <tr>
            <td>${hero.id}</td>
            <td>${hero.name}</td>
            <td>${hero.hp}</td>
            <td>${hero.damage}</td>
            <td><a href="editHero?id=${hero.id}">edit</a></td>
            <td><a href="deleteHero?id=${hero.id}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<nav>
    <ul class="pager">

        <li><a href="?start=0">首 页</a></li>
        <li><a href="?start=${pre}">上一页</a></li>
        <li><a href="?start=${next}">下一页</a></li>
        <li><a href="?start=${last}">末 页</a></li>
    </ul>
</nav>

当前 在线人数 ： ${online_number}
</body>
</html>
