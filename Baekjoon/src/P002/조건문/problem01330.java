
package P002.조건문;
import java.util.*;
public class problem01330 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int A = scr.nextInt();
		int B = scr.nextInt();
		String result;
		
		if(A>B) {
			result=">";
			}
		else if(A<B) {
			result="<";
			}
		else  {
			result ="==";
			}
		
		System.out.println(result);
		scr.close();
	
		}
		
 

	}
