package mypack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;

public class DengLuServlet extends HttpServlet {

  public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
	  //点击登录按钮，进行跳转的页面
	  String target1 = "/success.jsp";
	  String target2 = "/manager.jsp";
	  String target3 = "/manager1.jsp";
	  String target4 = "/defat.html";
	  
	  //进行用户检查
	  int userid=Integer.parseInt(request.getParameter("userid"));
	  String password=request.getParameter("userpassword");
	  int type=Integer.parseInt(request.getParameter("type"));
	  UserDAO userdao=new UserDAO();
	  boolean result = userdao.panduan(userid,password,type);
	  if(result){
		  if(type==0){
			ServletContext context = getServletContext();
		    request.setAttribute( "value",userid); 
		    RequestDispatcher dispatcher =context.getRequestDispatcher(target1);
		    dispatcher.forward(request, response);  
		  }
		  if(type==1){
			  if(userid==0){
			    ServletContext context = getServletContext();
			    request.setAttribute( "value",userid); 
			    RequestDispatcher dispatcher =context.getRequestDispatcher(target2);
			    dispatcher.forward(request, response);  
			  }else{
				   ServletContext context = getServletContext();
				   request.setAttribute( "value",userid);
				   RequestDispatcher dispatcher =context.getRequestDispatcher(target3);
				   dispatcher.forward(request, response);  
			  }
		  }
		  
	  }else{
		  ServletContext context = getServletContext();
		   RequestDispatcher dispatcher =context.getRequestDispatcher(target4);
		   dispatcher.forward(request, response);
	  }
  }
}
