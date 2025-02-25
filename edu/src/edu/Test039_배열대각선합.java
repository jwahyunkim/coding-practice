package edu;

import java.util.Iterator;

public class Test039_배열대각선합 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				if (i == j) {
					sum += arr[i][j];
				}
			}
		}System.out.println("합계 : "+sum);
	}
}
