public class TPC33 {
	public static void main(String[] args) {
		String str1 = new String("APPLE"); //Heap ������ ����
		String str2 = new String("APPLE");
		
		//�������� ��
		System.out.println("������ ��");
		if (str1 == str2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("���ڿ��� ��");
		if (str1.equals(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		String str3 = "APPLE"; //���ͷ� Ǯ ������ ����
		String str4 = "APPLE";
		
		System.out.println("���ڿ� ���ͷ� ������ ��");
		if (str3 == str4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("���ڿ� ���ͷ��� ��");
		if (str3.equals(str4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
