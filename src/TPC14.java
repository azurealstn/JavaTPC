import kr.tpc.BookDTO;
import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		//å -> class(BookDTO) -> ��ü -> �ν��Ͻ�
		String title = "������";
		int price = 34000;
		String company = "������";
		int page = 980;
		
		BookDTO dto; //dto(Object: ��ü)
		dto = new BookDTO(title, price, company, page); //dto(Instance: �ν��Ͻ�)
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.println(dto.title);
		System.out.println(dto.price);
		System.out.println(dto.company);
		System.out.println(dto.page);
	}

}
