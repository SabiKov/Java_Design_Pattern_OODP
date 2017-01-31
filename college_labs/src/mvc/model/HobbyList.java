package mvc.model;

import java.util.ArrayList;
import java.util.List;

import mvc.dao.MockDb;

public class HobbyList {

	//init data model collection
	private List<Object> hobbyList;
	
	public HobbyList() {
		//adding default arrayList to the model collection
		hobbyList = new ArrayList<Object>(MockDb.dummyDB);
	}
	
	//Add new hobby object to the arrayList
	public void addHobby(String hobby) {
		System.out.println("add hobby: " + hobby);
		hobbyList.add(new Hobby(hobby));
	}
	
	//return the list of hobby
	public ArrayList<Object> getHobbyList(){
		return (ArrayList<Object>) hobbyList;
	}
}
