package zy_test;

import java.util.Random;

public class StringUtil {

	public String generateChineseName() {
		Random r = new Random();
		int name = r.nextInt(10000-1+1+1);
		return name+"";
	}
	
	public String randomChineseString() {
		Random r = new Random();
		int about = r.nextInt(10000-1+1+1);
		return about+""+about;
	}
}
