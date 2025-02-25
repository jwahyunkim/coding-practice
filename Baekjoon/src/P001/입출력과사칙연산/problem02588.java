package P001.입출력과사칙연산;

import java.util.*;

public class problem02588 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		int input1 = scr.nextInt();
		int input2 = scr.nextInt();
		
		int A = input1*(input2%10);
		int B = (input1 * (input2 % 100 - input2 % 10));
		int C = (input1 * (input2 % 1000 - input2 % 100));
		
		int D = A+B+C;
		
		System.out.println(A);
		System.out.println(B/10);
		System.out.println(C/100);
		System.out.println(D);
		
		scr.close();
		
	}
}