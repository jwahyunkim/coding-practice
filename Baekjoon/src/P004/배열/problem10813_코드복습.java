package P004.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class problem10813_코드복습 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st1 = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());

		// IntStream.range사용
		int[] arr = IntStream.range(0, N).map(i -> i + 1).toArray();

//		 배열은 Arrays.toString()해서 확인해 볼 수 있다.
//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());

			int basketnum1 = Integer.parseInt(st2.nextToken())-1;
			int basketnum2 = Integer.parseInt(st2.nextToken())-1;
			int dummy = 0;

			dummy = arr[basketnum1];
			arr[basketnum1] = arr[basketnum2];
			arr[basketnum2] = dummy;
		}
		String result = Arrays.toString(arr)
					.replace("[","")
					.replace("]","")
					.replace(",","");
					
//		for(int i =0;i<arr.length;i++) {
//			bw.write(arr[i]+" ");
//		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(result);
		bw.write(result);
		bw.newLine();
		bw.write(Arrays.toString(arr));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
