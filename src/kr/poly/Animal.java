package kr.poly;

/**
 * �߻�Ŭ������ �Ϻδ������� ����
 * ��ӹ��� Ŭ������ �ݵ�� �߻�޼ҵ带 �������ؾ��ϱ� ����
 */
public abstract class Animal {
	//Dog, Cat�� ���� �޼ҵ� eat()
	public abstract void eat();
	
	//������ �޼ҵ�
	public void move() {
		System.out.println("������ ��� �̵��Ѵ�.");
	}
}