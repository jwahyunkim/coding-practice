package Chap5_객체;

	class Person1 {

		private String name;
		private int age;
		private float weight;

		// 필드 (private)
		/*
		 * name은 String, age는 int, weight는 float로 필드들을 private 선언 교재 p198 Armor.java 참조
		 */

		// name 메소드: setter, getter 함수, 교재 p199
		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		// age 메소드:setter, getter 함수 구현, 교재 p199
		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		// weight 메소드: setter, getter 함수 구현, 교재 p199
		public void setWeight(float weight) {
			this.weight = weight;
		}

		public float getWeight() {
			return weight;
		}

		// 이름, 나이, 몸무게를 출력하는 show 메소드
		public void show() {
			System.out.println(getName());
			System.out.println(getAge());
			System.out.println(getWeight());
		}

		// 오버로딩된 show 메소드 (message를 출력)
		public void show(String msg) {
			System.out.println("메시지 = " + msg);
			System.out.println(getName());
			System.out.println(getAge());
			System.out.println(getWeight());
			// 이름, 나이, 몸무게를 출력하는 코드 작성
		}
	}

	public class 실습5_2메소드오버로딩 {
		public static void main(String[] args) {
			// 객체 생성
			Person1 p = new Person1();
			p.setName("홍길동");
			p.setAge(25);
			p.setWeight(62.123f);
			// 다음 코드를 디버깅
			System.out.println("이름 = " + p.getName() + ", 나이 = " + p.getAge() + ", 몸무게 = " + p.getWeight());

			// 메소드 호출
			p.show();
			p.show("오버로딩");
		}
	}
