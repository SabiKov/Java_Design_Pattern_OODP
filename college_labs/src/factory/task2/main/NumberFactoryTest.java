package factory.task2.main;

import factory.task2.base.NumberList;
import factory.task2.factoryclass.NumberFactory;

public class NumberFactoryTest {

	public static void main(String[] args) {
		String list1 = new String("1 2 3 4 5 6 7 8 9 10");
		String list2 = new String("1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1");
		String list3 = new String("A B C D E F G H I J K L M N O P Q R S T V W X Y Z");

		NumberFactory nfFactory = new NumberFactory();
		
		//invoke abstract Class
		NumberList numberList3 = nfFactory.getNumberList(list3);
		numberList3.display();
		
		nfFactory.getNumberList(list1).display();
		nfFactory.getNumberList(list1).sum();
		
		System.out.println("-");
		
		//invoke abstract Class
		NumberList numberList2 = nfFactory.getNumberList(list2);
		numberList2.display();
		
		System.out.println("");
		System.out.println("Sum of list 2 : " + numberList2.sum());
		
	}

}
