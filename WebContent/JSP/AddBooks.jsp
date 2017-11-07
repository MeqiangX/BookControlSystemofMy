<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

 <link rel="stylesheet"  type="text/css" href="../CSS/addbooks.css">
 
 <!-- WEB-INF目录下可以直接 文件名/访问 -->
   <script>
    function Ret(){
    	var f = document.forms[0];
    	if (confirm("确定返回主界面吗?")){
    		f.action = "../index.html";
    		f.submit();
    	}
    	else
    		return ;
    }
   </script>
 
<title>Insert title here</title>

</head>
<body>
<div class="d1">
    <table>
        <tr>
          <td><p>添加图书信息</p></td>
        </tr>
    </table>
</div>

<div class="d2">
    <form action="Servlet_Add" method="post">
        <table>
        <tr><td>编号：<input type="text" class="id" name="id"></td></tr>
        <tr><td>书名：<input type="text" class="name" name="name"></td></tr>
        <tr><td>价格：<input type="text" class="price" name="price"></td></tr>
        <tr><td>数量：<input type="text" class="bookCount" name="bookCount"></td></tr>
        <tr><td>作者：<input type="text" class="author" name="author"></td></tr>
        <tr><td><input type="submit" class="add" value="增加图书"></td></tr>
        <tr><td><input type="button" class="return" value="返回管理" onclick="Ret()"></td></tr>
        </table>
    </form>

</div>
</body>
</html>