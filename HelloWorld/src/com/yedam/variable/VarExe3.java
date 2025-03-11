package com.yedam.variable;

import java.util.Scanner;

// 사용자의 입력값을 읽어들이는 방식.
// Scanner 클래스.
public class VarExe3 {
	public static void main(String[] args) {
		Scanner scn // 자바 유틸 패키지에 있는 스캐너
				= new Scanner(System.in); // 키보드를 통해 읽어들임    System.in ( 기본입력 장치 : 키보드 )
		System.out.print("이름을 입력하세요>");
		String name = scn.nextLine(); // 메소드 (함수)
		System.out.print("점수를 입력하세요>");
		int score = scn.nextInt();
		System.out.print("키를 입력하세요>");
		double height = scn.nextDouble(); 
		
		System.out.println("입력한 값 : " + name + ", 점수 : " + score + ", 키 : " + height);
	}
}
