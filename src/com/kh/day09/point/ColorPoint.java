package com.kh.day09.point;

public class ColorPoint extends Point{
	private String color; // 점의 색
	// public ColorPoint() {}   // 기본생성자 없을때 -> ColorPointEx 클래스에서 오류
	public ColorPoint(int x, int y, String color){
		super(x, y);        // x,y 셋팅
		//Point의 생성자 Point(x,y) 호출
		this.color = color;
	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	public void showColorPoint() { // 색, 좌표 출력
		System.out.println(color);
		showPoint();    // Point클래스의 showPoint() 호출
	}

}
