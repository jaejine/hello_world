package com.yedam.bookApp;
/*
 * 실행 클래스 (main을 담고있는 메소드)
 */
public class BookApp {
	public static void main(String[] args) {

		BookMain mainApp1 = BookMain.getInstance();
//		mainApp.main(args);
		BookMain mainApp2 = BookMain.getInstance();
		
		mainApp1.add(); // 1번의 등록.
		mainApp1.list();
		
		mainApp2.list(); // 2번의 목록.
		
	}
}
