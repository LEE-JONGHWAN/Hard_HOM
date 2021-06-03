package com.jhlee.hardshop;

import java.awt.Image;
import java.io.File;
import java.time.LocalDate;


/**
 * 하드디스크
상품 정보: 이미지 1장, 설명 텍스트, 제품 설명 문서(odt 파일), 가격,
 용량, 제조일자, 재고 수량, Q&A, 구매후기(평점 등)
관련 기능: 상품 등록, 정보 수정
 */
public class TraditionalHard {
	String 제품코드; // 하드디스크 제품코드.
	String 제품브랜드; // 하드디스크 제품 브랜드 이름.
	String 제품이름; // 하드디스크 제품 이름.
	String 제품설명; // 하드디스크 제품 정보 출력.
	String 하드디스크용량; // 하드 디스크 용량 별 정보 출력.
	Image 제품이미지; // 이미지(jpg, png, bmp, jpng)
	File 제품내용; // 설명 odt 파일
	double 제품가격; // 하드디스크 제품 가격 정보.
	int 제품무게; // 하드 디스크 무게.
	int 하드디스크수량; // 하드 디스크 재고 수량.
	int 하드디스크판매수량; // 하드 다스크 판매 수량.
	int 하드디스크판매누적량; // 하드 디스크 판매 누적량.
	LocalDate 제조일; // 하드 디스크 제조일자.
	LocalDate 등록일; // 하드 디스크 등록일자.	

}

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







