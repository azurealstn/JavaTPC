package kr.tpc;

public class Animal {
	//Dog, Cat의 공통 메소드 eat()
	public void eat() {
		System.out.println("?가 사료를 먹고 있다.");
	}
	
	public Animal() {
		super(); //new Object한 것과 동일
	}
}
