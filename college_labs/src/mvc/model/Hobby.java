package mvc.model;

public class Hobby {

	private String hobbyName;
	
	
	public Hobby() {}
	
	//constructor
	public Hobby(String hobbyName) {
		this.hobbyName = hobbyName;		
	}
	
	public void setHobbyName(String hobbyName){
		this.hobbyName = hobbyName;
	}
	
	public String getHobbyName() {
		return hobbyName;
	}

	@Override
	public String toString() {
		return hobbyName;
	}
	
}
