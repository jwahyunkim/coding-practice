package practice;

import java.util.*;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int col = sc.nextInt();
		for (int k = 1; k < 10; k++) {
			for (int i = 1; i < 10; i++) {
				for (int j = (k - 1) * col + 2; j < k * col + 2; j++) {
					if (j > 9)
						continue;
					System.out.print(j + "x" + i + "=" + i * j);
					System.out.print("\t");
				}
				System.out.print("\n");
			}
			System.out.println("");
		}
	}
}