package com.im.employees;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.im.util.DBConnect;

public class EmployeesDAO {
	
	public void getSalaryInfo() throws Exception{
		
		//함수 예시
		Connection con = DBConnect.getConnection();
		String sql = "SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY) AS MAX FROM EMPLOYEES";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			int sum = rs.getInt("SUM(SALARY)");
			double avg = rs.getDouble("AVG(SALARY)");
			int max = rs.getInt("MAX");
			System.out.println(sum);
			System.out.println(avg);
			System.out.println(max);
			
		}
		DBConnect.disConnect(rs, st, con);
	}
	
	public EmployeesDTO getDetail(Integer employee_id) throws Exception {
		EmployeesDTO edto = null;
		Connection con = DBConnect.getConnection();
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, employee_id);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			edto = new EmployeesDTO();
			int eid = rs.getInt("EMPLOYEE_ID");
			String efname = rs.getString("FIRST_NAME");
			String elname = rs.getString("LAST_NAME");
			String email = rs.getString("EMAIL");
			String phone_number = rs.getString("PHONE_NUMBER");
			Date hire_date = rs.getDate("HIRE_DATE");
			String job_id = rs.getString("JOB_ID");
			int salary = rs.getInt("SALARY");
			double pct = rs.getDouble("COMMISSION_PCT");
			int manager = rs.getInt("MANAGER_ID");
			int department = rs.getInt("DEPARTMENT_ID");
			edto.setEmployee_id(eid);
			edto.setFirst_name(efname);
			edto.setLast_name(elname);
			edto.setEmail(email);
			edto.setPhone_number(phone_number);
			edto.setHire_date(hire_date);
			edto.setJob_id(job_id);
			edto.setSalary(salary);
			edto.setCommission_pct(pct);
			edto.setManager_id(manager);
			edto.setDepartment_id(department);
		}
		DBConnect.disConnect(rs, st, con);
		return edto;
	}
	
	public ArrayList<EmployeesDTO> getList() throws Exception{
		ArrayList<EmployeesDTO> ar = new ArrayList<>();
		Connection con = DBConnect.getConnection();
		String sql = "SELECT * FROM EMPLOYEES";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			EmployeesDTO edto = new EmployeesDTO();
			int eid = rs.getInt("EMPLOYEE_ID");
			String efname = rs.getString("FIRST_NAME");
			String elname = rs.getString("LAST_NAME");
			String email = rs.getString("EMAIL");
			String phone_number = rs.getString("PHONE_NUMBER");
			Date hire_date = rs.getDate("HIRE_DATE");
			String job_id = rs.getString("JOB_ID");
			int salary = rs.getInt("SALARY");
			double pct = rs.getDouble("COMMISSION_PCT");
			int manager = rs.getInt("MANAGER_ID");
			int department = rs.getInt("DEPARTMENT_ID");
			edto.setEmployee_id(eid);
			edto.setFirst_name(efname);
			edto.setLast_name(elname);
			edto.setEmail(email);
			edto.setPhone_number(phone_number);
			edto.setHire_date(hire_date);
			edto.setJob_id(job_id);
			edto.setSalary(salary);
			edto.setCommission_pct(pct);
			edto.setManager_id(manager);
			edto.setDepartment_id(department);
			ar.add(edto);
		}
		DBConnect.disConnect(rs, st, con);
		return ar;
	}

}
