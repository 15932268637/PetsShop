<%@ page contentType="text/html; charset=gb2312" %>
<%@ include file="common.jsp" %>
<%@ page import="java.util.List,my.Pet,my.Cat" %>
<%! 	List <Cat>cats=null;
		Cat cat=null;
		String[] table_cat=new String[4];
		int pid = 0;
%>


<html>
<head><title>TitleBookDescription</title></head>
<body bgcolor="pink">

<table>

<%
				cats=(List)request.getAttribute("value");
				int count_dogs=cats.size();
				//table_dog[3]=dog.getPhoto();
				
				for (int i=0;i<count_dogs;i++)
				{
					cat=cats.get(i);
					table_cat[0]=cat.getPname();
					table_cat[1]=cat.getAbility();
					table_cat[2]=cat.getPrice();
					table_cat[3]=cat.getPlace();
					pid = cat.getPid();
			
			%>
<tr>
<td><img src="<%=request.getContextPath()%><%=cat.getPhoto()%>" style="height: 202px; width: 182px"/></td>
<td>名字：<%=table_cat[0]%></td>
<td>能力：<%=table_cat[1]%></td>
<td>价格（元）：<%=table_cat[2]%></td>
<td>产地：<%=table_cat[3]%></td>


<td>
		       
		        
		        	<form name=dogsForm method= POST  action=ShopServlet>
  			    		<input type=hidden name=pid value= <%=cat.getPid()%>>
                         <input type=submit name=button_dog value=加入购物车>
		        	</form >
  			    </td>
			</tr>
<% 
				} 
			%> 
			</table>
</body>
</html>