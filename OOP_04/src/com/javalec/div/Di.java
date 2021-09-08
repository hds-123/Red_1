package com.javalec.div;

public class Di {
	// filed
	int fSum = 0;
	int sSum = 0;

	// con
	public void Division1() {
		int i = 0;
		
	}
	// method
	public double Division() {
		double result = 0.0;
		if (sSum != 0) {
			result = (double) fSum / sSum;

			return result;
		} else {
			System.out.println("나누는 값이 0일수 없습니다.");
			return result;
		}
	}
}
