package factory.task2.base;

public abstract class NumberList { 
	
	protected int[] intList; 
	protected double[] doubleList; 
	
	public NumberList() { 
		
		intList = null; 
		doubleList = null; 
	} 
	
	public int[] getIntList() { 
		return intList; 
	} 
	
	public double[] getDoubleList() { 
		return doubleList; 
	} 
	
	public void display() {} 


	public Number sum() { 
		return null; 
	} 
}
