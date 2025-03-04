package P004.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem02562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int[] arr = new int[st.countTokens()];

		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				cnt = i;
			}
		}

		bw.write(max + "\n");
		bw.write((cnt + 1) + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
