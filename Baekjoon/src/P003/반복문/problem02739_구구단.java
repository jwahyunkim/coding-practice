package P003.반복문;
import java.util.*;
public class problem02739_구구단 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int dan = scr.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(dan+" * "+i+" = "+dan*i );
			scr.close();
		}
	}
}
