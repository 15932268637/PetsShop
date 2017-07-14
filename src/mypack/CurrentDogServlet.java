/*package mypack;

import javax.servlet.*;
import javax.servlet.http.*;

import my.Dog;

import DAO.PetDAO;

import java.io.*;
import java.util.*;

public class CurrentDogServlet extends HttpServlet {

   /** 响应客户请求*
  public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
	  
	 // Enumeration <String> buttons=request.getParameterNames();
	 // String button_name=buttons.nextElement();
	
	//String dog_pid=button_name.substring(button_name.indexOf("_")+1);
	//System.out.println("dog_pid="+dog_pid);
	  String dog_pid = request.getParameter("pid");
	  
	System.out.println("current_dog_pid="+dog_pid); 

  }
  
 	
  	
  	
  
}*/




/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Tomcat与Java Web开发技术详解>>           *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
