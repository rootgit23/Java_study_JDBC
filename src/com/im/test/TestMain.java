package com.im.test;

import java.util.ArrayList;

import com.im.countries.CountriesDAO;
import com.im.countries.CountriesDTO;
import com.im.countries.CountriesView;
import com.im.regions.RegionsDAO;
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
		try {
			//regionDAO.getList();
			//regionDAO.getDetail(2);
			//rv.view();
			//rv.view2();
			ar = countriesDAO.getList();
			cv.view(ar);
		//	cdto = countriesDAO.getDetail("IT");
			//cv.view(cdto);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
