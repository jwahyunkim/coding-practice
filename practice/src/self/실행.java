package self;

import self.생성자x;
import self.생성자o;

public class 실행 {
    public static void main(String[] args) {
        // 생성자x의 객체 생성 (기본 생성자 사용)
        생성자x myObject = new 생성자x();

        // 필드 값 설정
        myObject.setNumber(10);
        myObject.setName("John Doe");

        // 메서드를 호출하여 정보 출력
        myObject.printInfo();
        
        // 생성자를 사용하여 MyClass의 객체 생성
        생성자o myObject2 = new 생성자o(20, "John Doe2");

        // 메서드를 호출하여 정보 출력
        myObject2.printInfo();
    
    }
}


   

