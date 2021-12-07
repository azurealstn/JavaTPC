import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		//PrimitiveDataType
		int a = 10;
		
		//책(BookDTO)이라는 자료형을 만들자 -> class (객체)
		BookDTO bookDTO = new BookDTO();
		bookDTO.title = "자바";
		bookDTO.price = 15000;
		bookDTO.company = "한빛미디어";
		bookDTO.page = 700;
		
		System.out.println(bookDTO.title);
		System.out.println(bookDTO.price);
		System.out.println(bookDTO.company);
		System.out.println(bookDTO.page);
	}
}