package P004.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());

		int[] arr = new int[N];

		for (int l = 0; l < M; l++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st2.nextToken()) - 1;
			int j = Integer.parseInt(st2.nextToken());
			int k = Integer.parseInt(st2.nextToken());

			for (; i < j; i++) {
				arr[i] = k;
			}

		}
		for (int m = 0; m < arr.length; m++) {

			bw.write(arr[m] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
