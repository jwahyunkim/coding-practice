package Chap5_객체;

class Student2 {
	// 필드
	/*
	 * name, age, subjects[], scores[], passFail[], count를 private으로 선언 count는 배열의
	 * index로 사용 numberStudents를 정적 필드로 선언
	 */
	private String name;
	private int age;
	private String[] subjects;
	private int[] scores;
	private int[] passFail;
	private int count;
	static int numberStudents;


	// 생성자
	/*
	 * name, age, subjects[], scores[], passFail[], count를 매개변수로 전달받는 생성자 정의
	 * 
	 */

	public Student2(String name, int age, String[] subjects, int[] scores, int[] passFail, int count) {
		super();
		this.name = name;
		this.age = age;
		this.subjects = subjects;
		this.scores = scores;
		this.passFail = passFail;
		this.count = count;
	}

	// setter 메소드: setName(String name), setAge(int age), setSubjects(String
	// subjects[]), setScores(int scores[]), setCount(int num)

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 학생 수를 반환하는 정적 메소드getNumberStudents()

	public static int getNumberStudents() {
		return numberStudents;
	}

	// 학생 정보를 출력하는 메소드 (예시용)

	/*
	 * 이름 = **, 나이 = ** 과목1 = **, 점수1 = ** 과목2 = **, 점수2 = ** ... 등으로 출력
	 */
	public void printStudentinfo() {
		System.out.print("이름 : " + name);
		System.out.println(", 나이 : " + age);

		for (int i = 0; i < subjects.length; i++) {
			System.out.print("subjects" + (i + 1) + " = " + subjects[i]);
			System.out.print(", scores" + (i + 1) + " = " + scores[i]);
			System.out.println(", 통과여부 = "+ ((scores[i]>passFail[i])?"pass":"fail") );
			////////// @@@@@@@@@@@통과여부 넣어야됨@@@@@@@@@@@@@@@@////////////////
		}
	}

	// 학생 정보를 출력하는 메소드 (예시용)
	/*
	 * 이름 = **, 나이 = ** 과목1 = **, 점수1 = **, 통과여부=pass 과목2 = **, 점수2 = **, 통과여부=fail
	 * ... 등으로 출력
	 */
	public static void showStudents(Student2[] students) {
		for (Student2 s : students) {
			s.printStudentinfo();
			System.out.println("-".repeat(20));

		}
	}

	// 통과 여부 (모든 과목을 통과했는지 확인)
	public boolean isPassed() {
		for (int i = 0; i < subjects.length; i++) {
			if (scores[i] < passFail[i]) {
			} else {
			}
		}

		// 주어진 학생이 모든 과목 통여 여부를 반환
	}

	// 6.2.2 각 학생의 성적 테이블을 출력하는 정적 메소드
	public static void printAllStudents(Student[] students) {
		// 학생 이름 + 과목명, 과목 점수 .... + 과목통과여부:pass or fail
	}

	// 6.2.2 과목별 최대/최소 점수 및 해당 학생을 출력하는 정적 메소드
	public static void printSubjectStats(Student[] students) {

	}
}

public class 실습6_3정적메소드 {
	public static void main(String[] args) {
		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };
		int[] passFails = { 40, 70, 60, 55, 80 };
		Student2[] students = { new Student2("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }, passFails, -1),
				new Student2("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }, passFails, -1),
				new Student2("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }, passFails, -1),
				new Student2("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }, passFails, -1),
				new Student2("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }, passFails, -1) };
		// 학생 수를 정적 메소드 호출로 처리

		// 학생 정보 출력 (예시)
		Student2.showStudents(students);

//		// 각 학생의 성적 테이블 출력
//		Student2.printAllStudents(students);
//
//		// 과목별 최대/최소 점수 및 해당 학생 출력
//		Student2.printSubjectStats(students);
	}
}
