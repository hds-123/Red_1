package com.javalec.base;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 평균, 최대, 최소의 신장값과 이름 구하기-----------------------------------
//		Scanner scanner = new Scanner(System.in);
//		
//		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"} ;
//		int[] height = new int[name.length];
//		int heightSum = 0;
//		int heightMax = 0;
//		int heightMin = 300;
//		int heightmaxIndex = 0;
//		int heightminIndex = 0;
//		
//		for (int i = 0; i < name.length; i++) {
//			System.out.print(name[i] + "의 신장을 입력하세요!");
//			height[i] = scanner.nextInt();
//			heightSum += height[i];
//		}
//		
//		System.out.println("평균 신장은 : " +(double) heightSum / height.length);
//		
//		for(int i = 0; i < height.length; i++)
//			if(height[i] < heightMin) {
//				heightMin = height[i];
//				heightminIndex = i;
//			}
//		System.out.println("가장 작은 학생은 " + name[heightminIndex] + "이고 그 학생의 키는 " + height[heightminIndex] + "입니다.");

		// 2. 사용자에게 숫자를 입력받은만큼 추가로 입력받아 최댓값 구하기---------------------
		// 몇 개의 숫자를 입력할지 결정한 후
		// 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라.
		// 입력할 숫자의 갯수 ? (100개 미만) : 5
		// 5개의 숫자를 입력하세요!
		// 11
		// 12
		// 13
		// 14
		// 15
		// 입력한 숫자중 최대값은 15이고 5번째 값입니다.

//		Scanner scanner = new Scanner(System.in);
//
//		int inputNumber = 0; // 사용자가 입력할 숫자의 갯수 (100개 미만)
//		int allnumberMax = 0; // 최댓값
//		int allnumbermaxIndex = 0; // 최댓값 번지수
//	
//
//		System.out.println("입력할 숫자의 갯수 ? (100개 미만) :");
//		inputNumber = scanner.nextInt();
//		int[] allNumber = new int[inputNumber]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
//		
//		System.out.println(inputNumber + "개의 숫자를 입력하세요!");
//		
//		for(int i = 0; i < inputNumber; i++) {
//			allNumber[i] = scanner.nextInt();
//			if(allnumberMax < allNumber[i]) {
//				allnumberMax = allNumber[i];
//				allnumbermaxIndex = i+1;
//			}
//		}
//		
//		System.out.println("입력한 숫자중 최대값은 " + allnumberMax + "이고 " + allnumbermaxIndex + "번째 값입니다.");
/*
		// 3. 학생수가 4명이고 과목이 3과목일 경우 점수 합계와 평균 구하기 기능 추가-------------
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수를 입력 :");
		int inputNumber = 0;

		inputNumber = scanner.nextInt();
		
		String[] subject = { "Korean", "English", "Mathmatics" };
		int[][] korean = new int[inputNumber][]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
		int[] english = new int[inputNumber]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
		int[] mathmatics = new int[inputNumber]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
		int[] total = new int[inputNumber]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함
		int[] average = new int[inputNumber]; // 입력할 숫자의 갯수에 따라 배열 길이 결정함

		for (int j = 0; j < subject.length; j++) {
			System.out.println(subject[j] + "의 성적을 입력 !");
			
			if(subject[j] == "Korean") {
				for(int i = 0; i < inputNumber; i++) {
					System.out.print("No" + (i+1) + "의 성적은 : ");
					korean[i] = scanner.nextInt();
				} 
			}// if
			if (subject[j] == "English") {
				for(int i = 0; i < inputNumber; i++) {
					System.out.print("No" + (i+1) + "의 성적은 : ");
					english[i] = scanner.nextInt();
					}
				} // if
			if (subject[j] == "Mathmatics") {
				for(int i = 0; i < inputNumber; i++) {
					System.out.print("No" + (i+1) + "의 성적은 : ");
					mathmatics[i] = scanner.nextInt();
				}
			} // if
			} // for
		for (int j = 0; j > inputNumber; j++) {
			
			total[j] = korean[j] + english[j] + mathmatics[j];			
			average[j] = (korean[j] + english[j] + mathmatics[j])/3 ;
		}
		

		System.out.println("\t" + "Korean" + "\tEnglish" + "\tMathmatics" + "\tTotal" + "\tAverage");
		for (int d = 0; d < inputNumber; d++) {
			System.out.println("No" + (d+1) + "\t" + String.format("%4d",korean[d]) + "\t" 
					+ String.format("%5d",english[d]) + "\t" + String.format("%5d\t",mathmatics[d]) 
					+ "\t" + String.format("%4d",total[d]) + "\t" + String.format("%4d",average[d]));
		}
		
		*/
	}//

}//

//System.out.println("korean 의 성적을 입력 :");
//for (int j = 0; j < inputNumber; j++) {
//	System.out.print("No" + (j + 1) + "의 성적은 : ");
//	korean[j] = scanner.nextInt();
//}
//System.out.println("English 의 성적을 입력 :");
//for (int j = 0; j < inputNumber; j++) {
//	System.out.print("No" + (j + 1) + "의 성적은 : ");
//	english[j] = scanner.nextInt();
//}
//System.out.println("mathmatics 의 성적을 입력 :");
//for (int j = 0; j < inputNumber; j++) {
//	System.out.print("No" + (j + 1) + "의 성적은 : ");
//	mathmatics[j] = scanner.nextInt();
//}
//
//for (int j = 0; j < inputNumber; j++) {
//	total[j] = korean[j] + english[j] + mathmatics[j];
//	average[j] = (korean[j] + english[j] + mathmatics[j])/3 ;
//}
