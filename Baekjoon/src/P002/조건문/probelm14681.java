package P002.조건문;
import java.util.*;
public class probelm14681 {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int x= scr.nextInt();
		int y= scr.nextInt();
		
		
		if(x>0) {
			if(y>0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}else {
			if(y>0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
		
		scr.close();
	}

}
