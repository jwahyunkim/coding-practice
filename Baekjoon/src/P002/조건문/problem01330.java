package P002.조건문;
import java.util.*;
public class problem01330 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		int A = scr.nextInt();
		int B = scr.nextInt();
		
		if(A<B) {
			System.out.println("<");
		}else if (A>B) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
		
		scr.close();
		
		}
	}
