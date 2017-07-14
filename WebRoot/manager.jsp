<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  <form name="Mform2" method="POST" action="manager2">
  <div align="left">
  			<b>你好，管理员<%= request.getAttribute("value") %></b>
  	</div>
  	<style type="text/css">  
table.hovertable {  
    font-family: verdana,arial,sans-serif;  
    font-size:11px;  
    color:#333333;  
    border-width: 1px;  
    border-color: #999999;  
    border-collapse: collapse; }  
table.hovertable th {  
    background-color:#c3dde0;  
    border-width: 1px;  
    padding: 8px;  
    border-style: solid;  
    border-color: #a9c6c9; }  
table.hovertable tr {  
    background-color:#d4e3e5; }  
table.hovertable td {  
    border-width: 1px;  
    padding: 8px;  
    border-style: solid;  
    border-color: #a9c6c9; }  
</style>  
  
<!-- Table goes in the document BODY -->  
<table class="hovertable">  
  
<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">  
    <td>分配管理员账号：</td><td>用户名:</td><td><input type="text" name="username" style="width: 102px; "></td><td align="right">账号:</td>
    
        <td><input type="text" name="userid" style="width: 102px; "></td>
        <td align="right">密&nbsp; 码:</td>
        <td><input type="password" name="userpassword" style="width: 102px; "></td>
</tr>  
<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">  
   <td> </td>
        <td><div align="right">邮箱:</div></td>
        <td><input type="text" name="useremail" style="width: 102px; "></td>
        <td><select name="type"> 
		<option value="1">管理员</option>
		</select> </td>
		<td><input type="submit" name="fenpei" value="分配" style="width: 66px; "></td></tr>
</tr>  
<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">  
    <td>删除宠物：</td><td>编号：</td><td><input type="text" name="ppid" style="width:102px;"></td><td>
    	<input type="submit" name="dele" value="删除" style="width: 66px;"></td>  
</tr>  
</table>
</form>
<form name="uploadForm" method="POST" enctype="MULTIPART/FORM-DATA" action="manager">
    <table class="hovertable">
<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">  
    <td>增加宠物：</td><td>编号：</td><td><input type="text" id="pid" name="pid" style="width: 102px;"></td> <td>名字：</td><td><input type="text" id="pname" name="pname" style="width: 102px;"></td><td>类型：</td><td><input type="text" id="ptype" name="ptype" style="width: 102px;"></td> 
</tr>  
<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">  
   <td></td> <td>价格：</td><td><input type="text" id="pprice" name="pprice" style="width: 102px;"></td><td>出生日期：</td> <td><input type="text" id="pbirth" name="pbirth" style="width: 102px;"></td><td>产地：</td><td><input type="text" id="pplace" name="pplace" style="width: 102px; "></td>
</tr>  
<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">  
   <td></td> <td>大小：</td><td><input type="text" id="pda" name="pda" style="width: 102px;"></td><td>特殊能力：</td> <td><input type="text" id="pneng" name="pneng" style="width: 102px;"></td><td>照片：</td><td><input type="file" id="pho" name="pho" style="width: 102px; "></td>
</tr>
<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">  
 <td><input type="submit" name="add1" value="添加" style="width: 66px;"></td><td><input type="reset" name="reset" value="重置"style="width: 66px;"></td>
</tr>
</table>
  
    </form>
  
    
  </body>
</html>
