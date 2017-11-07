<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../CSS/FindBooks.css">
<title>Insert title here</title>
</head>
<body>

<div class="d1">
    <table>
        <tr>
            <th>查询书籍</th>
        </tr>
    </table>
</div>


<div class="d2">
    <form action="Servlet_Search" method="post">
        请输入要查找的书名：<input type="text" class="text" name="name">
        <input type="reset" class="clear" value="清除">
        <input type="submit" class="search" value="搜索">
    </form>
</div>

<div class="d3">
    <a href="../index.html">返回图书管理界面</a>
</div>


</body>
</html>