package practice;

import java.util.Scanner;

public class practi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of columns per row: ");
        int columnsPerRow = sc.nextInt();

        // 구구단을 출력하는 반복문
        for (int k = 1; k <= 9 / columnsPerRow + 1; k++) {
            for (int i = 1; i <= 9; i++) {
                for (int j = (k - 1) * columnsPerRow + 2; j < k * columnsPerRow + 2; j++) {
                    if (j > 9) continue;  // 9를 넘는 숫자는 무시

                    System.out.print(j + "x" + i + "=" + j * i + "\t");
                }
                System.out.println();  // 한 행의 출력이 끝나면 줄바꿈
            }
            System.out.println();  // 각 구구단 블록 사이에 빈 줄 추가
        }

        sc.close();  // Scanner 리소스 해제
    }
}
