package com.javalec.function;

public class MultiCalc {

	// Field
	
	int number01 ,number02, number03;
	
	
	
	
	// Construction
	public MultiCalc() {
	
	}



	
		public MultiCalc(int number01, int number02, int number03) {
		super();
		this.number01 = number01;
		this.number02 = number02;
		this.number03 = number03;


		good();
	}
	

	// Method
	
	public void good(){
		System.out.println(number01 * number02*number03);
		
		
		
	}
	
	
	
	
}
