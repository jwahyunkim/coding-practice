package P004.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class problem10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st1.nextToken());
		int x = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int [] arr = new int [num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(st2.nextToken());
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<x) {
				bw.write(arr[i]+" ");
			}
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
