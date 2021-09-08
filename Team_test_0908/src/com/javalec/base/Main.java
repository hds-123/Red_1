package src.com.javalec.base;

import java.util.Scanner;

import sre.com.javalec.Division.Division;
import sre.com.javalec.Minus.Minus;
import sre.com.javalec.Mult.Mult;
import sre.com.javalec.plus.Plus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
		Division division = new Division(num1,num3, num3);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ결과ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		int plus_num = plus.Plus();
		int minus_num = minus.Minus();
		int mult_num = mult.Mult();
		int division_num = division.Division();
		
		
		System.out.println("덧셈:"+plus_num);
		System.out.println("뺼셈:"+minus_num);
		System.out.println("곱셈:"+mult_num);
		System.out.println("나눗셈:"+division_num);
		
		
		
		
	}

}
