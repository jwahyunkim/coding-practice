package P003.반복문;
import java.io.*;
import java.util.*;
public class problem11021 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int n = Integer.parseInt(br.readLine());
	for (int i = 0; i < n; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		bw.write("Case #"+(i+1)+": ");
		bw.write((A+B)+"\n");
	}
	bw.flush();
	
	
}
}
