package com.yedam.variable;

import java.util.Scanner;

// 예금,출금,잔고 확인가능.

public class VarExe5 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 예금액을 담고있는 변수.
		Scanner scn = new Scanner(System.in);
		while(run) {
			// 10만원 최대, 잔액 > 0 조건
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			int menu = scn.nextInt();
			switch(menu) {
			case 1:
				System.out.println("금액을 입력 => ");
				int max = scn.nextInt();
				if(100000 > max + balance) {
					balance = balance + max;
				}else{
					System.out.println("금액은 10만원 이상 입금하실수 없습니다.");
					}
				break; // case 1 종료.
			case 2:
				System.out.println("출금 금액은 => ");
				balance = balance - scn.nextInt();
				System.out.println("출금후 잔액은 => " + balance);
				break;
			case 3:
				System.out.println("현재 잔고는 : " + balance);
				break;
			case 4:
				run = false;
			}
		}
		System.out.println("end of prog.");
	} // end of main().
}
