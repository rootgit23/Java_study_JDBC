package com.im.test;

import java.util.ArrayList;

import com.im.countries.CountriesDAO;
import com.im.countries.CountriesDTO;
import com.im.countries.CountriesView;
import com.im.employees.EmployeesDAO;
import com.im.employees.EmployeesDTO;
import com.im.employees.EmployeesView;
import com.im.regions.RegionsDAO;
import com.im.regions.RegionsDTO;
import com.im.regions.RegionsView;
import com.im.util.DBConnect;

public class TestMain {

	public static void main(String[] args) {
		
		RegionsDAO regionDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		CountriesDTO cdto = new CountriesDTO(); 
		RegionsView rv = new RegionsView();
		CountriesView cv = new CountriesView();
		ArrayList<CountriesDTO> ar = new ArrayList();
		EmployeesDAO employeesDAO = new EmployeesDAO();
		EmployeesDTO edto = new EmployeesDTO(); 
		EmployeesView ev = new EmployeesView();
		ArrayList<EmployeesDTO> ar2 = new ArrayList<>();
		try {
			//regionDAO.getList();
			//regionDAO.getDetail(2);
			//RegionsDTO rdto = new RegionsDTO();
			//rdto.setId(6);
			//rdto.setName("Mars");
			//int result = regionDAO.setRegion(rdto);
			//if(result > 0) {
			//	System.out.println("성공");
			//}
			//else {
			//	System.out.println("실패");
			//}
			//rv.view();
			//rv.view2();
			cdto.setCountry_id("TW");
			cdto.setCountry_name("Taiwan");
			cdto.setRegion_id(3);
			int result = countriesDAO.setCountries(cdto);
			if(result > 0) {
					System.out.println("성공");
			}
			else {
					System.out.println("실패");
			}
			//ar = countriesDAO.getList();
			//cv.view(ar);
			//cdto = countriesDAO.getDetail("IT");
			//cv.view(cdto);
			//edto = employeesDAO.getDetail(100);
			//ev.view(edto);
			//ar2 = employeesDAO.getList();
			//ev.view(ar2);
			//employeesDAO.getSalaryInfo();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
