package com.yedam.ref;

public class ArrayExe4 {
	public static void main(String[] args) {
		int[] intAry = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int temp = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = temp;
		
		for (int j=0; j<intAry.length -1; j++) {
			for (int i=0; i<intAry.length -1; i++) {
				if(intAry[i] < intAry[i + 1]) {
					temp = intAry[i];
					intAry[i] = intAry[i+1];
					intAry[i + 1] = temp;
				}
			}
		}
		for (int i=0; i<intAry.length; i++) {
			System.out.print
			(intAry[i]);
		}
	}
}

//System.out.println(intAry[i]);
// i, i+1 번째의 값이 앞의 갚이 크면 내림차순이면 오름차순.

//
//
//if(intAry[0] < intAry[1]) {
//	temp = intAry[1];
//}