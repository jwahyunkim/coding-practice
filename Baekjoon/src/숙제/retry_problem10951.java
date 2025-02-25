package 숙제;

import java.util.*;
import java.io.*;

public class retry_problem10951 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;

		while((line=br.readLine())!=null) {
		StringTokenizer st = new StringTokenizer(line);
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write(A + B + "");
			bw.newLine();
			bw.flush();		

		}
				
		

	}
}
