package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// 정수 하나를 입력받아서 양의 정수인지, 0인지, 음의 정수인지
		// 판별하는 프로그램을 작성하시오.
		// indent 정리 : ctrl + shift + f
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		String result = ""; 
		// 정수 판별
		if (num == 0) {
			result = "0";
		} else if (num > 0) {
			result = "양의 정수";
		} else {
			result = "음의 정수";
		}

		// 판별 후 출력

		System.out.println(result + "입니다.");
	}

}
