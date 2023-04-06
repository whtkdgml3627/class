package chapter11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SmartPhone implements Comparable<SmartPhone> {
	
	private String name;
	private String phoneNumber;
	
	// 생성자
	public SmartPhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	// get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// 출력하는 toString
	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	@Override
	public int hashCode() {
		// 010-9876-5432
		return this.phoneNumber.charAt(phoneNumber.length()-1)%5; // 0 1 2 3 4
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj != null && obj instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone)obj;
			result = phoneNumber.equals(sp.getPhoneNumber());
		}
		
		return result;
	}
	
	// 추상메소드 오버라이딩
	// compareTo 이 메소드가 정렬의 기준을 정의하는 기능을 정의하는 메소드.
	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName());// *-1 내림차순으로 할 때 넣어줌
	}
	
	public static void main(String[] args) {
		
		Set<SmartPhone> phones = new HashSet<>();
		
		phones.add(new SmartPhone("손흥민", "010-1234-5678"));
		phones.add(new SmartPhone("박지성", "010-3333-7777"));
		phones.add(new SmartPhone("이강인", "010-1234-5678"));
		phones.add(new SmartPhone("차두리", "010-1234-5679"));
		
//		for(SmartPhone sp : phones) {
//			System.out.println(sp);
//		}
		
		phones.stream().sorted().forEach(System.out::println);// 오름차순
		phones.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);// 내림차순
		
	}

}
