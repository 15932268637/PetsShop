package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import my.Cat;
import my.Dog;
import my.Pet;
import my.User;

public class UserDAO {

	@SuppressWarnings("finally")
	public boolean register(User user){
		boolean result = false;
		Connection conn;
		try{
			conn=DBUtil.getConnectionMYSQL();
			String userName = user.getUname();
			int userid=user.getUid();
			String password=user.getPassword();
			String email=user.getEmail();
			int type=user.getType();
			
			String str1 = "select * from user1 where uid="+userid+" and uname='"+userName+"'";
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(str1);
			if(rs.next()){//如果用户已经存在
				//return false;
				System.out.println("不可以注册，用户已存在！");
				return result;

			}else{
				System.out.println("可以注册~！");
				
				//将新用户信息插入
				String str2="insert into user1(uid,uname,email,password,type) values (?,?,?,?,?)";
				PreparedStatement pstmt=conn.prepareStatement(str2);
				
				
				pstmt.setInt(1, userid);
				pstmt.setString(2, userName);
				pstmt.setString(3, email);
				pstmt.setString(4, password);
				pstmt.setInt(5, type);
				pstmt.executeUpdate();
				result = true;
				return result;

			}
			
			//如果用户不存在，则注册用户
			//String str2="";
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return result;
		}
	}
	
	 public Pet getPetDetails(int pId) throws Exception {
		    Connection con=null;
		    PreparedStatement prepStmt=null;
		    ResultSet rs =null;
		    try {
		      con=DBUtil.getConnectionMYSQL();
		      String selectStatement = "select * " + "from pet where pid = ? ";
		      prepStmt = con.prepareStatement(selectStatement);
		      prepStmt.setInt(1, pId);
		      rs = prepStmt.executeQuery();

		      if (rs.next()) {
		        Pet bd = new Pet(rs.getInt(1), rs.getString(2), rs.getString(3),
		          rs.getString(4), rs.getString(5));
		        prepStmt.close();

		        return bd;
		      }
		      else {
		        return null;
		      }
		    }finally{
		      rs.close();
		      prepStmt.close();
		      con.close();
		    }
		  }
	
	public boolean register1(Pet pet,Dog dog){
		boolean result = false;
		Connection conn;
		try{
			conn=DBUtil.getConnectionMYSQL();
			String pName = pet.getPname();
			int pid=pet.getPid();
			String ptype=pet.getPtype();
			String pprice=pet.getPrice();
			String pbirth=pet.getBirthday();
			String pplace=dog.getPlace();
			String size = dog.getSize();
			String ability = dog.getAbility();
			String photo = dog.getPhoto();
			
			String str2 = "select * from pet where pid="+pid;
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(str2);
			if(rs.next()){//如果宠物已经存在
				//return false;
				System.out.println("不可以添加，宠物已存在！");
				return result;

			}else{
				System.out.println("可以添加~！");
				
				//将新用户信息插入
				String str3="insert into pet(pid,pname,ptype,price,birthday) values (?,?,?,?,?)";
				String str4="insert into dog(pid,place,size,ability,photo) values (?,?,?,?,?)";
				System.out.println("uftguile");
				PreparedStatement pstmt=conn.prepareStatement(str3);
				PreparedStatement pstmt1=conn.prepareStatement(str4);
				System.out.println("uftguile");
				pstmt.setInt(1, pid);
				pstmt.setString(2, pName);
				pstmt.setString(3, ptype);
				pstmt.setString(4, pprice);
				pstmt.setString(5, pbirth);
				pstmt.executeUpdate();
				
				pstmt1.setInt(1, pid);
				pstmt1.setString(2, pplace);
				pstmt1.setString(3, size);
				pstmt1.setString(4, ability);
				pstmt1.setString(5, photo);
				pstmt1.executeUpdate();
				result = true;
				return result;

			}
			
			//如果用户不存在，则注册用户
			//String str2="";
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return result;
		}
	}
	
