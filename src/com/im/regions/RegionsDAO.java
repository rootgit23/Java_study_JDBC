package com.im.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.im.util.DBConnect;

public class RegionsDAO {
	
	//Regions에 데이터를 추가
	public int setRegion(RegionsDTO regionDTO) throws Exception {
		Connection con = DBConnect.getConnection();
		String sql = "INSERT INTO REGIONS VALUES(?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, regionDTO.getId());
		st.setString(2, regionDTO.getName());
		int result = st.executeUpdate();
		DBConnect.disConnect(st, con);
		return result;
	}
	
	//2. Regions에서 하나의 결과
	public RegionsDTO getDetail(int region_id) throws Exception {
		//1. DB 연결
		Connection con = DBConnect.getConnection();
		//2. Query문 작성
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID=?";
		//3. 만든 Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 값을 세팅
		//WHERE NUM BETWEEN ?(1) AND ?(2); 무조권 앞에부터 순서대로 오라클DB는 0번째가 아닌 1번째부터 인덱스 
		st.setInt(1, region_id); //앞 번째 위치의 ?에 뒤에 값을 넣어라 
		//5. 최종 전송후 결과를 처리
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			RegionsDTO rdto = new RegionsDTO();
			int rid = rs.getInt(1);
			rdto.setId(rid);
			String rname = rs.getString(2);
			rdto.setName(rname);
			return rdto;
		}
		//6.자원해제
		DBConnect.disConnect(rs, st, con);
		return null;
		
	}
	
	//1. Regions 테이블의 모든 데이터 가져오기
	public ArrayList<RegionsDTO> getList() throws Exception {
		//1.DB 연결
		Connection con = DBConnect.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM REGIONS";
		
		//3. Query문을 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.
		
		//5.최종 전송후 결과를 처리
		ResultSet rs = st.executeQuery();
		ArrayList<RegionsDTO> ar = new ArrayList<>();
		int index = 0;
		while(rs.next()) {
			
			RegionsDTO rdto2 = new RegionsDTO();
			int id = rs.getInt("REGION_ID");
			rdto2.setId(id);
			String name = rs.getString("REGION_NAME");
			rdto2.setName(name);
			ar.add(rdto2);
			index++;
		}
		
		//6.자원해체
		DBConnect.disConnect(rs, st, con);
		if(index != 0) {
			return ar;
		}
		else
			return null;
		
	}

}
