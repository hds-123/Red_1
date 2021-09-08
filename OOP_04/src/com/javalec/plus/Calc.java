package com.javalec.plus;

public class Calc {

	// Field
	int f_num = 0;
	int s_num = 0;
	
	// Constructor

//	public public Calc() {
//		// TODO Auto-generated constructor stub
//	}
	
	
	public Calc(int f_num, int s_num) {
		super();
		this.f_num = f_num;
		this.s_num = s_num;
	}


	// Method

	public int Plus() {
		int i = f_num + s_num;
		
		return i;
	}
	
	public int Minus() {
		int j = f_num - s_num;
		
		return j;
	}
	
	public int Multiplication() {
		int k = f_num * s_num;
		
		return k;
	}
	
	public double Division() {
		double d = (double) f_num / s_num;
		
		return d;
	}
	
	
	
	
	
	
	
	

}// end //
