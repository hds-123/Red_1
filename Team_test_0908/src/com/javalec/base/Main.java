package src.com.javalec.base;

import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.org.apache.xpath.internal.operations.Plus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println("번째 숫자를 입력하세요 : ");
		num3 = sc.nextInt();
		
		
		Plus plus = new Plus(num1,num2,num3);
		Minus minus = new Minus(num1,num2,num3);
		Mult mult = new Mult(num1,num2,num3);
		Division division = new Division(num1,num3);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ결과ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		int plus = plus.Plus();
		int minus = minus.Minus();
		int mult = mult.Mult();
		int division = division.Division();
		
		
		System.out.println("덧셈:"+plus);
		System.out.println("뺼셈:"+minus);
		System.out.println("곱셈:"+mult);
		System.out.println("나눗셈:"+division);
		
		
		
		
	}

}
