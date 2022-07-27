package com.im.employees;

import java.util.ArrayList;

public class EmployeesView {
	public void view(EmployeesDTO edto) {
		System.out.println(edto.getEmployee_id());
		System.out.println(edto.getFirst_name());
		System.out.println(edto.getLast_name());
		System.out.println(edto.getEmail());
		System.out.println(edto.getPhone_number());
		System.out.println(edto.getHire_date());
		System.out.println(edto.getJob_id());
		System.out.println(edto.getSalary());
		System.out.println(edto.getCommission_pct());
		System.out.println(edto.getManager_id());
		System.out.println(edto.getDepartment_id());
	}
	public void view(ArrayList<EmployeesDTO> ar) {
		EmployeesDTO edto = new EmployeesDTO();
		for(int i=0; i<ar.size(); i++) {
			edto = ar.get(i);
			System.out.println(edto.getEmployee_id());
			System.out.println(edto.getFirst_name());
			System.out.println(edto.getLast_name());
			System.out.println(edto.getEmail());
			System.out.println(edto.getPhone_number());
			System.out.println(edto.getHire_date());
			System.out.println(edto.getJob_id());
			System.out.println(edto.getSalary());
			System.out.println(edto.getCommission_pct());
			System.out.println(edto.getManager_id());
			System.out.println(edto.getDepartment_id());
		}
	}

}
