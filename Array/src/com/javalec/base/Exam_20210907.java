package com.javalec.base;

import java.util.Scanner;

public class Exam_20210907 {

	public static void main(String[] args) {
		// 2021. 09. 06. 월요일
		// 1. ------------------------------------------------------------------
		// 몇 개의 숫자를 입력할지 결정한 후
		// 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악
		
		/*
		 * 	입력할 숫자의 갯수? :4
			4개의 숫자를 입력하세요! 
			1의 숫자 :11
			2의 숫자 :22
			3의 숫자 :33
			4의 숫자 :44
			검색할 숫자는? :22
			22의 위치는 2번째입니다.
		 */

//		Scanner scanner = new Scanner(System.in);
//		
//		// 변수 선언
//		int inputNumber = 0;
//		int serchNumber = 0;
//		int inputnumIndex = 0;
//		int notsame = 0;
//		int countNumber = 0;
//
//		// 데이터 입력
//		System.out.print("입력할 숫자의 갯수? :");
//		inputNumber = scanner.nextInt();
//		
//		System.out.println(inputNumber + "개의 숫자를 입력하세요! ");
//		
//		// 배열 변수 선언
//		int[] number = new int[inputNumber]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
//		
//		for(int i = 0; i < inputNumber; i++) {
//			System.out.print((i+1) + "의 숫자 :");
//			number[i] = scanner.nextInt();
////			System.out.println(number[i]);
//		}
//		
//		System.out.print("검색할 숫자는? :");
//		serchNumber = scanner.nextInt();
//		
//		for(int i = 0; i < inputNumber; i++) {
//			if(serchNumber == number[i]) {
//				inputnumIndex = i;
//				System.out.println(serchNumber + "의 위치는 " + (inputnumIndex + 1)+"번째입니다.");
//			}else {
//				notsame += 1;
//			}
//		}
//		
//		if (notsame == inputNumber) {
//			System.out.println(serchNumber + "는 존재하지 않습니다.");
//		}

		// 2. ------------------------------------------------------------------
		
		/*
		 * 	입력할 숫자의 갯수? :4
			4개의 숫자를 입력하세요! 
			1의 숫자 :11
			2의 숫자 :22
			3의 숫자 :33
			4의 숫자 :44
			몇번째의 숫자를 삭제 하시겠습니까? :3
			------ 결과 ------
			11
			22
			44
		 */
		
//		Scanner scanner = new Scanner(System.in);
//
//		// 변수 선언
//		int inputNumber = 0;
//		int inputnumberIndex = 0;
//		int delNumber = 0;
//		int i = 0;
//
//		// 데이터 입력
//		System.out.print("입력할 숫자의 갯수? :");
//		inputNumber = scanner.nextInt();
//
//		System.out.println(inputNumber + "개의 숫자를 입력하세요! ");
//
//		// 배열 변수 선언
//		int[] number = new int[inputNumber]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
//
//		for (i = 0; i < inputNumber; i++) {
//			System.out.print((i + 1) + "의 숫자 :");
//			number[i] = scanner.nextInt();
//		}
//
//		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? :");
//		delNumber = scanner.nextInt();
//
//		for (i = delNumber; i < inputNumber; i++) {
//			number[i - 1] = number[i];
//
//		}
//		System.out.println("------ 결과 ------");
//
//		for (int j = 0; j < (inputNumber-1) ; j++) {
//			System.out.println(number[j]);
//		}

		// 3. ------------------------------------------------------------------
		
		/*
		 * 	입력할 숫자의 갯수? :4
			4개의 숫자를 입력하세요! 
			1의 숫자 :11
			2의 숫자 :22
			3의 숫자 :33
			4의 숫자 :44
			숫자를 삽입하고자 하는 위치는 ? :3
			삽입하고자 하는 수 ? :88
			number 4 = 44
			number 3 = 33
			------ 결과 ------
			11
			22
			88
			33
			44
		 */

//		Scanner scanner = new Scanner(System.in);
//
//		// 변수 선언
//		int inputNumber = 0;
//		int inputnumberIndex = 0;
//		int pushNumber = 0;
//		int i = 0;
//
//		// 데이터 입력
//		System.out.print("입력할 숫자의 갯수? :");
//		inputNumber = scanner.nextInt();
//
//		System.out.println(inputNumber + "개의 숫자를 입력하세요! ");
//
//		// 배열 변수 선언
//		int[] number = new int[inputNumber+1]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
//
//		for (i = 0; i < inputNumber; i++) {
//			System.out.print((i + 1) + "의 숫자 :");
//			number[i] = scanner.nextInt();
//		}
//
//		System.out.print("숫자를 삽입하고자 하는 위치는 ? :");
//		inputnumberIndex = scanner.nextInt();
//
//		System.out.print("삽입하고자 하는 수 ? :");
//		pushNumber = scanner.nextInt();
//
//		for (i = inputNumber ; i >= inputnumberIndex; i--) {
//			number[i] = number[i-1];
//			System.out.println("number " + i + " = "+ number[i]);
//		}
//
//		number[inputnumberIndex - 1] = pushNumber;
//
//		System.out.println("------ 결과 ------");
//
//		for (int j = 0; j < (inputNumber + 1); j++) {
//			System.out.println(number[j]);
//		}

		// 4. ------------------------------------------------------------------
		// 10개의 점수(0점부터 99점)를 입력받아 점수의 분포를 10점 간격의 등급으로 된 히스토그램을 표시하라.
		
		/*
		 * 	몇명의 점수를 입력하시겠습까? :
			10
			1의 score :10
			2의 score :20
			3의 score :30
			4의 score :40
			5의 score :50
			6의 score :60
			7의 score :70
			8의 score :80
			9의 score :90
			10의 score :98
			------ Histogram ------
			90 : # # 
			80 : # 
			70 : # 
			60 : # 
			50 : # 
			40 : # 
			30 : # 
			20 : # 
			10 : # 
		 */

//		Scanner scanner = new Scanner(System.in);
//		
//		// 변수 선언
//		int inputNumber = 0;
//		int score = 0;
//		
//		// 데이터 입력
//		System.out.println("몇명의 점수를 입력하시겠습니까? :");
//		inputNumber = scanner.nextInt();
//				
//		// 배열 변수 선언
//		int[] histo = new int[inputNumber]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
//		
//		for (int i = 0; i < inputNumber; i++) {
//			System.out.print((i + 1) + "의 score :");
//			score = scanner.nextInt();	
//			histo[score / 10]++;
//		}
//		
//		System.out.println("------ Histogram ------");
//		
//		for (int j = 9; j > 0 ; j--) {
//			System.out.print((j*10) + " : ");
//			for(int i = 0; i < histo[j]; i++ ) {
//				System.out.print("# ");
//			}
//			System.out.println();
//		}

		// 5. ------------------------------------------------------------------

		// 아래의 그림과 같이 고객의 입금, 출금 및 현황을 관리하는 Program을 작성하라
		// 단, 고객명은 1,2,3,4,5
		
		/*
		 * 	1. 입금
			2. 출금
			3. 현황
			4. 종료
			번호를 선택하세요! 
			1
			고객번호 : 
			2
			금액 : 
			300
			입금 결과 : 고객번호 : 2 잔액 : 300
			----------------------------
			1. 입금
			2. 출금
			3. 현황
			4. 종료
			번호를 선택하세요! 
			2
			고객번호 : 
			2
			금액 : 
			150
			출금 결과 : 고객번호 : 2 잔액 : 150
			----------------------------
			1. 입금
			2. 출금
			3. 현황
			4. 종료
			번호를 선택하세요! 
			3
			고객명	잔액
			----	----
			1	0
			2	150
			3	0
			4	0
			5	0
			----------------------------
			1. 입금
			2. 출금
			3. 현황
			4. 종료
			번호를 선택하세요! 
			4
			>>>>> Thank you <<<<<
		 */
//		Scanner scanner = new Scanner(System.in);
//
//		// 변수 선언
//		int inputNumber = 0;
//		int customerNumber = 0;
//		int customerCash = 0;
//		int[] customer = { 1, 2, 3, 4, 5 };
//		int[] cash = new int[5];
//
//		while (inputNumber != 4) {
//			System.out.println("1. 입금");
//			System.out.println("2. 출금");
//			System.out.println("3. 현황");
//			System.out.println("4. 종료");
//
//			System.out.println("번호를 선택하세요! ");
//			inputNumber = scanner.nextInt();
//
//			if (inputNumber == 1) {
//				System.out.println("고객번호 : ");
//				customerNumber = scanner.nextInt();
//				System.out.println("금액 : ");
//				customerCash = scanner.nextInt();
//				cash[customerNumber - 1] = cash[customerNumber - 1] + customerCash;
//				System.out.println("입금 결과 : 고객번호 : " + customerNumber + " 잔액 : " + cash[customerNumber - 1]);
//				System.out.println("----------------------------");
//			} else if (inputNumber == 2) {
//				System.out.println("고객번호 : ");
//				customerNumber = scanner.nextInt();
//				System.out.println("금액 : ");
//				customerCash = scanner.nextInt();
//
//				if (cash[customerNumber - 1] >= customerCash) {
//					cash[customerNumber - 1] = cash[customerNumber - 1] - customerCash;
//					System.out.println("출금 결과 : 고객번호 : " + customerNumber + " 잔액 : " + cash[customerNumber - 1]);
//					System.out.println("----------------------------");
//				}
//				if (customerCash > cash[customerNumber - 1]) {
//					System.out.println("잔액이 부족합니다! ");
//					System.out.println("----------------------------");
//				}
//			} else if (inputNumber == 3) {
//				System.out.println("고객명\t" + "잔액");
//				System.out.println("----\t" + "----");
//				for (int i = 0; i < 5; i++) {
//					System.out.println((i + 1) + "\t" + cash[i]);
//				}
//				System.out.println("----------------------------");
//			}
//		}
//
//		System.out.println(">>>>> Thank you <<<<<");

		// 5. switch ver. -------------------------------------------------------

		// 아래의 그림과 같이 고객의 입금, 출금 및 현황을 관리하는 Program을 작성하라
		// 단, 고객명은 1,2,3,4,5
//		Scanner scanner = new Scanner(System.in);
//
//		// 변수 선언
//		int inputNumber = 0;
//		int customerNumber = 0;
//		int customerCash = 0;
//		int[] customer = { 1, 2, 3, 4, 5 };
//		int[] cash = new int[5];
//
//		while (inputNumber != 4) {
//			
//			System.out.println("1. 입금");
//			System.out.println("2. 출금");
//			System.out.println("3. 현황");
//			System.out.println("4. 종료");
//			
//			System.out.println("번호를 선택하세요! ");
//			inputNumber = scanner.nextInt();
//			
//			switch(inputNumber) {
//			
//			case 1 :
//				System.out.println("고객번호 : ");
//				customerNumber = scanner.nextInt();
//				System.out.println("금액 : ");
//				customerCash = scanner.nextInt();
//				cash[customerNumber - 1] = cash[customerNumber - 1] + customerCash;
//				System.out.println("입금 결과 : 고객번호 : " + customerNumber + " 잔액 : " + cash[customerNumber - 1]);
//				System.out.println("----------------------------");
//				break;
//			case 2 :
//				System.out.println("고객번호 : ");
//				customerNumber = scanner.nextInt();
//				System.out.println("금액 : ");
//				customerCash = scanner.nextInt();
//
//				if (cash[customerNumber - 1] >= customerCash) {
//					cash[customerNumber - 1] = cash[customerNumber - 1] - customerCash;
//					System.out.println("출금 결과 : 고객번호 : " + customerNumber + " 잔액 : " + cash[customerNumber - 1]);
//					System.out.println("----------------------------");
//				}
//				if (customerCash > cash[customerNumber - 1]) {
//					System.out.println("잔액이 부족합니다! ");
//					System.out.println("----------------------------");
//				}
//				break;
//			case 3 :
//				System.out.println("고객명\t" + "잔액");
//				System.out.println("----\t" + "----");
//				for (int i = 0; i < 5; i++) {
//					System.out.println((i + 1) + "\t" + cash[i]);
//				}
//				System.out.println("----------------------------");
//				break;
//			}
//		}
//		System.out.println(">>>>> Thank you <<<<<");
		
		// 5. switch 기억하기 ====================================================
//		switch(inputNumber % 2) {
//		case 0 :
//			result = "짝수" ;
//			break;
//		case 1 :
//			result = "홀수";
//			break;
//		case -1 :
//			result = "error";
//			break;
//		default :
//			result = "error";
//			break;
//		} // default 안써줘도 됨


		

	} //

} //
