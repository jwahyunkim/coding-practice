package edu;

public class Test020_if_esle_if문 {

	public static void main(String[] args) {
		int score = 90;		
		char grade;
		
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80){
			grade = 'B';
		}
		else if(score>=70){
			grade = 'C';
		}
		else if(score>=60){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println(grade);

	}

}
