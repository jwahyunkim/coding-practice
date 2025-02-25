package P002.조건문;

import java.util.*;

public class problem02884_알람시계 {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int H = scr.nextInt();
		int M = scr.nextInt();

		if (H > 0 && M >= 45) {
			M = M - 45;
		} else if (H > 0 && M < 45) {
			H = H - 1;
			M = M + 15;
		} else if (H == 0 && M < 45) {
			H = 23;
			M = M + 15;
		} else if (H == 0 && M >= 45) {
			M = M - 45;
		}

		System.out.println(H + " " + M);
		scr.close();
	}

}
