package P001.입출력과사칙연산;
import java.util.*;
public class problem10430 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int A = scr.nextInt();
		int B = scr.nextInt();
		int C = scr.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		scr.close();
	}

}
