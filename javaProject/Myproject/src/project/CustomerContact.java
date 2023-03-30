package project;

//2. 그룹에 해당하는 정보들을 추가적으로 정의하는 새로운 클래스들을 정의합니다. 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//① CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//- 회사이름, 부서이름, 직급 변수 추가
//- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력

public class CustomerContact extends Contact {
	// 변수 선언
	private String company;		//회사이름
	private String item;		//거래품목
	private String position;	//직급

	// 생성자
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday, String group, String company, String item, String position) {
		// 상위 클래스 생성자 초기화값
		super(name, phoneNumber, email, address, birthday, group);
		
		// 초기화
		this.company = company;
		this.item = item;
		this.position = position;
	}
	
	// getter / setter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public void printData() {
		super.printData();
		System.out.println(getCompany());
		System.out.println(getItem());
		System.out.println(getPosition());
	}
}
