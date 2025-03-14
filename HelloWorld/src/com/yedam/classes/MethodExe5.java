package com.yedam.classes;

public class MethodExe5 {
	public static void main(String[] args) {
		// 상수선언.
		int num1 = 10;
		num1 = 20;
		
		final int num2 = 20; // 상수 선언.
//		num2 = 30; // 상수는 변경불가.
		
		
		final Product p1 = new Product();
		p1.setProductCode("A001");
		
		p1.setProductCode("B001"); // 변수의 값이 아닌 필드의 값을 바꾸는거라 final 과 상관 X
		
//		p1 = new Product(); // 상수 : 새로운값을 담을수 없음.
		
	}
}
