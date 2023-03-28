package chapter05;

public class ModifierDefaultMain {

	public static void main(String[] args) {

		ModifierDefault md = new ModifierDefault("손흥민", 30);
		
		md.tell();
		
		md.name = "박지성";
		md.age = 10;
		
		md.tell();
		
	}

}
