package controller;

import java.util.List;

import domain.Dept;
import main.DeptManagerMain;
import service.DeptListService;
import service.DeptSearchService;
import service.DeptUpdateSerivce;

public class DeptUpdateController implements Controller {
	
	DeptListService listService;
	DeptSearchService searchService;
	DeptUpdateSerivce updateSerivce;
	
	private DeptUpdateController() {
		super();
		this.listService = DeptListService.getInstance();
		this.searchService = DeptSearchService.getInstance();
		this.updateSerivce = DeptUpdateSerivce.getInstance();
	}
	
	private static DeptUpdateController controller = new DeptUpdateController();
	
	public static DeptUpdateController getInstance() {
		return controller;
	}

	@Override
	public void process() {
		
		// 1. 수정하고자 하는 데이터를 사용자로부터 받아서 -> Dept
		Dept newDept = inputUpadateDept();
		// 2. Service에 Dept 전달해서 수정처리 -> 결과 반환 (1 or 0)
		int result = updateSerivce.updateDept(newDept);
		// 3. 결과 값에 따른 결과 출력
		printData(result);
		
	}
	
	private void printData(int result) {
		if(result>0) {
			System.out.println("수정 되었습니다.");
		}else {
			System.out.println("수정 실패. (입력시 데이터를 확인 후 입력해주세요.)");
		}
	}
	
	private Dept inputUpadateDept() {
		
		// 1. 수정하고자 하는 부서번호를 입력하세요.
		System.out.println("부서 정보 수정을 시작합니다.");
		
		// - 전체 리스트 출력
		System.out.println("-------------------------------------------");
		List<Dept> list = listService.getDeptList();
		for(Dept d : list) {
			System.out.println(d.getDeptno() + " / " + d.getDname() + " / " + d.getLoc());
		}
		System.out.println("-------------------------------------------");
		
		// - 사용자가 부서번호 입력
		System.out.println("수정하고자 하는 부서번호를 입력 하세요. >>");
		int deptno = Integer.parseInt(DeptManagerMain.sc.nextLine());
		
		// 2. 해당 부서번호의 데이터를 가져와서 보여준다.
		Dept dept = searchService.searchDept(deptno);
		System.out.println("-------------------------------------------");
		System.out.println(dept);
		System.out.println("-------------------------------------------");

		// Dept -> 사용자가 입력한 부서의 저장되어 있는 데이터를 가지는 dept
		// 3. 수정할 데이터를 입력 받아 -> Dept로 반환
		System.out.println(deptno + "번 부서의 정보 수정을 시작합니다.");
		System.out.println("새로운 부서 이름을 입력하세요. >>");
		String newDnmae = DeptManagerMain.sc.nextLine();
		dept.setDname(newDnmae);
		System.out.println("새로운 위치 정보를 입력하세요. >>");
		String newLoc = DeptManagerMain.sc.nextLine();
		dept.setLoc(newLoc);
		
		// dept -> 새로 입력한 데이터를 가지는 Dept
		
		return dept;
	}
	
	public static void main(String[] args) {
		
		DeptUpdateController controller = new DeptUpdateController();
		Dept dept = controller.inputUpadateDept();
		System.out.println(dept);
	}
	
}
