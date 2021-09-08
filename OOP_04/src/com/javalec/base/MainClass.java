package com.javalec.base;

import java.util.Scanner;

import com.javalec.div.Di;
import com.javalec.minus.Minus;
import com.javalec.multi.Multiplication;
import com.javalec.plus.Calc;
import com.javalec.plus.Plus;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int firstNum = 0;
		int secondNum = 0;
		double result = 0.0;
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		firstNum = scanner.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요 : ");
		secondNum = scanner.nextInt();
		
		Plus plus = new Plus(firstNum, secondNum);
		Minus minus = new Minus(firstNum, secondNum);
		Multiplication multiplication = new Multiplication(firstNum, secondNum);
		Di di = new Di(firstNum, secondNum, result);
		
		System.out.println(">>>>>> 결과 <<<<<<");
		int plus_num = plus.Plus(); // 덧셈
		int Minus_num = minus.minus_num(); // 뺄셈
		int multi_num = multiplication.MULtiplication(); // 곱셈
		double div_num = di.Division(); // 나눗셈
		
		System.out.println("덧셈 : " + plus_num);
		System.out.println("뺄셈 : " + Minus_num);
		System.out.println("곱셈 : " + multi_num);
		System.out.println("나눗셈 : " + div_num); 

	}

}
