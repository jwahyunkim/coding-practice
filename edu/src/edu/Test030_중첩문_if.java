package edu;

public class Test030_중첩문_if {

	public static void main(String[] args) {
		int i=6;
		if((i%2)==0){
			System.out.println(i+"은 2의 배수입니다.");
			if((i%3)==0){
				System.out.println(i+"은 3의 배수입니다.");
			}
		}

	}

}
