<%@ page contentType="text/html; charset=utf-8" %>

<%@ include file="common.jsp" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="cart" scope="session" class="mypack.ShoppingCart"/>

<%
    // Payment received -- invalidate the session
   session.invalidate();
%>
<html>
<head><title>TitleReceipt</title>

</head>

<body bgcolor="pink">
<style >
/*去除文字超链接下划线*/
	a{ text-decoration:none} 
</style>
<h3 align="center">结算成功，谢谢您光临七彩鱼宠物商店。</h3><br>	
<div align="center">
 <a href="<%=request.getContextPath()%>/shouye1.jsp">
 	<button id=backmain type="button" top:82x;text-gcenter">继续购物</button>
 </a></div>
 </body></html>
