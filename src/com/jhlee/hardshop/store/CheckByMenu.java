package com.jhlee.hardshop.store;

import java.util.Comparator;

public class CheckByMenu implements Comparator<HardShop>{
	private String 제품명;
	private String 선택;
	private Double 제품가격;
	private Double 수익;
	

	//@formatter:off
	@Override
	public int compare(HardShop o1, HardShop o2) {
		return o1.get수익().compareTo(수익);
	}
	//@formatter:on

	
}
