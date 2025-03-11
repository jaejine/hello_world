package com.yedam.ref;

public class ArrayExe3Calender {
	// 2025년 기준으로 월 정보를 넣으면 1일의 위치를 반환.
	public static int getFirstDay(int month) {
		switch(month){
			case 1:
				return 3;
			case 2:
				return 6;
			case 3:
				return 6;
			case 4:
				return 2;
			default:
				return 1;
		}
	}
	// 2025년 기준 월의 마지막날 반환.
	public static int getLastDate(int month) {
		int date = 31; // 1, 3, 5, 7, 8, 10, 12월.
		switch(month) {
			case 2:
				date = 28;
				break;
			case 4:
				date = 30;
				break;
			case 6:
				date = 30;
				break;
			case 9:
				date = 30;
				break;
			case 11:
				date = 30;
				break;
			case 12:
				date = 30;
		}
		return date;
	}
	public static void main (String[] args) {
		// 1 ~ 31 콘솔에 출력(print (옆으로 쭉 출력) vs. println (줄바꿈)
		
		String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};	
		// 요일 출력
		for(String day : days) {
			System.out.print(" " + day);
		}
		System.out.println(); // 줄바꿈
		int month = 3;
		int space = getFirstDay(month); // 1일의 위치값.
		int lastDate = getLastDate(month); // 마지막날. 공백 갯수만큼 빈칸.
		for(int i=0; i<space; i++) {
			System.out.print("    ");
			}
		
		// 날짜 출력. "1" -> 1 : integer.parseInt()
		for(int d=1; d <= lastDate; d++) {
			if(month == 3 && d == 21) {
				System.out.print("  시험");
			}
			else if(String.valueOf(d).length() == 1) {   //  정수타입을 문자열로 d가 1일경우 렝스가 1
				System.out.print("   " + d);
			} else if(String.valueOf(d).length() == 2) {
				System.out.print("  " + d);
			}
			if ((space+d) % 7 == 0) { // 줄바꿈
				System.out.println();
			}
			}
		}
	}
