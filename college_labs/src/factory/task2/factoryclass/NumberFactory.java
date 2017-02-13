package factory.task2.factoryclass;

import factory.task2.base.NumberList;
import factory.task2.subclass.AlphaCharacterList;
import factory.task2.subclass.DoubleList;
import factory.task2.subclass.IntList;

public class NumberFactory {
	
	public NumberList getNumberList(String list) {
		
		int i = list.indexOf('.');
		
		if('A' == list.charAt(0)) {
			return new AlphaCharacterList(list);
		}
		else if(i != -1 ){
			return new DoubleList(list);
		}
		else {
			return new IntList(list);
		}
	}
}
