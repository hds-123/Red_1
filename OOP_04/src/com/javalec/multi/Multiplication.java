package com.javalec.multi;

public class Multiplication {

	//field
	int fNum = 0;
	int sNum = 0;
	
	//constructor
	
	public Multiplication(int fNum, int sNum) {
		super();
		this.fNum = fNum;
		this.sNum = sNum;
	}
	
	//method0
	
	public int MULtiplication(){
		int result = fNum * sNum; //함수가 리턴해주려고 만든 값이다.
		return result;
	}

}
