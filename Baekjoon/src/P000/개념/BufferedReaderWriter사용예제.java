package P000.개념;

import java.util.*;
import java.io.*;

public class BufferedReaderWriter사용예제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		for(int i = 0; i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write(A+" "+B+"\n");
		}
		
		bw.flush();
	}
	
}
