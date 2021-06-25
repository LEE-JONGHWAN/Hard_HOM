package com.jhlee.hardshop.store;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

import com.jhlee.hardshop.utility.BrandName;

public class HardShop {


	public static void main(String[] args) {
		var jhHard = new HardShop();
		System.out.println("====================");
		System.out.println("JH 하드샵에 환영합니다");
		System.out.println("==================== \n");
		jhHard.selections();
		BrandName type = null;
		do {
			type = jhHard.getHardSelection();
		} while (type == null);
		System.out.println("당신이 주문한 " + type + "을 준비할께요.");
	}
	private BrandName getHardSelection() {
		//@formatter:off
		Scanner scanner = new Scanner(System.in);
		String selection = scanner.nextLine();
		
		selection = selection.trim();
		for (var type : BrandName.values()) {
			if (type.get단축명().equals(selection) || 
					type.name().indexOf(selection) >= 0) {
				System.out.println(type + "?");
				if (selectionConfirmed(type, scanner))
					return type;
			}
		}
		return null;
		//@formatter:on
	}
		
	/**
	 * 고객이 원하는 하드디스크가 맞는지 확인한다.
	 * 
	 * @param type    고객이 선택한 하드디스크 종류
	 * @param scanner 고객 입력 접수용 참조
	 * @return 맞으면 참, 아니면 거짓
	 */
	private boolean selectionConfirmed(BrandName type, Scanner scanner) {
		System.out.println(type + "을 선택하셨습니까?[Y/n] : ");

		String input = scanner.nextLine();

		if (input != null) {
			input = input.trim().toLowerCase();
			if (input.length() == 0 || input.equals("y"))
				return true;
		}
		return false;
	}

	private void selections() {
		LocalDate todays = LocalDate.now();
		//@formatter:off
		String weekDay = todays.format(DateTimeFormatter.
				ofPattern("E").withLocale(Locale.KOREAN)); // 오늘자 요일을 출력한다.
		
		System.out.println("=".repeat(40));
		System.out.println("다음 하드디스크 메이커 중에서 선택하세요:");
		System.out.println("=".repeat(40));
		System.out.println(" * : '" + weekDay + "'요일 특별 할인 하드디스크!");
		BrandName[] brandNames = BrandName.values();
		long specialInx = ChronoUnit.DAYS.between(todays, 
				LocalDate.of(2021, 6, 22)) % brandNames.length;
		//@formatter:on
		for (int i = 0; i < brandNames.length; i++) {
			var hrMenu = new StringBuffer(" -");

			hrMenu.append(brandNames[i]);
			if (i == specialInx)
				hrMenu.append("*");
			System.out.println(hrMenu);
		}
		System.out.println("=".repeat(40));
		System.out.print("단축명(ㄱ-ㅎ), 이름(일부/전부) :");
	}
}
