package com.kh.day05.array;

public class Exam_SortSelect {
	public static void main(String [] args) {
		// �˰��� ����
		// 1. ��������
		// 2. ��������
		// 3. ��������
		// ���������̶�?
		// �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		// Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����������
		// ������ ���� ���� �� �ް��� ���� ���ϸ� ����.
		// �迭�� n�� �ε������� n+1�� ~ ������ �ε������� ����.
		int [] arrs = {2, 5, 4, 1, 3};
		int min; // �ε����� ����
		for(int i = 0; i < arrs.length; i++) {
			min = i; // ���� ���� �� �ε��� ��
			for(int j = i+1; j < arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}
		// i=0�϶�
		// 1, 5, 4, 2, 3 // ù��° ���
		// i=1�϶�
		// 1, 2, 4, 5, 3 // �ι�° ���
		// i=2�϶�
		// 1, 2, 3, 5, 4
		// i=3�϶�
		// 1, 2, 3, 4, 5
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
