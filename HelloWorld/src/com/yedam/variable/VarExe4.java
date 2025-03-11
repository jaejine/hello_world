package com.yedam.variable;

import java.util.Scanner;

public class VarExe4 {
	public static void main(String[] args) {
		int[] scores = new int[3]; // 정수 배열을 3개 담을수 있는 공간 {0, 0, 0} ( 값을 입력받아 배열에 넣음 )
		Scanner scn = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
			System.out.println("점수를 입력하시오 : ");
			scores[i] = scn.nextInt();
		}
			for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
			}
			Double avg1 = sum * 1.0 / scores.length;
			System.out.println("합은 : " + sum + "입니다.");
			System.out.println("평균값은 : " + avg1 + "입니다.");
	}
}
