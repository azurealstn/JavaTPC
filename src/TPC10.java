import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		//PrimitiveDataType
		int a = 10;
		
		//å(BookDTO)�̶�� �ڷ����� ������ -> class (��ü)
		BookDTO bookDTO = new BookDTO();
		bookDTO.title = "�ڹ�";
		bookDTO.price = 15000;
		bookDTO.company = "�Ѻ��̵��";
		bookDTO.page = 700;
		
		System.out.println(bookDTO.title);
		System.out.println(bookDTO.price);
		System.out.println(bookDTO.company);
		System.out.println(bookDTO.page);
	}
}