package factory.task2.subclass;

import factory.task2.base.NumberList;

public class AlphaCharacterList extends NumberList {

	private String str;
	
	public AlphaCharacterList(String list) {
		
		this.str = list;
	}
	
	@Override
	public Number sum() {
		
		return null;
	}
	
	@Override
	public void display(){
		System.out.println("String list");
		System.out.println(this.str);
	}
	
}
