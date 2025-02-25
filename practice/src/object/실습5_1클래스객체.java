package object;

class Person {

	String name;
	int age;
	float weight;

	// 필드
	/*
	 * name은 String, age는 int, weight는 float로 필드 선언
	 */

	// 메소드
	void show() {
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		System.out.println("weight = " + weight);

		/*
		 * name=**, age = **, weight = ** 형태로 출력
		 */
	}
}

	public class 실습5_1클래스객체 {
		public static void main(String[] args) {
			// 객체 생성
			Person p = new Person();
			p.name = "강감찬";
			p.age = 55;
			p.weight = 62.34f;

			// 메소드 호출

			p.show();

			/*
			 * [강감찬, 55, 62.34] 객체를 만들어 name=**, age = **, weight = ** 형태로 출력
			 */
		}
	}

