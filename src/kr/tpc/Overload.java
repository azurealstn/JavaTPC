package kr.tpc;

/**
 * �����ε��� ����ص� �ӵ��� ������ ���� ������
 * �������ε��� �ϱ� ����
 * �������ε��̶�, �����Ͻÿ� �̸� �޼ҵ带 ���ֱ̹�Ģ�� ������
 * ����� ������ �ٷ� �޼ҵ带 ã�� �� �ִ�.
 */
public class Overload {
	//����(method)���θ� �̷���� ��ü
	public void hap(int a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, float b) {
		System.out.println(a + b);
	}
}
