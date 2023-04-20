package exam.controller;

import java.util.List;

import exam.dao.DeptDao;
import exam.domain.Dept;
import exam.service.DeptListService;

public class DeptListController {
	
	DeptListService listService;

	public DeptListController() {
		this.listService = new DeptListService(new DeptDao());
	}
	
	public void getDeptList() {
		
		List<Dept> list = listService.getDeptList();
		for(Dept d : list) {
			System.out.println(d.getDeptno() + "\t" + d.getDname() + "\t" + d.getLoc());
		}
	}
	
	
	
}
