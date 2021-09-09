package com.javalec.main;

import java.util.Scanner;

public class Main_Rom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3개의 정수를 입력받아 곱셈을 하고 곱셈한 숫자가
		// 홀수인지 짝수인지 출력해보시지!!
		
		int[] nums = new int[3]; //사용자가 입력한 숫자
		int numbers = 0; // 숫자 3개의 곱셈값
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(nums[i] + "��° ���� �Է��غ�����!: ");
		nums[i] = scanner.nextInt();
		
		MultiCalc multicalc = MultiCalc(numbers);
		multicalc.MultiCalc();
		// 출력메시지 = 입력하신 숫자의 결과값은 "결과값"입니다.
		// 김재원쿤, 작업하시길 바람다.
		// 이렇게 하면 나오는 지 모르겠음. 재원쿤이 해보고 해결방안 말해주면 수정하겠음.
		
		
		MulEvenOdd mulevenodd = MulEvenOdd(int result);
		mulevenodd.MulEvenOdd();
		// 출력메시지 = 입력하신 숫자의 결과값은 "result" 입니다.
		// 다솜팀장님!^^ 제가 부족해서.. 한번 보시고 피드백 주시면 수정하겠음다!
	}

}
