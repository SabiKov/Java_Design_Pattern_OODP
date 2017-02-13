package factory.task2.subclass;

import java.util.StringTokenizer;

import factory.task2.base.NumberList;

public class DoubleList extends NumberList {
	int size;
	public DoubleList(String list) {
		size = 0;
		StringTokenizer token = new StringTokenizer(list);
		size = token.countTokens();
		// Allocate some space for the array
		doubleList = new double[size];
		// Store each list item an the appropriate array
		for(double i : doubleList)  {
			i = Double.parseDouble(token.nextToken());
		}
	}
	
	@Override
	public Number sum() {
		int n = 0;
		
		for(double i : doubleList) {
			n += i;
		}
		return new Double(n);
	}
	
	@Override
	public void display(){
		System.out.println("Double list");
		for(int i = 0; i < size; System.out.println("[" + i + "]=" + doubleList[i++]));
		
	}
}
