<%--
  Created by IntelliJ IDEA.
  User: zhuhe
  Date: 2018/9/11/0011
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<form action="updateHero" method="post">
    名字：<input type="text" name="name" value="${hero.name}"><br>
    血量 ：<input type='text' name='hp' value='${hero.hp}'> <br>
    伤害： <input type='text' name='damage' value='${hero.damage}'> <br>
    <input type='hidden' name='id' value='${hero.id}'>
    <input type='submit' value='更新'>
</form>
</body>
</html>
