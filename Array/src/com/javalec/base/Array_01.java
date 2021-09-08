package com.javalec.base;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 초기값이 있는 경우
		String[] day = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		day[0] = "둘리";
//		day[7] = "둘리"; // 에러발
		System.out.println(day[7]);
		
		// 초기값이 없을 경우
		String[] str = new String[7] ; //데이터를 7개 담을수 있는 변수 str
		
		// 이 방식으로 데이터의 수정도 가능! 하지만 append는 할수없음
		str[0] = "Sunday" ;
		str[1] = "Monday" ;
		str[2] = "Tuesday" ;
		str[3] = "Wednesday" ;
		str[4] = "Thursday" ;
		str[5] = "Friday" ;
		str[6] = "Saturday" ; // 주말
		
//		System.out.println(str.length); // str의 길이
//		System.out.println(str[6]);
		
//		for (int i = 0; i < str.length; i++) {
//			System.out.println("str[" + i + "]=" + str[i]);
//		}
//		
//		for (int i = 0; i < str.length; i++) {
//			System.out.println("str[" + i + "]=" + day[i]);
//		}
		
		

		
		
		
		
		
		
		
		
	}//

}//
