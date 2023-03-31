package chapter08.exam;

public class CalulatorMain {

	public static void main(String[] args) {
		// 다형성으로 인스턴스 생성
		Calulator calulator = new CalulatorImpl();
		
		// 상위인터페이스로 인스턴스를 생성 하였으나
		// 하위클래스인 Impl에서 생성한 메소드를 사용하려 하기 때문에
		// 형변환 필요
		((CalulatorImpl)calulator).setResult(2321323, 213);
		
		
	}

}
