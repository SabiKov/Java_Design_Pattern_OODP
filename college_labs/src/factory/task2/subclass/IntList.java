package factory.task2.subclass;

import java.util.StringTokenizer;

import factory.task2.base.NumberList;

public class IntList extends NumberList {

	private int size;
	private StringTokenizer token;
	
	public IntList(String list) {
		size = 0;
		
		StringTokenizer token = new StringTokenizer(list);
		size = token.countTokens();
		
		intList = new int[size];
		
		for(int i : intList){
			i = Integer.parseInt(token.nextToken());
		}
	}

	@Override
	public Number sum() {
		int n = 0;

		for(int i : intList) {
			n += i;
		}
		System.out.println("sum of list1 :" + n);
		return new Integer(n);
	}
	
	@Override
	public void display(){
		System.out.println("Integer list");
		for(int i = 0; i < size; System.out.println("[" + i + "]=" + intList[i++]));
		
	}
}
