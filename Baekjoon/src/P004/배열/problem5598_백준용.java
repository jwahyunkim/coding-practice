package P004.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem5598_백준용 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[28];
		int cnt = 0;
		while (cnt < 28) {
			String input = (br.readLine());

			int studentNumber = Integer.parseInt(input);
			arr[cnt] = studentNumber;
			cnt++;
		}

		int[] missing = new int[2];
		int x = 0;
		outer: for (int k = 1; k <= 30; k++) {
			for (int j = 0; j < arr.length; j++) {
				if (k == arr[j]) {
					continue outer;
				}
			}
			missing[x] = k;
			x++;
		}
		for (int m : missing) {
			bw.write(m + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
