package mypack;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.User;
import DAO.UserDAO;

public class RegisterServlet extends HttpServlet {

  public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
    
	  String targe1 = "/succ.html";
	  String targe2 = "/faa.html";
	  
	  //if(request.getParameter("submit1")!=null){
	  int userid=Integer.parseInt(request.getParameter("userid"));
	  String username=request.getParameter("username");
	  String password=request.getParameter("userpassword");
	  String email=request.getParameter("useremail");
	  int type=Integer.parseInt(request.getParameter("type"));
	  User user = new User(userid,username,email,password,type);
		UserDAO userdao=new UserDAO();
		boolean result = userdao.register(user);
		if(result){
			ServletContext context = getServletContext();
		    RequestDispatcher dispatcher =context.getRequestDispatcher(targe1);
		    dispatcher.forward(request, response);
		}else{
			ServletContext context = getServletContext();
		    RequestDispatcher dispatcher =context.getRequestDispatcher(targe2);
		    dispatcher.forward(request, response);
		}
	  
  }
}




/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Tomcat与Java Web开发技术详解>>           *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
