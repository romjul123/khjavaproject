package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.print("0�̴�");
		} else if (num > 0) {
			System.out.print("�����");
		} else {
			System.out.print("������");
			
		}
	}

	
}
