package com.im.test;

import com.im.util.DBConnect;

public class TestMain {

	public static void main(String[] args) {
		DBConnect dbConnector = new DBConnect();
		try {
			dbConnector.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
