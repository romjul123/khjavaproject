package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// ctlr + space bar
		
		System.out.print("int ���� �Է����ּ��� : ");
		int input1 = sc.nextInt();
		System.out.println("�Է��� �� : " + input1);
		
		System.out.print("int ���� �ѹ� �� �Է����ּ��� : ");
		int input2 =  sc.nextInt();
		System.out.println("�Է��� �� : " + input2);
		// print�� println�� ���� : �ٹٲ�
		
		int result = input1 + input2;
		System.out.println("�� ���� ���� : " + result + "�Դϴ�.");
		//sc.close();
	}

}