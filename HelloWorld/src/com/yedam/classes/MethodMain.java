package com.yedam.classes;

public class MethodMain {
	
//	public static void main(String[] args) {
		
		public static void main(String[] args) {
			MethodExe3 m3 = new MethodExe3();
			m3.printStar(5, "★");			
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
