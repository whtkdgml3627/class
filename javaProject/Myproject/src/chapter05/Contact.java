package chapter05;

import java.util.Scanner;

public class Contact {

//	변수 선언
	private String name;
	private String phone;
	private String email;
	private String addr;
	private String birth;
	private String group;
	
//	생성자
	public Contact(String name, String phone, String email, String addr, String birth, String group) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addr = addr;
		this.birth = birth;
		this.group = group;
	}
	
//	Getter / Setter 선언
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + addr);
		System.out.println("생일 : " + birth);
		System.out.println("그룹 : " + group);
	}
	
//	public String getContact() {
//		return "이름 : " + name + "\n" +
//				"번호 : " + phone + "\n" +
//				"이메일 : " + email + "\n" +
//				"주소 : " + addr + "\n" +
//				"생일 : " + birth + "\n" +
//				"그룹 : " + group + "\n";
//	}
}

class ContactMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contact cnt = new Contact(null, null, null, null, null, null);

		System.out.println("이름을 입력하세요.");
		cnt.setName(sc.nextLine());
		System.out.println("전화번호를 입력하세요.");
		cnt.setPhone(sc.nextLine());
		System.out.println("이메일을 입력하세요.");
		cnt.setEmail(sc.nextLine());
		System.out.println("주소를 입력하세요.");
		cnt.setAddr(sc.nextLine());
		System.out.println("생일을 입력하세요.");
		cnt.setBirth(sc.nextLine());
		System.out.println("그룹을 입력하세요.");
		cnt.setGroup(sc.nextLine());
		
		cnt.print();
		
		System.out.println("전화번호를 수정해주세요.");
		String newPhone = sc.nextLine();
		cnt.setPhone(newPhone);
//		System.out.println(cnt.getContact());
		cnt.print();
		
		sc.close();
	}
}
