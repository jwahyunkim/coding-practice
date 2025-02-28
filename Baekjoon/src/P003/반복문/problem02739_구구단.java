package P003.반복문;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class problem02739_구구단 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int input2 = Integer.parseInt(st.nextToken());
		
		for(int i = 1;i<10;i++) {
			
			bw.write(String.valueOf(input2+" * "+i+" = "+input2*i));
			bw.newLine();
			bw.flush();
		}
		
		
		
	}
}
	