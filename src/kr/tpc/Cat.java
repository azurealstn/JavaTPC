package kr.tpc;

public class Cat extends Animal {
	public void night() {
		System.out.println("�㿡 ������ ���̳���.");
	}

	@Override
	public void eat() {
		System.out.println("����̰� ��Ḧ �԰� �ִ�.");
	}
	
	public Cat() {
		super(); //new Animal �� �Ͱ� ����
	}
	
}
