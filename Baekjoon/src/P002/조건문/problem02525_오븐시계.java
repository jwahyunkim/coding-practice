package P002.조건문;

import java.util.*;

public class problem02525_오븐시계 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int H = scr.nextInt();
		int M = scr.nextInt();
		int requiredTime = scr.nextInt();

		if (M + requiredTime >= 60) {
			H=H+(M + requiredTime)/60;
			M = (M + requiredTime)%60;
			if (H > 23) {
				H = H%24;
				
			}
		}else {
			M=M+requiredTime;
		}
		
		System.out.println(H+" "+M);
		scr.close();

	} 
}
