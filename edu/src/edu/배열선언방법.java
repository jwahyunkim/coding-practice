package edu;

public class 배열선언방법 {
public static void main(String[] args) {

	int[]num1= {1, 2, 3, 4, 5}; 	// 배열 선언과 동시에 초기화
	
	int[]num2=new int[5];  	// 배열 선언과 동시에 크기 할당
	
	num2=new int[] {11,22,33,44,55};
	
	int[]num3;       // 배열 선언 후 나중에 초기화
	
	num3 = new int[] {111,222,333,444,555};
	
	for(int a:num1) {
		System.out.println(a);
	}
	for(int b:num2) {
		System.out.println(b);
	}
	for(int c:num3) {
		System.out.println(c);
	}
	
	
	
}
}
