package kr.poly;

public class Dog extends Animal {
	//이름, 나이, 종 : 상태정보
	//행위정보 -> 메소드
	//재정의
	public Dog() {
		super(); //new Animal 한 것과 동일
	}

	@Override
	public void eat() {
		System.out.println("강아기가 사료를 먹다.");
	}
}
