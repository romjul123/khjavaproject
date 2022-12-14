package com.kh.day16.setcollection;

public class Student {
	private String name;
	private int score1;
	private int score2;
	
	public Student() {
		super();
	}

	public Student(String name, int score1, int score2) {
		super();
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	@Override
	public int hashCode() {
		return (this.name+this.score1+this.score2).hashCode();
	}
	
	public String information() {
	return "name : " + this.name + ", score1 : " + this.score1 + ", score2 : " + this.score2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : " + this.name + ", score1 : " + this.score1 + ", score2 : " + this.score2;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return this.hashCode() == std.hashCode();
		}else {
			return false;
		}
	}

}
