import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC36 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>(); //Object[] -> BookDTO[]
		list.add(new BookDTO("�ڹ�", 12000, "������", 600)); //��ĳ���� -> �ڱ� �ڽ� ��ü����
		list.add(new BookDTO("C���", 13000, "������", 700));
		list.add(new BookDTO("���̽�", 14000, "������", 800));
		
		for (int i = 0; i < list.size(); i++) {
			Object object = list.get(i);
			BookDTO bookDTO = (BookDTO) object; //�ٿ�ĳ����
			System.out.println(bookDTO.toString());
		}
	}
}