import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		//PrimitiveDataType VS UserDefinedDataType
		//정수 1개를 저장하기 위한 변수 선언
		int a;
		a = 10;
		
		//책 1권을 저장하기 위한 변수 선언
		Book book;
		book = new Book();
		book.title = "자바";
		book.price = 15000;
		book.company = "한빛미디어";
		book.page = 700;
		
		System.out.println(book.title);
		System.out.println(book.price);
		System.out.println(book.company);
		System.out.println(book.page);
		
		//사람 1명의 정보를 저장하기 위한 변수 선언
		PersonVO personVO;
		personVO = new PersonVO();
		personVO.name = "채민수";
		personVO.age = 27;
		personVO.weight = 62.7f;
		personVO.height = 169.5f;
		
		System.out.println(personVO.name);
		System.out.println(personVO.age);
		System.out.println(personVO.weight);
		System.out.println(personVO.height);
	}

}
