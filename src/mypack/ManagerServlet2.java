package mypack;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.Dog;
import my.Pet;
import my.User;
import DAO.UserDAO;

public class ManagerServlet2 extends HttpServlet {
  @SuppressWarnings("rawtypes")
public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
	  System.out.println("ha");
	  //点击登录按钮，进行跳转的页面
	  String targe1 = "/succ.html";
	  String targe2 = "/faa.html";
	  String targe3 = "/succ1.html";
	  String targe4 = "/faa1.html";
	  //进行用户检查
	  if(request.getParameter("fenpei")!=null){
		  int userid=Integer.parseInt(request.getParameter("userid"));
		  String username=request.getParameter("username");
		  String password=request.getParameter("userpassword");
		  String email=request.getParameter("useremail");
		  int type=Integer.parseInt(request.getParameter("type"));
		  User user = new User(userid,username,email,password,type);
		  UserDAO userdao=new UserDAO();
		  boolean result = userdao.register(user);
		  System.out.println(result);
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
	  if(request.getParameter("dele")!=null){
		  int userid=Integer.parseInt(request.getParameter("ppid"));
		  UserDAO userdao=new UserDAO();
		  boolean result = userdao.delete(userid);
		  System.out.println(result);
		  if(result){
			  ServletContext context = getServletContext();
			  RequestDispatcher dispatcher =context.getRequestDispatcher(targe3);
			  dispatcher.forward(request, response);
		  }else{
			  ServletContext context = getServletContext();
			  RequestDispatcher dispatcher =context.getRequestDispatcher(targe4);
			  dispatcher.forward(request, response);
		  }
	  }
  }
}