package 숙제;

import java.util.*;
import java.io.*;

public class retry_problem10952 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(;;) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if (A==0&&B==0) {
				break;
					}	
			bw.write(A+B+"");
			bw.newLine();
		}		
		bw.flush();
		
		

	}
}
