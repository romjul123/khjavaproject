package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		// �Է��� ������ 1~100 ������ �������� Ȯ���ϼ���!
		// ��, 50�̶�� ���ڴ� ���� num�� �ʱ�ȭ���ּ���
		// 1���� 100������ �����ΰ�? : true
		//int num = 50;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : "); //���̵� �޽��� �Է��ؾ� ��
		int num = sc.nextInt();
		// 1���� 100 �������� �Ǻ�
		// ��� ���
		boolean result = (1 < num) && (num < 100);
			System.out.println("1���� 100������ �����ΰ�? : " + result);
					
		
	}

}
