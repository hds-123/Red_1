package com.javalec.main;

import java.util.Scanner;

import com.javalec.function.MultiCalc;
import com.javalec.function.MultiCalc2;

public class Main_Rom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3개의 정수를 입력받아 곱셈을 하고, 곱셈한 숫자가 짝수인지 홀수인지 판단해보기
		
		Scanner scanner = new Scanner(System.in);
		int number01 = 0; 
		int number02 = 0;
		int number03 = 0;
		
		System.out.print("숫자를 입력해 보시지! ");
		number01 = scanner.nextInt();
		
		System.out.print("숫자를 입력해 보시지! ");
		number02 = scanner.nextInt();
		
		System.out.print("숫자를 입력해 보시지! ");
		number03 = scanner.nextInt();
		
		
		
		MultiCalc mul = new MultiCalc(number01,number02,number03);
	
		MultiCalc2 mul2 = new MultiCalc2(number01, number02);
		
//		MulEvenOdd mulevenodd = MulEvenOdd(int result);
//		mulevenodd.MulEvenOdd();
//		
	}

}
