package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void main(String [] args) {
		//System.out.println에서 정수 + 문자열 -> 문자열
		System.out.println(1 + "1");
		// 문자 + 문자 -> 문자
		System.out.println('1' + '1'); // '1' 아스키 코드 숫자 49
		// 정수 + 정수 + 문자열 + 정수 -> 최종적으로는 문자열
		System.out.println(10 + 20 + "Hello" + 10);
		
		// println, print -> 줄바꿈의 차이
		System.out.print("정수 입력 : "); // 바로 옆에 입력받음
		System.out.println("정수 입력 : "); // 줄 바꾸고 입력받음
		System.out.printf("정수 출력 : %d \n", 1);
		System.out.printf("문자열 출력 : %s", "Hello World"); 
		// 정수는 %d 문자열은 %s   , \n 한줄띄우기
		
	} 

}
