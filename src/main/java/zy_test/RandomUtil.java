package zy_test;

import java.util.Random;

public class RandomUtil {

	public int generateChineseName() {
		Random r = new Random();
		int age = r.nextInt(120-1+1+1);
		return age;
	}
	
}
