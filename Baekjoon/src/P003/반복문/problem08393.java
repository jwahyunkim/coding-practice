package P003.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class problem08393 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(br.readLine());

		
		//i를 1로 하면 조건식에서 '='등호를 붙여야 한다.
		//원래 i=0, 조건식은 i<input으로 했는데 직관적이지 않아 i=1로 해서 수정함
		int i = 1;
		int sum = 0;
		while (i <= input) {
			sum += i;
			i++;

		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}

}
