package P002.조건문;
import java.util.Scanner;

public class problem02884_알람시계AI {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int H = scr.nextInt(); // 시간 (시)
        int M = scr.nextInt(); // 시간 (분)

        if (M < 45) {  
            M = M + 60 - 45; // 분에서 45를 빼는 대신 60을 더한 후 45를 뺍니다.
            H--;             // 시간이 한 시간 줄어듭니다.
            
            if (H < 0) {     // 만약 H가 0이어서 H가 -1이 되었을 경우 23으로 변경
                H = 23;
            }
        } else {
            M = M - 45; // M이 45 이상일 경우 간단히 45를 뺍니다.
        }

        System.out.println(H + " " + M);
        scr.close();
    }
}
