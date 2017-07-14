<%@ page import="mypack.*" %>
<%@ page import="java.util.Properties" %>
<%@ page errorPage="errorpage.jsp" %>

<jsp:useBean id="bookDB" scope="application" class="DAO.UserDAO"/>
<jsp:useBean id="bookDB1" scope="application" class="DAO.PetDAO"/>

<%!
   public String convert(String s){
    try{
     	//return new String(s.getBytes("ISO-8859-1"),"utf-8");
     	return new String(s.getBytes("utf-8"),"utf-8");
    }catch(Exception e){return null;}
   }
%>
