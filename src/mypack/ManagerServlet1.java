package mypack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.Cat;
import my.Dog;
import my.Pet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import DAO.UserDAO;

public class ManagerServlet1 extends HttpServlet {
  private String filePath; //存放上传文件的目录
  private String tempFilePath; //存放临时文件的目录

  public void init(ServletConfig config)throws ServletException {
    super.init(config);
    filePath=config.getInitParameter("filePath");
    tempFilePath=config.getInitParameter("tempFilePath");
    filePath=getServletContext().getRealPath(filePath);
    tempFilePath=getServletContext().getRealPath(tempFilePath);
  }
  
  
  public void doPost(HttpServletRequest request,HttpServletResponse response)
         throws ServletException, IOException 
  {
	  
    response.setContentType("text/plain;charset=gb2312");
    //向客户端发送响应正文
    PrintWriter outNet=response.getWriter(); 
    FileItemFactory factory = new DiskFileItemFactory();
    ServletFileUpload upload = new ServletFileUpload(factory);
    int p = 0;
    String file = null;
      String pid="pid";//Integer.parseInt(request.getParameter("pid"));
	  String pname="pname";//request.getParameter("pname");
	  String ptype="ptype";//request.getParameter("ptype");
	  String pprice="pprice";//request.getParameter("pprice");
	  String pbirth="pbirth";//request.getParameter("pbirth");
	  String pplace="pplace";//request.getParameter("pplace");
	  String pda="pda";//request.getParameter("pda");
	  String pneng="pneng";//request.getParameter("pneng");
	  //String file = (String) request.getAttribute("value");
   // Integer month = 0;
    try {
    List items = upload.parseRequest(request);
    InputStream is = null;
    Iterator iter = items.iterator();
    String file1 = "/img";
    String fileName = null;
    while(iter.hasNext()) {
    FileItem item = (FileItem)iter.next();
    // 判断该属性是否是file类型
    if (!item.isFormField()) {
    is = item.getInputStream();
    fileName = item.getName();
   // new File("filePath\" + fileName)
   // File file = new File(filePath+"/"+fileName);
    file = file1+"/"+fileName;
    } else {
    	//processUploadedFile(item,outNet); 
    // 不是file类型的话，就利用getFieldName判断name属性获取相应的值
    if(pid.equals(item.getFieldName())) {
    	p = Integer.parseInt(item.getString());
    } 
    if(pname.equals(item.getFieldName())) {
    	pname = item.getString();
    } 
    if(ptype.equals(item.getFieldName())) {
    	ptype = item.getString();
    } 
    if(pprice.equals(item.getFieldName())) {
    	pprice = item.getString();
    } 
    if(pbirth.equals(item.getFieldName())) {
    	pbirth = item.getString();
    } 
    if(pplace.equals(item.getFieldName())) {
    	pplace = item.getString();
    } 
    if(pda.equals(item.getFieldName())) {
    	pda = item.getString();
    } 
    if(pneng.equals(item.getFieldName())) {
    	pneng = item.getString();
    } 
    
    }
    }
    }catch(Exception e) {
    e.printStackTrace();
    }
    Pet pet = new Pet(p, pname, ptype, pprice,pbirth);
    Dog dog = new Dog(pplace,pda,pneng,file);
    Cat cat = new Cat(pplace,pda,pneng,file);
    response.setContentType("text/html;charset=GB2312");
    if(ptype.equals("dog")){
    	UserDAO userdao=new UserDAO();
    	boolean result = userdao.register1(pet,dog);
    	if(result){
    		PrintWriter out=response.getWriter();
    		out.println("<html>");
    		out.println("<head>");
    		out.println("<title></title>");
    		out.println("</head>");
    		out.println("<body bgcolor='pink'>");
    		out.println("<h1 align='center'>插入成功</h1>");
    		out.println("<div align='center'> <input  type='button' value='返回' onclick='javascript:history.back();' ></div>");
    		out.println("</body>");
    		out.println("</html>");
      	} else{
      		PrintWriter out=response.getWriter();
    		out.println("<html>");
    		out.println("<head>");
    		out.println("<title></title>");
    		out.println("</head>");
    		out.println("<body bgcolor='pink'>");
    		out.println("<h1 align='center'>插入失败</h1>");
    		out.println("<div align='center'> <input  type='button' value='返回' onclick='javascript:history.back();' ></div>");
    		out.println("</body>");
    		out.println("</html>");
      	}
    }
    if(ptype.equals("cat")){
    	UserDAO userdao=new UserDAO();
    	boolean result = userdao.register2(pet,cat);
    	if(result){
    		
    		  
    		PrintWriter out=response.getWriter();
    		out.println("<html>");
    		out.println("<head>");
    		out.println("<title></title>");
    		out.println("</head>");
    		out.println("<body bgcolor='pink'>");
    		out.println("<h1 align='center'>插入成功</h1>");
    		out.println("<div align='center'> <input  type='button' value='返回' onclick='javascript:history.back();' ></div>");
    		out.println("</body>");
    		out.println("</html>");
      	}  else{
      		PrintWriter out=response.getWriter();
    		out.println("<html>");
    		out.println("<head>");
    		out.println("<title></title>");
    		out.println("</head>");
    		out.println("<body bgcolor='pink'>");
    		out.println("<h1 align='center'>插入失败</h1>");
    		out.println("<div align='center'> <input  type='button' value='返回' onclick='javascript:history.back();' ></div>");
    		out.println("</body>");
    		out.println("</html>");
      	}
       }
  }
}


