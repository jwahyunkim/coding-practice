package self;

public class 생성자o {
	private int number; // 필드
	private String name; // 필드

	// 생성자
	public 생성자o(int number, String name) {
		this.number = number;
		this.name = name;
	}

	// 메서드																	
	public void printInfo() {
		System.out.println("Number: " + number + ", Name: " + name);
	}
}
