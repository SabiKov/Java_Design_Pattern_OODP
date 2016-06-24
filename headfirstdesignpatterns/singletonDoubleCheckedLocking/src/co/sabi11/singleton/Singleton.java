package co.sabi11.singleton;

public class Singleton {

	/*
	 * The volatile keyword ensure that
	 * multiple threads handle the uniqueInstance variable
	 * corrctly when it is beign initialised to the Singleton instance
	 * */
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(uniqueInstance == null) {
			
			// Instance is synchronized only the first time
			
			synchronized(Singleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
			
		}
		
		return uniqueInstance;
	}
	
	
}
