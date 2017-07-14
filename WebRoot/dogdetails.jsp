<%@ page contentType="text/html; charset=GB2312" %>
<%@ include file="common.jsp" %>
<%@ page import="java.util.List,my.Pet,my.Dog" %>
<%! 	List <Dog>dogs=null;
		Dog dog=null;
		String[] table_dog=new String[4];
		int pid = 0;
%>


<html>
<head><title>TitleBookDescription</title></head>
<body  bgcolor="pink">

<table>

<%
				dogs=(List)request.getAttribute("value");
				int count_dogs=dogs.size();
				//table_dog[3]=dog.getPhoto();
				
				for (int i=0;i<count_dogs;i++)
				{
					dog=dogs.get(i);
					table_dog[0]=dog.getPname();
					table_dog[1]=dog.getAbility();
					table_dog[2]=dog.getPrice();
					table_dog[3]=dog.getPlace();
					pid = dog.getPid();
			
			%>
<tr>
<td><img src="<%=request.getContextPath()%><%=dog.getPhoto()%>" style="height: 202px; width: 182px"/></td>
<td>名字：<%=table_dog[0]%></td>
<td>能力：<%=table_dog[1]%></td>
<td>价格（元）：<%=table_dog[2]%></td>
<td>产地：<%=table_dog[3]%></td>


<td>
		       
		        
		        	<form name=dogsForm method= POST  action=ShopServlet>
  			    		<input type=hidden name=pid value= <%=dog.getPid()%>>
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