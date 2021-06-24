package com.jhlee.hardshop.store;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

import com.jhlee.hardshop.utility.BrandName;


public class HardProduct implements Comparable<HardProduct>{
	private BrandName brandNames;
	private double 제품가격; // 하드디스크 제품 가격 정보.
	private LocalDate 제조일자; // 하드 디스크 제조일자.
	private LocalDate 제품등록일; // 하드 디스크 제품 등록일자.
	private int 제품무게; // 하드 디스크 무게.
	private int 하드디스크수량; // 하드 디스크 재고 수량.
	private float 고객평점;
	
	

	
	
	
	public static void main(String[] args) {
		HardProduct[] products = new HardProduct[8];

		// @formatter:off
		products[0] = new HardProduct(BrandName.삼성전자, 
				new BigDecimal(1_2000), LocalDate.of(2020, 12, 2),
				LocalDate.of(2020, 10, 20), 4.1f);
		products[1] = new HardProduct(BrandName.SK하이닉스, 
				new BigDecimal(1_2000), LocalDate.of(2021, 6, 20),
				LocalDate.of(2020, 10, 20), 4.5f);
		products[2] = new HardProduct(BrandName.WD, 
				new BigDecimal(1_2000), LocalDate.of(2021, 2, 11),
				LocalDate.of(2020, 10, 20), 4.8f);
		products[3] = new HardProduct(BrandName.마이크론, 
				new BigDecimal(1_2000), LocalDate.of(2021, 2, 11),
				LocalDate.of(2020, 10, 20), 4.8f);
		products[4] = new HardProduct(BrandName.샌디스크, 
				new BigDecimal(1_2000), LocalDate.of(2021, 2, 11),
				LocalDate.of(2020, 10, 20), 4.8f);
		products[5] = new HardProduct(BrandName.씨게이트, 
				new BigDecimal(1_2000), LocalDate.of(2021, 2, 11),
				LocalDate.of(2020, 10, 20), 4.8f);
		products[6] = new HardProduct(BrandName.웨스턴디지털, 
				new BigDecimal(1_2000), LocalDate.of(2021, 2, 11),
				LocalDate.of(2020, 10, 20), 4.8f);
		products[7] = new HardProduct(BrandName.크루셜, 
				new BigDecimal(1_2000), LocalDate.of(2021, 2, 11),
				LocalDate.of(2020, 10, 20), 4.8f);
		// @formatter:on
		
		Random rand = new Random();
		StringBuffer 정렬기준 = new StringBuffer("정렬기준: ");
		
		if (rand.nextDouble() > 0.5) {
			정렬기준.append("제품등록일 최근순 => ");
			Arrays.sort(products);
		} else {
			정렬기준.append("고객평가 감소순 => ");
			Arrays.sort(products, new CompareHardCustEval());
		}
		System.out.println(정렬기준);
		for (HardProduct product : products) {
			System.out.println(product);
		}
	}
	


	public HardProduct(BrandName brandNames, double 제품가격, LocalDate 제조일자, LocalDate 제품등록일, int 제품무게, int 하드디스크수량,
			float 고객평점) {
		super();
		this.brandNames = brandNames;
		this.제품가격 = 제품가격;
		this.제조일자 = 제조일자;
		this.제품등록일 = 제품등록일;
		this.제품무게 = 제품무게;
		this.하드디스크수량 = 하드디스크수량;
		this.고객평점 = 고객평점;
	}



	public HardProduct( int 하드디스크수량, int 하드디스크판매수량, int 하드디스크판매누적량, float 고객평점) {
		super();
		this.brandNames = brandNames;
		this.제품가격 = 제품가격;
		this.제조일자 = 제조일자;
		this.제품등록일 = 제품등록일;
		this.고객평점 = 고객평점;
	}

	public double get제품가격() {return 제품가격;}
	public void set제품가격(double 제품가격) {this.제품가격 = 제품가격;}

	public LocalDate get제조일자() {return 제조일자;}
	public void set제조일자(LocalDate 제조일자) {this.제조일자 = 제조일자;}

	public LocalDate get제품등록일() {return 제품등록일;}
	public void set제품등록일(LocalDate 제품등록일) {this.제품등록일 = 제품등록일;}

	public int get제품무게() {return 제품무게;}
	public void set제품무게(int 제품무게) {this.제품무게 = 제품무게;}

	public int get하드디스크수량() {return 하드디스크수량;}
	public void set하드디스크수량(int 하드디스크수량) {this.하드디스크수량 = 하드디스크수량;}

	public float get고객평점() {return 고객평점;}
	public void set고객평점(float 고객평점) {this.고객평점 = 고객평점;}

	/**
	 * 
	 * 현 상품들의 제조일과 등록일을 관리한다.
	 * 
	 * @param 제조 등록일
	 */
	
	@Override
	public int compareTo(HardProduct o) {
		return o.제품등록일.compareTo(this.get제품등록일());
	}

	@Override
	public String toString() {
		return "TeaProduct [제품명=" + brandNames + ", 가격=" + 제품가격 
				+ ", 제품등록일=" + 제품등록일 + ", 제조일=" + 제조일자 + ", 고객평점=" + 고객평점
				+ "]";
	}
	
}
