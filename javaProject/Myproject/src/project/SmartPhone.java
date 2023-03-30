package project;

//1. SmartPhone 클래스를 정의합니다. 이 클래스는 연락처 정보를 관리하는 클래스입니다.
//① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
//② 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.

public class SmartPhone extends Contact {
	//Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열
	Contact[] contact = new Contact[10];
	
	public SmartPhone(String name, String phoneNumber, String email, String address, String birthday, String group, Contact[] contact) {
		super(name, phoneNumber, email, address, birthday, group);
		this.contact = contact;
	}

	// 배열에 저장하는 메소드
	public void arrAdd() {
		for(int i = 0; i < contact.length; i++) {
			contact[i].getName();
			contact[i].getPhoneNumber();
			contact[i].getEmail();
			contact[i].getAddress();
			contact[i].getBirthday();
			contact[i].getGroup();
		}
	}
	
	// 배열을 수정하는 메소드
	public void arrModify(String name, String phoneNumber, String email, String address, String birthday, String group) {
		for(int i = 0; i < contact.length; i++) {
			contact[i].setName(name);
			contact[i].setPhoneNumber(phoneNumber);
			contact[i].setEmail(email);
			contact[i].setAddress(address);
			contact[i].setBirthday(birthday);
			contact[i].setGroup(group);
		}
	}
	
	// 배열을 삭제하는 메소드
	public void arrDelete() {
		for(int i = 0; i < contact.length; i++) {
			
		}
	}
	
}
