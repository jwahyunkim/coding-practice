package P001.입출력과사칙연산;

import java.util.*;

public class problem02588 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int A = scr.nextInt();
		int B = scr.nextInt();

		int hundredsPlace = B / 100;
		int tensPlace = B % 100 / 10;
		int unitPlace = B % 100 % 10;

		int num3 = A * unitPlace;
		int num4 = A * tensPlace;
		int num5 = A * hundredsPlace;
		int num6 = A * B;
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		scr.close();

	}
}