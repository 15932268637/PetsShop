package my;

public class Cat extends Pet {
	private int pid;
	private String place;
	private String size;
	private String ability;
	private String photo;
	
	public Cat(String place, String size, String ability, String photo) {
		super();
		this.place = place;
		this.size = size;
		this.ability = ability;
		this.photo = photo;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
