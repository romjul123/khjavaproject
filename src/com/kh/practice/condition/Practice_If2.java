package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		String result = "";
		if (num % 2 == 0) {
			result = "¦����";
		} else {
			result = "Ȧ����";
		}
		System.out.println(result);
		
		
	}

}
