package self;
public class 생성자x {
    private int number;  // 필드
    private String name; // 필드

    // 메서드
    public void printInfo() {
        System.out.println("Number: " + number + ", Name: " + name);
    }

    // 필드 설정 메서드
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}


