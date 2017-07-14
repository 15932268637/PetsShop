<%@ page contentType="text/html; charset=utf-8" %>


<%@ page import="java.util.*,mypack.*,my.*" %>



<html>
<head><title>TitleShoppingCart</title></head>

<body bgcolor="pink">
<style>
a{text-decoration:none}
</style>
<div align="center">
<%
 //HttpSession session=request.getSession(true);
session.getAttribute("cart");
	ShoppingCart cart=( ShoppingCart)session.getAttribute("cart");

 // if (request.getParameter("Clear") != null) {
 // cart.clear();
 
%>





<br>
<br>
<font size="6">您的购物车内的宠物有
</font><br>&nbsp;

<table>
<br>
<br>
<tr>

<th align=left><fond size="5">动物名</fond></th>
<th align=left><fond size="5">价格</fond></th>
<th align=left><fond size="5">数量</fond></th>
</tr>

<%
    Iterator i = cart.getItems().iterator();
    int o = 0;
    while (i.hasNext()) {
      //Pet item = (Pet)i.next();
      //Pet pet = (Pet)item.getItem();
     Pet pet1=(Pet)i.next();
    
    
     
      
%>


<tr>
<td bgcolor="#ffffaa">
<strong>
<%=pet1.getPname() %></strong>

</td>

<td bgcolor="#ffffaa" align="right">
<%=pet1.getPrice()%>
</td>


<td align="right" bgcolor="#ffffff">
<%=1%>
</td>

</tr>

<%
    // End of while
    o++;
}
%>



<tr>
<td colspan="2" align="right" bgcolor="#ffffff">总额(元)</td>
<td bgcolor="#ffffaa" align="right"><%=cart.getTotal()%></td>
<td><br></td>
</tr>

</table>

<p>&nbsp;<p>
<strong><a href="<%=request.getContextPath()%>/shouye1.jsp">&nbsp;<fond size=4>继续购物</fond></a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/cashier.jsp"><fond size=4>付账</fond></a>&nbsp;&nbsp;&nbsp;



</body>
</html>
