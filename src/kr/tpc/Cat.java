package kr.tpc;

public class Cat extends Animal {
	public void night() {
		System.out.println("밤에 눈에서 빛이난다.");
	}

	@Override
	public void eat() {
		System.out.println("고양이가 사료를 먹고 있다.");
	}
	
	public Cat() {
		super(); //new Animal 한 것과 동일
	}
	
}
