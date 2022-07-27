package com.im.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.im.util.DBConnect;

public class CountriesDAO {
	
	public CountriesDTO getDetail(String country_id) throws Exception {
		CountriesDTO cdto = null;
		Connection con = DBConnect.getConnection();
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, country_id);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			cdto = new CountriesDTO();
			String cid = rs.getString("COUNTRY_ID");
			String cname = rs.getString("COUNTRY_NAME");
			int rid = rs.getInt("REGION_ID");
			cdto.setCountry_id(cid);
			cdto.setCountry_name(cname);
			cdto.setRegion_id(rid);
		}
		DBConnect.disConnect(rs, st, con);
		return cdto;
	}
	
	
	public ArrayList<CountriesDTO> getList() throws Exception {
		CountriesDTO cdto = null;
		ArrayList<CountriesDTO> ar = new ArrayList<>();
		Connection con = DBConnect.getConnection();
		String sql = "SELECT * FROM COUNTRIES";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			cdto = new CountriesDTO();
			String id = rs.getString("COUNTRY_ID");
			cdto.setCountry_id(id);
			String name = rs.getString("COUNTRY_NAME");
			cdto.setCountry_name(name);
			int regionid = rs.getInt("REGION_ID");
			cdto.setRegion_id(regionid);
			ar.add(cdto);	
		}
		DBConnect.disConnect(rs, st, con);
		return ar;
	}

}
