package P004.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class problem03052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] arr = new int [10];
		ArrayList<Integer> list = new ArrayList<>();
		int i=0;
		while(i<10) {
			arr[i]=Integer.parseInt(br.readLine())%42;
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
			i++;
		}
		
		bw.write(String.valueOf(list.size()));
		bw.flush();
		bw.close();
		br.close();
	}
}
