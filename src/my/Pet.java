package my;

public class Pet {
	private int pid;
	private String pname;
	private String ptype;
	private String price;
	private String birthday;
	public Pet(){
		super();
	}
	public Pet(int pid, String pname, String ptype, String price,String birthday) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.price = price;
		this.birthday = birthday;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
}
