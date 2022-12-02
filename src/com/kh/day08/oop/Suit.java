package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) ȣ��!"); // (1)
	}
	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int, String) ȣ��"); // (2)
	}
	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int,String,int) ȣ��"); // (3)
	}
	

}
