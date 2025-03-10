package P000.개념;
import java.io.*;
import java.util.*;

public class BuffededReaderWriter개념 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //단일값 입력시
        int n = Integer.parseInt(br.readLine()); // 첫 번째 입력값: 몇 줄을 입력받을지 정함

        for (int i = 1; i <= n; i++) {
        	// 띄어쓰기로 나누어져 있는 값 입력시
            StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄에 입력된 문자열을 분리

            int number = Integer.parseInt(st.nextToken()); // 첫 번째 토큰은 숫자로 변환
            String text = st.nextToken(); // 두 번째 토큰은 문자열로 사용

            bw.write("Number: " + number + ", Text: " + text + "\n"); // 숫자와 문자열을 출력
        }

        bw.flush(); // 출력 버퍼 비우기
    }


}
