package P004.배열;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int []arr=new int[n];
		for (int i = 0;i<arr.length;i++) {
			arr[i]=scr.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}if(min>arr[i]){
				min=arr[i];
		}
		}System.out.println(min+" "+max);
	}
}
