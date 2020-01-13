<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<body>
<a href="${pageContext.request.contextPath}/account/findAll">查询全部</a><br>
<form action="${pageContext.request.contextPath}/account/save" method="post">
    name：<input name="name" type="text"/><br>
    money：<input name="money" type="text"/>(只允许输入数字)<br>
    <button type="submit" value="提交">提交</button>
</form>
</body>
</html>
