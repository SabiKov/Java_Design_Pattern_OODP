package mvc.dao;

import java.util.ArrayList;
import java.util.List;

import mvc.model.Hobby;

public class MockDb {

	//mock DB
		public static List<Object> dummyDB = new ArrayList<Object>();
		
		//Constructor, adding mock hobbies
		static {
			dummyDB.add(new Hobby("Football"));
			dummyDB.add(new Hobby("Tennis"));
			dummyDB.add(new Hobby("Billiard"));
			dummyDB.add(new Hobby("Kick Boxing"));
			dummyDB.add(new Hobby("Boxing"));
			dummyDB.add(new Hobby("Reading"));
			dummyDB.add(new Hobby("Cooking"));
			dummyDB.add(new Hobby("Training"));
			dummyDB.add(new Hobby("Cycling"));
			dummyDB.add(new Hobby("Coding"));
		}
		
		public ArrayList<Object> getMockDB() {
			
			return (ArrayList<Object>) dummyDB;
		}
}
