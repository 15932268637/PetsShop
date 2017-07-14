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

public class ManagerServlet3 extends HttpServlet {
  @SuppressWarnings("rawtypes")
public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
	  //点击登录按钮，进行跳转的页面
	  String targe3 = "/succ1.html";
	  String targe4 = "/faa1.html";
		  int userid=Integer.parseInt(request.getParameter("ppid"));
		  UserDAO userdao=new UserDAO();
		  boolean result = userdao.delete(userid);
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