package com.jhlee.hardshop.store;

import com.jhlee.hardshop.utility.BrandName;

public class HardShop implements Comparable<HardShop>{
	private String 제품명;
	private String 선택;
	private Double 제품가격;
	private Double 수익;
	
	public HardShop(String 제품명, String 선택, Double 제품가격, Double 수익) {
		super();
		this.제품명 = 제품명;
		this.선택 = 선택;
		this.제품가격 = 제품가격;
		this.수익 = 수익;
	}
	
	public String get제품명() { return 제품명;}
	public void set제품명(String 제품명) {this.제품명 = 제품명;}
	public String get선택() {return 선택;}
	public void set선택(String 선택) {this.선택 = 선택;}
	public Double get제품가격() {return 제품가격;}
	public void set제품가격(Double 제품가격) {this.제품가격 = 제품가격;}
	public Double get수익() {return 수익;}
	public void set수익(Double 수익) {this.수익 = 수익;}

	public static void main(String[] args) {
		System.out.println("====================");
		System.out.println("JH 하드샵에 환영합니다");
		System.out.println("==================== \n\n");
		var brandNames = BrandName.values();
		boolean run = true; // 무한 루프 돌릴 때 사용한다.

		
	}

	@Override
	public int compareTo(HardShop o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
