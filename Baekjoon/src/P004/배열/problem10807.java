package P004.배열;

import java.io.*;
import java.util.*;

public class problem10807 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] arr = new int[scr.nextInt()];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		int x = scr.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				count++;
			}
		}System.out.println(count);

	}
}
