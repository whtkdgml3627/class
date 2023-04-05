package chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}
	
	public static void main(String[] args) {
		// 메소드 안쪽에선 지여견수이므로 초기화를 시켜주어야함. 그래서 null값이 들어감
		MyInterfaceImpl<String, Integer> my = null;
		//my = new MyInterfaceImpl<String, Integer>();
		// 제네릭은 생략이 가능하다.
		my = new MyInterfaceImpl();
		
		System.out.println(my.method1("KING"));
		System.out.println(my.method2(10));
	}

}
