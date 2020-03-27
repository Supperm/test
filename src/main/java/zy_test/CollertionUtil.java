package zy_test;

import java.util.List;

public class CollertionUtil {

	public boolean isCollertion(List<Person> list) {
		if(list.isEmpty()) {
			return false;
		}else if(list==null) {
			return false;
		}else {
			return true;
		}	
	}
}
