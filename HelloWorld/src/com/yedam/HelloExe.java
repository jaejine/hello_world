package com.yedam;

public class HelloExe {
	String name;
	String tell;
	String old;
	
	// 기능(함수) => main 이라고 하는 메소드.
	public static void main(String[] args) {
		HelloExe m1 = new HelloExe();
		
		// 1. 32000 변수선언과 할당.
		int num1;
		num1 = 32000;
		
		// 2. 34, 32, 88, 23 정수 값담기
		int[] num2 = {2, 34, 32, 88, 23};
		
		// 3. 문자 : 32
		String moon = "32";
		
		// 4. 정수변수에 저장
		int moon2 =  Integer.parseInt(moon);
		
		// 5. 문자를 여러개 담을수 있는 변수
		// Hello, Nice, Good
		String[] moon3 = {"Hello","Nice","Good"};
		
		// 6. 정수 5개 저장.
		// Math.random() => 60 ~ 100 
//		int[] numbers = new int[5];
//		for(int i=0; i<=numbers.length; i++) {
//			numbers[i] = (int) (Math.random() *41 ) + 60;
//		}
		
		// 7. 이름, 연락처, 나이선언.
		String[] name = {"홍길동","김민식","최문식"};
		int[] tell = {010-1234-1234,010-2222-2222,010-3333-3333};
		int[] old = {20,22,23};
		
		
		// 8. [3]
		// 값을 홍길동, 010-1234-1234, 20
		// 김민식, 010-2222-2222, 22
		// 최문식, 010-3333-3333, 23
		
		
		
				
		// 9. 나이가 제일 많은 사람의 이름을 출력
		

		
		
	}
}