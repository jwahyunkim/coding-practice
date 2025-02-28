package P003.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem02439 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(br.readLine());

		int i = 0;
		while (i < input) {
			i++;

			int j = input;
			while (j > i) {
				bw.write(" ");
				j--;
			}
			int k = 0;
			while(k<i) {
				bw.write("*");
				k++;
			}

			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
