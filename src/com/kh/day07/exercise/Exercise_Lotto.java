package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개, 로또 번호의 범위는 1 ~ 45
		int [] lottos = new int[6];
		Random rand = new Random();
		// 번호를 뽑는다 
		for(int i = 0; i <lottos.length; i++) {
			// 1 ~ 45 -> 0 ~ 44 -> 1 ~ 45
			lottos[i] = rand.nextInt(45)+1;
			for(int e = 0; e < i; e++) {
				// 비교를 한다. 점점 많아진다.
				// 비교는 이미 뽑은 것과 첫번째부터
				if(lottos[i] == lottos[e]) {
					// 같으면 i--;
					i--;
					break;
				}
			}
		}
		// 정렬
		// 버블정렬 
		// 오름차순
		for(int i = 0; i < lottos.length-1; i++) {
			for(int e = 0; e < (lottos.length-1)-i; e++) {
				if(lottos[e] > lottos[e+1]) {
					int temp = lottos[e+1];
					lottos[e+1] = lottos[e];
					lottos[e] = temp;
				}
			}
			
		}
		// 출력
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
	

}
