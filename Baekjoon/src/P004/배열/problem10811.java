package P004.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class problem10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

//		int[] arr = new int[N];
		int [] arr = IntStream.range(0, N).map(i -> i+1).toArray();

		int i = 0;
		while (i < M) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int input1 = Integer.parseInt(st2.nextToken())-1;
			int input2 = Integer.parseInt(st2.nextToken())-1;
			int rangelen = input2-input1+1;
			//바구니 번호 확인!
			for(int j=0;j<rangelen/2;j++) {
				int dummy = 0;
				dummy=arr[input1+j];
				arr[input1+j]=arr[input2-j];
				arr[input2-j]=dummy;
			}
//			System.out.println(Arrays.toString(arr));
			i++;
		}
		bw.write(Arrays.toString(arr)
				.replace("[", "")
				.replace("]","")
				.replace(",",""));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
