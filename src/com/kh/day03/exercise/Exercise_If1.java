package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// ���� �ϳ��� �Է¹޾Ƽ� ���� ��������, 0����, ���� ��������
		// �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// indent ���� : ctrl + shift + f
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		String result = ""; 
		// ���� �Ǻ�
		if (num == 0) {
			result = "0";
		} else if (num > 0) {
			result = "���� ����";
		} else {
			result = "���� ����";
		}

		// �Ǻ� �� ���

		System.out.println(result + "�Դϴ�.");
	}

}
