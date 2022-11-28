package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.print("0이다");
		} else if (num > 0) {
			System.out.print("양수다");
		} else {
			System.out.print("음수다");
			
		}
	}

	
}
