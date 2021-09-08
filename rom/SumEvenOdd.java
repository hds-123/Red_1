package com.javalec.function;

public class SumEvenOdd {

	// Filed or Property: 여기에 쓰는 변수는 전역변수. 온 동네방네 다 알고있음.
	private int num1 = 0; // private 적으면 실행부에서 ctrl+space해도 확인안됨.
	int num2 = 0;
	int sumNum = 0;
	
	//Constructor: 생성자
	// 자바의 오버로드: 
	public SumEvenOdd() {
		
	} // Constructor
	
	// 마우스 오른쪽->source->Generate~Field click->생성.
	public SumEvenOdd(int num1, int num2) {
		super();
		this.num1 = num1; // 이 클래스에 잇는 넘원이라는 뜻.
		this.num2 = num2;
	}




	//Method(=function): 기능역할/ 안에 있는 변수들은 다 모르는 사이임.
	// Public: 공용가능한 method라는 뜻.<-> private면 나만 씀.
	
	/*
	 * public int sumCalc(int i, int j) {
		int sum = 0;
		for(int x = i; x <= j; x++) {
			sum += x;
		}
		return sum; //return: 값을 main에 보내주는 역할.
		
	}*/ //1.0v
	
		public int sumCalc() {
		int sum = 0;
		for(int x = num1; x <= num2; x++) {
			sumNum += x;
		}
		return sumNum; //return: 값을 main에 보내주는 역할.
		}
	
		//실행 클래쓰랑 맞춰주면 됨.
	
	public String evenOdd(int i) { //void를 적으면 return 안함.
		String result;
		int j = i % 2;
		if(j == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		return result;
		
		//MVC Pattern(M View Control): 면접 기초 질문, 기초 개념.
		
	}
	
	
	
} //class
