package P004.배열;

import java.util.*;

public class problem10871 {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int x = scr.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}
	
		for (int i = 0; i < arr.length; i++) {
			if (x > arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}

	}
}
