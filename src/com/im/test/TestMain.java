package com.im.test;

import com.im.countries.CountriesDAO;
import com.im.regions.RegionsDAO;
import com.im.util.DBConnect;

public class TestMain {

	public static void main(String[] args) {
		
		RegionsDAO regionDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO(); 
		try {
			//regionDAO.getList();
			countriesDAO.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
