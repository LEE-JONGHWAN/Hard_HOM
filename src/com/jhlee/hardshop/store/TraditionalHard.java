package com.jhlee.hardshop.store;

/**
 * TraditionalHard파일 내부이다
 * 
 * @author 이종환(Lee, JongHwan)
 * @version 1.0.0
 */

/**
 *  하기 내용은 파일을 불러올 때 사용 되는 예제이다. 필요할 때 참조하자.
 */
//try{
//    //파일 객체 생성
//    File file = new File("D:/Eclipse/Java/Output.txt");
//     //입력 스트림 생성
//     FileReader file_reader = new FileReader(file);
//     int cur = 0;
//     while((cur = file_reader.read()) != -1){
//        System.out.print((char)cur);
//     }
//     file_reader.close();
//    }catch (FileNotFoundException e) {
//        e.getStackTrace();
//    }catch(IOException e){
//        e.getStackTrace();


/**
 *  하기 내용은 이미지를 불러올 때 사용 되는 예제이다. 필요할 때 참조하자.
 */


import java.awt.Image;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import com.jhlee.hardshop.*;
import com.jhlee.hardshop.utility.BrandName;

/**
 * 하드디스크
상품 정보: 이미지 1장, 설명 텍스트, 제품 설명 문서(odt 파일), 가격,
 용량, 제조일자, 재고 수량, Q&A, 구매후기(평점 등)
관련 기능: 상품 등록, 정보 수정
 */

/**
 * 현재 하기의 리스트를 하나의 클래스로 묶을 내용 정리중.
 * 
 * 제품 목록 => 제품코드/제품브랜드/제품이름/제품설명/제품가격/제품무게/하드디스크용량/제품이미지/제품내용/제조일/등록일
 * 재고및수익 => 하드디스크수량/하드디스크판매수량/하드디스크판매누적량
 * 
 * @author 이종환(Lee JongHwan)
 * @version 1.0.0
 *
 */

public class TraditionalHard {
	private String 제품코드; // 하드디스크 제품코드.
	private String 제품브랜드; // 하드디스크 제품 브랜드 이름.
	private String 제품이름; // 하드디스크 제품 이름.
	private String 제품설명; // 하드디스크 제품 정보 출력.
	private String 하드디스크용량; // 하드 디스크 용량 별 정보 출력.
	private double 제품가격; // 하드디스크 제품 가격 정보.
	private LocalDate 제조일자 = null; // 하드 디스크 제조일자.
	private LocalDate 제품등록일 = null; // 하드 디스크 제품 등록일자.
	private int 제품무게 = 0; // 하드 디스크 무게.
	
	private int 하드디스크수량 = 0; // 하드 디스크 재고 수량.
	private int 하드디스크판매수량 = 0; // 하드 다스크 판매 수량.
	private int 하드디스크판매누적량 = 0; // 하드 디스크 판매 누적량.
	private float 고객평점;
	

	/**
	 * 현 재고 상품들의 각 이름과 이미지 내용등을 그룹화 해야한다.
	 * 
	 * @param 제품 설명란
	 */
	
	public String get제품코드() {return 제품코드;}
	public void set제품코드(String 제품코드) { this.제품코드 = 제품코드;}
	public String get제품브랜드() { return 제품브랜드; }
	public void set제품브랜드(String 제품브랜드) { this.제품브랜드 = 제품브랜드;}
	public String get제품이름() { return 제품이름;}
	public void set제품이름(String 제품이름) { this.제품이름 = 제품이름;}
	public String get제품설명() { return 제품설명;}
	public void set제품설명(String 제품설명) { this.제품설명 = 제품설명;}
	public String get하드디스크용량() { return 하드디스크용량;}
	public void set하드디스크용량(String 하드디스크용량) { this.하드디스크용량 = 하드디스크용량;}
	public LocalDate get제품등록일() {return 제품등록일;}
	public void set제품등록일(LocalDate 제품등록일) {this.제품등록일 = 제품등록일;}
	public LocalDate get제조일자() {return 제조일자;}
	public void set제조일자(LocalDate 제조일자) {this.제조일자 = 제조일자;}


	/**
	 * 
	 * @param 제품가격 및 수량과 판매량
	 */
	public double get제품가격() { return 제품가격;}
	public void set제품가격(double 제품가격) { this.제품가격 = 제품가격;}
	public int get제품무게() { return 제품무게;}
	public void set제품무게(int 제품무게) { this.제품무게 = 제품무게;}
	public int get하드디스크수량() { return 하드디스크수량;}
	public void set하드디스크수량(int 하드디스크수량) { this.하드디스크수량 = 하드디스크수량;}
	public int get하드디스크판매수량() { return 하드디스크판매수량;}
	public void set하드디스크판매수량(int 하드디스크판매수량) { this.하드디스크판매수량 = 하드디스크판매수량;}
	public int get하드디스크판매누적량() { return 하드디스크판매누적량;}
	public void set하드디스크판매누적량(int 하드디스크판매누적량) { this.하드디스크판매누적량 = 하드디스크판매누적량;}
	public float get고객평점() {return 고객평점;}
	public void set고객평점(float 고객평점) {this.고객평점 = 고객평점;}


	//=====================================================================================
	

}











