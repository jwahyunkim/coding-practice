package P003.반복문;

import java.util.*;
import java.io.*;

public class problem02438 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int i = 0;
		while(i<input) {
			i++;
			int j = 0;
			while(j<i) {
				bw.write(String.valueOf("*"));
				j++;
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}
}
