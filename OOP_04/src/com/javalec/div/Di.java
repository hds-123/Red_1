package com.javalec.div;

public class Di {
	// filed
	int fSum = 0;
	int sSum = 0;

	// con
<<<<<<< Updated upstream
	public Di(int fSum, int sSum) {

=======
	public void Division1() {
//		int i = 0;
		
>>>>>>> Stashed changes
	}

	// method
	public double Division() {
		double result = 0.0;
		
		if (fSum != 0 & sSum != 0) {
			result = (double) fSum / sSum;
			return result;

		} else {
			System.out.println("나누는 값이 0일수 없습니다.");
			return result;
		}
		
	}
}
