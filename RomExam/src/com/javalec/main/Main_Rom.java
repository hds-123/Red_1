package com.javalec.main;

import java.util.Scanner;

public class Main_Rom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3개의 정수를 입력받아 곱셈을 하고, 곱셈한 숫자가 짝수인지 홀수인지 판단해보기
		
		
		int[] nums = new int[3]; 
		int numbers = 0; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(nums[i] + "��° ���� �Է��غ�����!: ");
		nums[i] = scanner.nextInt();
		
		MultiCalc multicalc = MultiCalc(numbers);
		multicalc.MultiCalc();
		
		MulEvenOdd mulevenodd = MulEvenOdd(int result);
		mulevenodd.MulEvenOdd();
		
	}

}
