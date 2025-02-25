package object;

class Person3 {
	// 필드 (private)
	/*
	 * name은 String, age는 int, weight는 float로 필드들을 private 선언 subjects을 교육과목 private
	 * 배열 year을 수강 연도 private 배열 count 필드를 사용하여 수강 과목 증가시마다 ++count
	 */
	// 필드
	private String name;
	private int age;
	private float weight;
	private String subjects[];
	private int years[];
	private int count;

	// 메소드
	void show() {
		// 기본 정보 출력::name=**, age=**, weight=**로 출력

		// 교육과목 및 수강 연도 출력
		/*
		 * while 문을 사용하여 교육과목과 수강연도를 출력
		 */
		System.out.println("name=" + name);
		System.out.println("age=" + age);
		System.out.println("weight=" + weight);

		count = 0;

		while (count < subjects.length) {
			System.out.println("years=" + years[count]);
			System.out.println("subjects=" + subjects[count]);
			count++;
		}

	}

	void addSubjectYear(String[] subject, int[] years) {
		this.subjects = subject;
		this.years = years;
	}// 과목, 수강연도를 매개변수로 전달받아 배열에 추가

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}
}

public class 실습5_3배열필드 {
	public static void main(String[] args) {
		// 첫 번째 객체 생성 및 초기화
		Person3 p1 = new Person3();
		// 다음 코드를 setter, addSubjectYear를 사용하여 수정

		p1.setName("홍길동");
		p1.setAge(25);
		p1.setWeight(60.56f);

		String[] subjects1 = { "Mathematics", "Science", "History" };
		int[] years1 = { 2020, 2021, 2022 };

		p1.addSubjectYear(subjects1, years1);
		// 메소드 호출
		p1.show();

		// 두 번째 객체 생성 및 초기화
		Person3 p2 = new Person3();
		p2.setName("강감찬");
		p2.setAge(55);
		p2.setWeight(62.34f);
		
		String[] subjects2 = { "Literature", "Philosophy", "Physics" };
		int[] years2 = { 2018, 2019, 2020 };

		p2.addSubjectYear(subjects2, years2);
		// 메소드 호출
		p2.show();
	}
}
