package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import my.Dog;

public class PetDAO {
	@SuppressWarnings("finally")
	public static List query_dogs_by_size(String type1,String size1){
		/**
		 * 连接数据库，构造查询语句，创建相关的对象发出查询语句得到结果集
		 * 对结果集进行便利（循环），得到Dog对象
		 * 将Dog对象插入到线性表中
		 * 将线性表返回
		 */
		List petList = new LinkedList();
		//建立连接的代码
		Connection conn;
		String str = null;
		try{
			conn = DBUtil.getConnectionMYSQL();//得到连接对象
			//构造一个查询语句
			if(size1.equals("0")){
			str = "select a.pid pid,pname,price,birthday,place,ability,photo from pet a,"+type1+" b where a.pid=b.pid order by price";
			}else{
				str = "select a.pid pid,pname,price,birthday,place,ability,photo from pet a,"+type1+" b where a.pid=b.pid and size ='"+size1+"'"+" order by price";
			}
			System.out.println(str);
			//创建相关的对象发出查询语句得到结果集
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(str);
			//对结果集进行便利（循环），得到Dog对象,将Dog对象插入到线性表中
			int pid;
			String birthday;
			String pname,ptype,color,place,ability,photo;
			String price;
			
			while(rs.next()){
				pid = rs.getInt("pid");
				pname = rs.getString("pname");
				//ptype = rs.getString("ptype");
				price = rs.getString("price");
				//color = rs.getString("color");
				birthday = rs.getString("birthday");
				place = rs.getString("place");
				ability = rs.getString("ability");
				photo = rs.getString("photo");
				
				if(type1.equals("dog")){
					Dog dog = null;
					dog = new Dog(place,size1,ability,photo);
					System.out.println(photo);
					dog.setPid(pid);
					dog.setPname(pname);
					dog.setPrice(price);
					dog.setPtype(type1);
					dog.setBirthday(birthday);
					petList.add(dog);
				}
				
				
				
				
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return petList;
		}
		//
	}
}

