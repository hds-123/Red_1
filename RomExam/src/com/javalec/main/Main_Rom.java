package com.javalec.main;

import java.util.Scanner;

public class Main_Rom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3���� ������ �Է¹޾� ������ �ϰ�, ������ ���ڰ�
		// Ȧ������ ¦������ ����غ�����!!!
		
		int[] nums = new int[3]; //����ڰ� �Է��� ���ڵ�
		int numbers = 0; // ���� 3���� ������.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(nums[i] + "��° ���� �Է��غ�����!: ");
		nums[i] = scanner.nextInt();
		
		MultiCalc multicalc = MultiCalc(numbers);
		multicalc.MultiCalc();
		// ��¸޽��� = �Է��Ͻ� ������ ������� "�����"�Դϴ�.
		// �������, �۾��Ͻñ� �ٶ���.
		// �̷��� �ϸ� ������ �� �𸣰���. ������� �غ��� �ذ��� �����ָ� �����ϰ���.
		
		MulEvenOdd mulevenodd = MulEvenOdd(int result);
		mulevenodd.MulEvenOdd();
		// ��¸޽��� = �Է��Ͻ� ������ ������� "result" �Դϴ�.
		// �ټ������!^^ ���� �����ؼ�.. �ѹ� ���ð� �ǵ�� �ֽø� �����ϰ�����!
	}

}
