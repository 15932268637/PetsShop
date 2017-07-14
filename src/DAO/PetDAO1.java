package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import my.Cat;
import my.Dog;

public class PetDAO1 {
	@SuppressWarnings("finally")
	public static List query_cats_by_size(String type1,String size1){
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
				Cat cat = null;
				cat = new Cat(place,size1,ability,photo);
				System.out.println(photo);
				cat.setPid(pid);
				cat.setPname(pname);
				cat.setPrice(price);
				cat.setPtype(type1);
				cat.setBirthday(birthday);
				petList.add(cat);	
			}	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return petList;
		}
		//
	}
}

