package P002.조건문;

import java.util.*;

public class problem02884_알람시계 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int H = scr.nextInt();
		int M = scr.nextInt();

		if (M >= 45) {
			M = M - 45;
		} else {
			M = M + 15;
			
			if (H == 0) {
				H = 23;
			} else {
				H = H - 1;
			}
		}
		System.out.println(H+" "+M);
		
		scr.close();
	}
}