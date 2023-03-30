package project;

//2. 그룹에 해당하는 정보들을 추가적으로 정의하는 새로운 클래스들을 정의합니다. 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//① CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//- 회사이름, 부서이름, 직급 변수 추가
//- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력

public class CompanyContact extends Contact {
	// 변수 선언
	private String company;		//회사이름
	private String department;	//부서이름
	private String position;	//직급

	// 생성자
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group, String company, String department, String position) {
		// 상위 클래스 생성자 초기화값
		super(name, phoneNumber, email, address, birthday, group);
		
		// 초기화
		this.company = company;
		this.department = department;
		this.position = position;
	}
	
	// getter / setter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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
		System.out.println(getDepartment());
		System.out.println(getPosition());
	}
}
