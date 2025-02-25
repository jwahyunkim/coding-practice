package Chap4_array;

import java.util.*;

public class 실습4_2 {
	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		int max = 0;
		int min = 999;
		int sum = 0;
		int count = 0;
		double avg;
		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
				sum += arr[i][j];
				count = arr.length * arr[i].length;
			}
		}
		avg = (double)sum / count;

		System.out.println("최대 : " + max + ", 최소 : " + min + ", 합계 : " + sum + ", 개수 : " + count + ", 평균 : " + avg);
System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j==0) {System.out.print("[");} 
				System.out.print(arr[i][j]);
				if(j==3) break;
				System.out.print(",");
				if(j==3) break;
				System.out.print("\t");
			}
			System.out.print("]");
			System.out.println("");
		}System.out.println();

	}

}

// 2차원 배열 생성 및 초기화
/*
 * 2차원 행렬 [3][4]을 matrix 정수 변수로 선언하고 12개 값을 초기화
 */

// 최대값, 최소값, 합 개수 초기화
/*
 * max, min, sum, count 정수 변수를 선언, 초기 값 지정 for 문을 사용하여 최대, 최소, 합, 개수를 계산
 */

// 평균 계산
/*
 * sum을 사용하여 평균을 avg 변수로 선언하여 저장
 */

// 결과 출력
/*
 * 2차원 배열을 행렬 형태(테이블 형태)로 출력 최대, 최소, 합, 개수, 평균을 다음과 같이 출력
 * "최대=**, 최소=**, 합 = **, 갯수=**, 평균=**"
 */
