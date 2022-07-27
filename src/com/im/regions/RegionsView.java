package com.im.regions;

import java.util.ArrayList;

public class RegionsView {
	public void view() throws Exception {
		RegionsDAO rdao = new RegionsDAO();
		RegionsDTO rdto = new RegionsDTO();
		rdto = rdao.getDetail(2);
		System.out.println(rdto.getId());
		System.out.println(rdto.getName());
		
		
	}
	
	public void view2() throws Exception {
		RegionsDAO rdao = new RegionsDAO();
		RegionsDTO rdto2 = new RegionsDTO();
		ArrayList<RegionsDTO> rdto = new ArrayList<>();
		rdto = rdao.getList();
		for(int i=0; i<rdto.size(); i++) {
			rdto2 = rdto.get(i);
			System.out.println(rdto2.getId());
			System.out.println(rdto2.getName());
		}
	}

}
