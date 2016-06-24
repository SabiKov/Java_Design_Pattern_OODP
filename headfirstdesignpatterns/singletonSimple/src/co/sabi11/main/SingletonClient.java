package co.sabi11.main;

import co.sabi11.singleton.Singleton;

public class SingletonClient {

	public static void main(String[] args) {
		
			Singleton singleton = Singleton.getInstance();
			System.out.println(singleton.getDescription());
	}

}


