import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		//PrimitiveDataType VS UserDefinedDataType
		//���� 1���� �����ϱ� ���� ���� ����
		int a;
		a = 10;
		
		//å 1���� �����ϱ� ���� ���� ����
		Book book;
		book = new Book();
		book.title = "�ڹ�";
		book.price = 15000;
		book.company = "�Ѻ��̵��";
		book.page = 700;
		
		System.out.println(book.title);
		System.out.println(book.price);
		System.out.println(book.company);
		System.out.println(book.page);
		
		//��� 1���� ������ �����ϱ� ���� ���� ����
		PersonVO personVO;
		personVO = new PersonVO();
		personVO.name = "ä�μ�";
		personVO.age = 27;
		personVO.weight = 62.7f;
		personVO.height = 169.5f;
		
		System.out.println(personVO.name);
		System.out.println(personVO.age);
		System.out.println(personVO.weight);
		System.out.println(personVO.height);
	}

}
