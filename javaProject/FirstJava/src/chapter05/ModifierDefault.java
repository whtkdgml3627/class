package chapter05;

public class ModifierDefault {
	
	String name;
	int age;
	
	public ModifierDefault(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	void tell() {
		System.out.println("안녕하세요. " + age + "살 " + name + " 입니다.");
	}
	
}
