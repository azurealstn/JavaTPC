package kr.tpc;

public class Dog extends Animal {
	//�̸�, ����, �� : ��������
	//�������� -> �޼ҵ�
	//������
	@Override
	public void eat() {
		System.out.println("�������� ��Ḧ �԰� �ִ�.");
	}
	
	public Dog() {
		super(); //new Animal �� �Ͱ� ����
	}
}
