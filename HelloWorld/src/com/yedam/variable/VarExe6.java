package com.yedam.variable;

import java.util.Scanner;

public class VarExe6 {
	public static void test() {
		// 임의의 정수 1 ~ 50 임의의 값.
		//for(int i=1 ; i<=5; i++)
		//System.out.println((int) (Math.random() * 50 ) +1); // 1 <= x < 51
		
		// 학생의 점수 ( 30 ~ 100 사이의 점수)
		// 정수(int) -> 5개 저장. 배열형태
		int[] score = new int[500];
		for(int i=0; i < score.length; i++) {
		  score[i] = (int) (Math.random() *71 ) +30;
		}
		
		// 홀수의 값을 출력.
		for(int i=0; i < score.length; i++) {
			if(score[i] == 100) {
			System.out.println(i + "번째 값:" + score[i]);		
		}
	  } // end of main().
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Member m1 = new Member(); // 인스턴스 생성
//		m1.name = "홍길동";
		m1.setName("홍길동");
		System.out.println(m1.getScore());
		Member m2 = new Member(); // 인스턴스 생성
		m2.setName("최민수");
		Member m3 = new Member(); // 인스턴스 생성
		m3.setName("김병수");
		Member m4 = new Member(); // 인스턴스 생성
		m4.setName("박인만");
		
		// 배열.
		Member[] members = {m1, m2, m3, m4};
		// 70 ~ 100 사이의 임의값으로 점수 지정.
		for(int i=0; i<=3; i++) {
//			members[i].score = ((int)(Math.random() *31 + 70));
			members[i].setScore((int)(Math.random() *31 + 70));
		}
		
		// 조회이름을 입력 -> 점수출력.
		System.out.println("조회할 이름을 입력하시오 : ");
		String search = scn.nextLine();
		
		
		for(int i=0; i<members.length; i++) {
			if(members[i].getName().equals(search)) {
				System.out.println(search + "의 점수는 : " + members[i].getScore());
			}
		}
		
		
		// 점수가 가장 높은 사람의 이름.
//		int max = members[0].score;
//		String name = members[0].name;
//		for(int i=0; i<members.length; i++) {
//			System.out.println(members[i].name+","+members[i].score);
//			if(max < members[i].score) {
//			   max = members[i].score;
//			   name = members[i].name;
//			}
//		}
//		System.out.println("최고점수는" + name);
	}//end of main().
	
}
