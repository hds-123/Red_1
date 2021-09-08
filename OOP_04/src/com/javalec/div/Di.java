package com.javalec.div;

public class Di {
	// filed
	int fSum = 0;
	int sSum = 0;
	double result = 0.0;

	// con
//	public Di(int fSum, int sSum) {
//
//	}

	public Di(int fSum, int sSum, double result) {
		super();
		this.fSum = fSum;
		this.sSum = sSum;
		this.result = result;
	}

	// method
	public double Division() {
//		double result = 0.0;
		result = (double) fSum / sSum;
		return result;
	} 
}
