package P003.반복문;
import java.util.*;
public class problem25304 {
	public static void main(String[] args) {
	
	Scanner scr = new Scanner(System.in);
	int totalValue = scr.nextInt();
	int line = scr.nextInt();
	int sum=0;
	for(int i=1;i<=line;i++) {
		int a = scr.nextInt();
		int b = scr.nextInt();
				sum+=a*b;
	}
		if (sum==totalValue) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
			
}
