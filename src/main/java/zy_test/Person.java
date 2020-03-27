package zy_test;

public class Person {

	private String name;
	
	private int age;
	
	private String about;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + "]";
	}
	
}
