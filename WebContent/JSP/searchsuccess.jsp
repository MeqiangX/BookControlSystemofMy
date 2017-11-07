<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css"  href="../CSS/AllBooks.css">
<title>Insert title here</title>
</head>
<body>



<div class="d1">
    <table>
        <tr class="tr1">
            <th colspan="8">所有图书信息</th>
        </tr>


        <tr class="tr2">
            <td>编号</td>
            <td colspan="2">图书名称</td>
            <td>价格</td>
            <td>数量</td>
            <td>作者</td>
            <td colspan="2">选择操作</td>

        </tr>
        
     
             <tr class="tr2">
            <td>${Book.getId() }</td>
            <td colspan="2">${Book.getName() }</td>
           <td>${Book.getPrice() }</td>
             <td>${Book.getBookCount() }</td>
            <td>${Book.getAuthor() }</td>
           <td colspan="2"><a href="">删除</a></td>
             </tr>
    
       
         
       
     
    </table>
</div>

<div class="d2">
    <p><a href="index.html">返回图书管理界面</a></p>
</div>
</body>
</html>