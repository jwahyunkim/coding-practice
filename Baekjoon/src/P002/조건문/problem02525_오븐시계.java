package P002.조건문;

import java.util.*;

public class problem02525_오븐시계 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int H = scr.nextInt();
		int M = scr.nextInt();
		int T = scr.nextInt();
		int cal = 0;

		cal = M + T;
		
		M = cal;
		
		if (cal / 60 > 0) {
			H = H + cal / 60;
			if (H >= 24) {
				H = H - 24;
			}

			M = cal % 60;
		}

		System.out.println(H + " " + M);
	}
}
