package P002.조건문;

import java.util.*;

public class problem02480_주사위문제 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int A = scr.nextInt();
		int B = scr.nextInt();
		int C = scr.nextInt();

		int P = 0;

		int big = A;
		if (B > big)
			big = B;
		if (C > big)
			big = C;

		if (A == B && B == C) {
			P = 10000 + A * 1000;
		} else if (A == B || A == C) {
			P = 1000 + 100 * A;
		} else if (B == C) {
			P = 1000 + 100 * B;
		}else {
			P = big*100;
		}
		System.out.println(P);
		
		scr.close();
	}
}
