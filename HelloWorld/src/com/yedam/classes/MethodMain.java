package com.yedam.classes;

import java.util.Scanner;

public class MethodMain {
	
//	public static void main(String[] args) {
		
		public static void main(String[] args) {
			officeApp();
			
		} // end of main.
		
		static void officeApp() {
			
			// 목록,추가,수정,삭제.....
			MethodExe2 m2 = new MethodExe2(); // 기능정의.
			
			// 사용자 입력 받아서 1.목록, 2.추가, 3.수정, 4.삭제 9.종료 구현하기.
			// 입력메세지 정의 구현.
			Scanner scn = new Scanner(System.in);
			int syssta = scanner.nextInt();
			
		}
		
		void method4() {
//			MethodExe4 m4 = new MethodExe4();
			MethodExe4.main();
		}
		
		
		void method3() {
//			MethodExe4 m4 = new MethodExe4();
			MethodExe4.main();	
		}
		
//		// 상품코드: M001, 상품명: 만년필, 가격: 10000
//		MethodExe2 m2 = new MethodExe2();
//		// 상품코드, 상품명, 가격 modify(Product prod)
////		Product prod = new Product("A001", "지우개1000", 0);
////		if (m2.modify(prod)) {
////			System.out.println("수정성공");
////		}
//		Product search = new Product();
//		search.setProductName("지우개"); // 상품코드 상품명 가격
//		search.setPrice(500); // 전체 가격 중에 700원 이상 되는것만 검색
//		
//		Product[] list = m2.productList(search);
//		for (int i = 0; i < list.length; i++) {
//			if (list[i] != null) {
//				System.out.println(list[i].showList());
//			}
//		}
//	} // end of main.

	void method1() {
		MethodExe1 m1 = new MethodExe1();
//		System.out.println(m1);
		// 메소드 호출.
		int n = 5;
		m1.printString(n, "★");

		double result = m1.sum(n, 10.5);
		System.out.println(result);

		int sum = m1.sum(new int[] { 10, 20, 30 });
		result = m1.sum(new double[] { 10.5, 22.1, 34.5 });
		System.out.println(sum);
	}
}
