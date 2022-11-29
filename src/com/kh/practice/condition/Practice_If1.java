package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		String result = "";
		if (num == 0) {
			result = "0이다";
		} else if (num > 0) {
			result = "양수다";
		} else {
			result = "음수다";
		}
		System.out.println(result);
		
				
	}

}
