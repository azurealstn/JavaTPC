package kr.poly;

/**
 * �������̽��� 100% �������� �����Ѵ�.
 * �߻�Ŭ������ ����� ����� ������ ��������� ������,
 * �������̽��� ���� �ٸ� ����� �� ����ϸ� ����.
 * �ֳ��ϸ� �������̽��� �����޼ҵ带 ������ �� ����.
 */
public interface RemoCon {
	
	//static final ��������
	//�̷��� ���� '���' ��� �Ѵ�.
	public static final int MINCH = 100;
	public int MAXCH = 300;
	
	public void chUp();
	public void chDown();
	public void internet();
}
