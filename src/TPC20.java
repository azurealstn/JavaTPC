import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

/**
 * ��Ӱ��迡�� ��ĳ����(�ڵ�����ȯ:Promotion)���� ��ü�� �����ϰ� �� ���
 * ������ �θ�Ÿ���� �ʵ峪 �޼ҵ常 ����� �����մϴ�.
 * ������ �θ��� �޼ҵ带 �ڽ�Ŭ�������� �������̵��ϸ� �������ε��� �Ǽ�
 * �ڽ�Ŭ������ �޼ҵ带 ������ �� �ְԵ˴ϴ�.
 * ���⼭ �������ε��̶� ��������� �޼ҵ带 �������°��� ���մϴ�.
 * ���� �������ε��̶� �����Ͻ����� �޼ҵ带 �������´ٴ°Ͱ� �������� �ֽ��ϴ�.
 */
public class TPC20 {
	public static void main(String[] args) {
		//�������̵� �ǽ�
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		animal1.eat();
		animal2.eat();
	}
}