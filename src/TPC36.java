import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC36 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>(); //Object[] -> BookDTO[]
		list.add(new BookDTO("자바", 12000, "이지스", 600)); //업캐스팅 -> 자기 자신 객체생성
		list.add(new BookDTO("C언어", 13000, "에이콘", 700));
		list.add(new BookDTO("파이썬", 14000, "제이펍", 800));
		
		for (int i = 0; i < list.size(); i++) {
			Object object = list.get(i);
			BookDTO bookDTO = (BookDTO) object; //다운캐스팅
			System.out.println(bookDTO.toString());
		}
	}
}