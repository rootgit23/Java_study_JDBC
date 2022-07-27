package com.im.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.im.util.DBConnect;

public class CountriesDAO {
	
	public void getList() throws Exception {
		Connection con = DBConnect.getConnection();
		String sql = "SELECT * FROM COUNTRIES";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_NAME");
			int regionid = rs.getInt("REGION_ID");
			System.out.println(id);
			System.out.println(name);
			System.out.println(regionid);
		}
	}

}
