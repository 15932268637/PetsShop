package my;

public class User {

	private String uname;
	private int uid;
	private String email;
	private String password;
	private int type;
	
	public User(int uid,String uname,String email,String password,int type){
		this.uname = uname;
		this.uid = uid;
		this.email = email;
		this.password = password;
		this.type=type;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
