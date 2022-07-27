package com.im.countries;

import java.util.ArrayList;

public class CountriesView {
	public void view(CountriesDTO cdto) {
		System.out.println(cdto.getCountry_id());
		System.out.println(cdto.getCountry_name());
		System.out.println(cdto.getRegion_id());
	}
	public void view(ArrayList<CountriesDTO> ar) {
		CountriesDTO cdto = new CountriesDTO();
		for(int i=0; i<ar.size(); i++) {
			cdto = ar.get(i);
			System.out.println(cdto.getCountry_id());
			System.out.println(cdto.getCountry_name());
			System.out.println(cdto.getRegion_id());
		}
	}

}
