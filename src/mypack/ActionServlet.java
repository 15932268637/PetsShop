package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.Cat;
import my.Dog;
import DAO.PetDAO;
import DAO.PetDAO1;

public class ActionServlet extends HttpServlet {

  public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {	  
	  //String tar = "/showDogs.jsp";
	  //进行用户检查
	  int type=Integer.parseInt(request.getParameter("type"));
	  int type1=Integer.parseInt(request.getParameter("styles"));
	  String Pname1 = null;
	  String size1 = null;
	  if(type == 1){
		  Pname1 = "dog";
	  }
	  if(type == 0){
		  Pname1 = "cat";
	  }
	  if(type1 == 0){
		  size1 = "0";
	  }
	  if(type1 == 1){
		  size1 = "big";
	  }
	  if(type1 == 2){
		  size1 = "middle";
	  }
	  if(type1 == 3){
		  size1 = "small";
	  }
	  response.setContentType("text/html;charset=GB2312");
	  if(request.getParameter("select")!=null){
		  if(Pname1.equals("dog")){
			  PetDAO petdao = new PetDAO();
			  // if(Pname1.equals("dog")){
			  List <Dog> dogs=petdao.query_dogs_by_size(Pname1,size1);
			  if(dogs!=null){
				  request.setAttribute( "value",dogs); 
				  ServletContext context = getServletContext();
				  RequestDispatcher dispatcher =context.getRequestDispatcher("/dogdetails.jsp");
				  dispatcher.forward(request, response);   
			  }else{
				    PrintWriter out=response.getWriter();
		    		out.println("<html>");
		    		out.println("<head>");
		    		out.println("<title></title>");
		    		out.println("</head>");
		    		out.println("<body>");
		    		out.println("<h1>没有该类型的宠物</h1>");
		    		out.println("</body>");
		    		out.println("</html>");
			  }
		
		  }else{
			  PetDAO1 petdao = new PetDAO1();
			  List <Cat> cats=petdao.query_cats_by_size(Pname1,size1);
			  if(cats!=null){
			  request.setAttribute( "value",cats); 
			  ServletContext context = getServletContext();
			  RequestDispatcher dispatcher =context.getRequestDispatcher("/catdetails.jsp");
			  dispatcher.forward(request, response);    
			  }else{
				  PrintWriter out=response.getWriter();
		    		out.println("<html>");
		    		out.println("<head>");
		    		out.println("<title></title>");
		    		out.println("</head>");
		    		out.println("<body>");
		    		out.println("<h1>没有您所查找的宠物</h1>");
		    		out.println("</body>");
		    		out.println("</html>");
			  }
		  }
	  }
/*
		else{
			
			int a =   (Integer) request.getAttribute("pid");
			request.setAttribute( "value",dogs); 
			request.setAttribute( "value2",a); 
			ServletContext context = getServletContext();
			//request.setAttribute( "value",userid); 
			RequestDispatcher dispatcher =context.getRequestDispatcher("/dogdetails.jsp");
			dispatcher.forward(request, response);    
		}*/
  }
}
