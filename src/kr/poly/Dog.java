package kr.poly;

public class Dog extends Animal {
	//�̸�, ����, �� : ��������
	//�������� -> �޼ҵ�
	//������
	public Dog() {
		super(); //new Animal �� �Ͱ� ����
	}

	@Override
	public void eat() {
		System.out.println("���ƱⰡ ��Ḧ �Դ�.");
	}
}
