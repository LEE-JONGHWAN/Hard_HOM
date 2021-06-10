package com.jhlee.hardshop.store;

import java.util.Scanner;

import com.jhlee.hardshop.utility.BrandName;

public class Test_List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true; //무한 루프를 위한 boolean
		int num = 0;
		int score[] = {}; //수치를 받으면 배열 변수 선언 시 초기화 해줘야 한다.
		var brandName = BrandName.values();
		while(bool) {
			System.out.println("============================================================================");
			System.out.println("                                                                            ");
			System.out.println("1.제품코드|2.제품브랜드|3.제품이름|4.제품설명|5.하드디스크용량|6.제품이미지|7.제품내용|8.제품가격|   ");
			System.out.println("9.제품무게|10.하드디스크수량|11.하드디스크판매수량|12.하드디스크판매누적량|13.제조일|14등록일|15.종료 ");
			System.out.println("                                                                            ");
			System.out.println("============================================================================");
			System.out.println("선택>");
			int menu = sc.nextInt();
			
		switch(menu) {
		case 1 :
			System.out.println("제품코드>");
		break;
		case 2 :
			System.out.println("제품브랜드>");
		break;
		case 3 :
			System.out.println("제품이름>");
		break;
		case 4 :
			System.out.println("제품설명>");
		break;
		case 5 :
			System.out.println("하드디스크용량>");
		break;
		case 6 :
			System.out.println("제품이미지>");
		break;
		case 7 :
			System.out.println("제품내용>");
		break;
		case 8 :
			System.out.println("제품가격>");
		break;
		case 9 :
			System.out.println("제품무게>");
		break;
		case 10 :
			System.out.println("하드디스크수량>");
		break;
		case 11 :
			System.out.println("하드디스크판매수량>");
		break;
		case 12 :
			System.out.println("하드디스크판매누적량>");
		break;
		case 13 :
			System.out.println("제조일>");
		break;
		case 14 :
			System.out.println("등록일>");
		break;
		default :
			System.out.println("종료");
		bool = false; // 무한루프를 종료 시킨다.
		
			}
		}

	}

}
