package edu;
public class Test036_배열_Alphabet{
public static void main(String[] args) {
	char letter='A';
	char[] alphabet = new char[26];
	
	for(int i=0; i<alphabet.length; i++) {
		alphabet[i]=(char)(letter + i);
	}
	for(char c : alphabet) {
//	for(i=0;i<alphabet.length; i++){} 확장 for 문을 사용하지 않은 경우
		System.out.println(c);
	}
 
	
}
}
