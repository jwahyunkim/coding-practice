package P003.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem10951 {
public static void main(String[] args) throws IOException {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        String line ;
	        
	        while ((line = br.readLine()) != null) {   // 입력이 null이 아닐 때까지 반복
	            StringTokenizer st = new StringTokenizer(line);
	            
	            int A = Integer.parseInt(st.nextToken());
	            int B = Integer.parseInt(st.nextToken());
	            
	            bw.write(A + B + "");
	            bw.newLine();
	            bw.flush();
	        }
	        
	        bw.close();  // BufferedWriter 자원 해제
	        br.close();  // BufferedReader 자원 해제
	       
	    }

}
