package P003.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem25304 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int total = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		int i = 0;
		while (i < num) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int price = Integer.parseInt(st.nextToken());
			int cnt = Integer.parseInt(st.nextToken());
			sum += price*cnt;
			i++;
		}
		if(total==sum) {
			bw.write("Yes");
			
		}else {
			bw.write("No");
		}
		bw.flush();
		bw.close();
	}

}
