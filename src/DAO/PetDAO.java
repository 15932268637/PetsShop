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
		 * �������ݿ⣬�����ѯ��䣬������صĶ��󷢳���ѯ���õ������
		 * �Խ�������б�����ѭ�������õ�Dog����
		 * ��Dog������뵽���Ա���
		 * �����Ա���
		 */
		List petList = new LinkedList();
		//�������ӵĴ���
		Connection conn;
		String str = null;
		try{
			conn = DBUtil.getConnectionMYSQL();//�õ����Ӷ���
			//����һ����ѯ���
			if(size1.equals("0")){
			str = "select a.pid pid,pname,price,birthday,place,ability,photo from pet a,"+type1+" b where a.pid=b.pid order by price";
			}else{
				str = "select a.pid pid,pname,price,birthday,place,ability,photo from pet a,"+type1+" b where a.pid=b.pid and size ='"+size1+"'"+" order by price";
			}
			System.out.println(str);
			//������صĶ��󷢳���ѯ���õ������
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(str);
			//�Խ�������б�����ѭ�������õ�Dog����,��Dog������뵽���Ա���
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

