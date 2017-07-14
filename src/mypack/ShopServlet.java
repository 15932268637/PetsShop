package mypack;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import my.Pet;
import DAO.PetDAO;
import DAO.UserDAO;

public class ShopServlet extends HttpServlet {

   /** 响应客户请求*/
  public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
	  
	 HttpSession session=request.getSession(true);
		 ShoppingCart cart=( ShoppingCart)session.getAttribute("cart");
		 if(cart==null)
		 {
			 cart=new  ShoppingCart();
			 session.setAttribute("cart", cart);
		 }
	 // ShoppingCart cart=new  ShoppingCart();
		 response.setContentType("text/html;charset=GB2312");
	 int pid=Integer.parseInt(request.getParameter("pid"));
	 System.out.println("1"+pid);
	  UserDAO dao=new UserDAO();
	  Pet pets = null;
	try {
		pets = dao.getPetDetails(pid);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    //ShoppingCart cart=new ShoppingCart();
	 
	  // Pet pet=new Pet(pets.get(0).getPid(),pets.get(0).getPname(),pets.get(0).getPtype(),pets.get(0).getPrice(),pets.get(0).getBirthday(),pets.get(0).getColor());
		 
	  cart.add(pid, pets);
		
		
		 
		
	
	 
	 ServletContext context=getServletContext();
 	RequestDispatcher dispatcher=context.getRequestDispatcher("/showcart.jsp");
 	if (dispatcher==null) {System.out.println("=================dispatcher 是空指针=================");}
 	dispatcher.forward(request, response); 
 	
	

  }
  
}	
  	
  	
  