	public boolean register2(Pet pet,Cat cat){
		boolean result = false;
		Connection conn;
		try{
			conn=DBUtil.getConnectionMYSQL();
			String pName = pet.getPname();
			int pid=pet.getPid();
			String ptype=pet.getPtype();
			String pprice=pet.getPrice();
			String pbirth=pet.getBirthday();
			String pplace=cat.getPlace();
			String size = cat.getSize();
			String ability = cat.getAbility();
			String photo = cat.getPhoto();
			
			String str2 = "select * from pet where pid="+pid;
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(str2);
			if(rs.next()){//如果宠物已经存在
				//return false;
				System.out.println("不可以添加，宠物已存在！");
				return result;

			}else{
				System.out.println("可以添加~！");
				
				//将新用户信息插入
				String str3="insert into pet(pid,pname,ptype,price,birthday) values (?,?,?,?,?)";
				String str4="insert into cat(pid,place,size,ability,photo) values (?,?,?,?,?)";
				System.out.println("uftguile");
				PreparedStatement pstmt=conn.prepareStatement(str3);
				PreparedStatement pstmt1=conn.prepareStatement(str4);
				System.out.println("uftguile");
				pstmt.setInt(1, pid);
				pstmt.setString(2, pName);
				pstmt.setString(3, ptype);
				pstmt.setString(4, pprice);
				pstmt.setString(5, pbirth);
				pstmt.executeUpdate();
				
				pstmt1.setInt(1, pid);
				pstmt1.setString(2, pplace);
				pstmt1.setString(3, size);
				pstmt1.setString(4, ability);
				pstmt1.setString(5, photo);
				pstmt1.executeUpdate();
				result = true;
				return result;

			}
			
			//如果用户不存在，则注册用户
			//String str2="";
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return result;
		}
	}
	
	
	public boolean panduan(int id,String pass,int type){
		Connection conn;
		boolean a = false;
		try{
			conn=DBUtil.getConnectionMYSQL();
			//stmt1 = conn.createStatement();
			//rs = stmt1.executeQuery("select * from bao where name='"+a+"' and  password='"+b+"';");
			String pa="select password from user1 where uid = "+id+" and type = "+type+" and  password='"+pass+"'";
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(pa);

			
			if(rs.next()){//如果用户已经存在
					a = true;
					return a;
			}else{
				return a;
			}
		}catch(Exception e){
				e.printStackTrace();
			}
		return a;
	}
	
	public boolean delete(int pid){
		boolean result = false;
		Connection conn;
		try{
			conn=DBUtil.getConnectionMYSQL();
			
			String str1 = "select * from pet where pid="+pid;
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(str1);
			if(rs.next()){//如果宠物已经存在
				String str2 = "delete from pet where pid="+pid;
				String str3 = "delete from dog where pid="+pid;
				String str4 = "delete from cat where pid="+pid;
				PreparedStatement pstmt=conn.prepareStatement(str2);
				pstmt.executeUpdate();
				PreparedStatement pstmt1=conn.prepareStatement(str3);
				pstmt1.executeUpdate();
				PreparedStatement pstmt2=conn.prepareStatement(str4);
				pstmt2.executeUpdate();
				result = true;
				return result;
			}else{
				System.out.println("宠物不存在~！");
				result = false;
				return result;
			}	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return result;
		}
	}
	
	public boolean select(String type,String style){
		boolean result = false;
		Connection conn;
		try{
			conn=DBUtil.getConnectionMYSQL();
			if(style.equals("0")){
				String pa="select * from dog a,pet b where b.ptype = '"+type+"' and b.pid=a.pid";
				Statement stmt=conn.createStatement();
				ResultSet rs = stmt.executeQuery(pa);
				
			}else{
				String pa1="select * from dog a,pet b where b.ptype = '"+type+"' and b.pid=a.pid and size ='"+style+"'";
				Statement stmt=conn.createStatement();
				ResultSet rs = stmt.executeQuery(pa1);
				
			}
			result = true;
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return result;
		}
	}

}
