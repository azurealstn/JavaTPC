import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
	public static void main(String[] args) {
		//Java���� �����ϴ� API
		//java.lang ��Ű���� ��������
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); //�ҹ������
		
		//2.���� ���� ����ϴ� API - DTO/VO, DAO, Utility..
		MyUtil myUtil = new MyUtil();
		int result = myUtil.hap();
		System.out.println("1���� 10������ ��=" + result);
		
		//3.�ٸ� ȸ�翡�� �������� API - Gson -> json..
		Gson gson = new Gson();
		BookVO bookVO = new BookVO("�ڹ�", 13000, "����", 534);
		
		String json = gson.toJson(bookVO); //��ü�� json���� ����
		System.out.println(json);
	}
}
