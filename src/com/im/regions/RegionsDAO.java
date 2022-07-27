package com.im.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.im.util.DBConnect;

public class RegionsDAO {
	
	//1. Regions 테이블의 모든 데이터 가져오기
	public void getList() throws Exception {
		//1.DB 연결
		Connection con = DBConnect.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM REGIONS";
		
		//3. Query문을 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.
		
		//5.최종 전송후 결과를 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("REGION_ID");
			String name = rs.getString("REGION_NAME");
			System.out.println(id);
			System.out.println(name);
		}
		
	}

}
