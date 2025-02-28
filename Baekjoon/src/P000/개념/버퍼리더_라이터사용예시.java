package P000.개념;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class 버퍼리더_라이터사용예시 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한 줄의 입력을 받아서 공백 기준으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // A + B + C의 합을 출력
        bw.write(String.valueOf(A + B + C));
        bw.flush();
    }
}
