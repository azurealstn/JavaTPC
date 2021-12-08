import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
	public static void main(String[] args) {
		//Java에서 제공하는 API
		//java.lang 패키지는 생략가능
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); //소문자출력
		
		//2.직접 만들어서 사용하는 API - DTO/VO, DAO, Utility..
		MyUtil myUtil = new MyUtil();
		int result = myUtil.hap();
		System.out.println("1부터 10까지의 합=" + result);
		
		//3.다른 회사에서 만들어놓은 API - Gson -> json..
		Gson gson = new Gson();
		BookVO bookVO = new BookVO("자바", 13000, "영진", 534);
		
		String json = gson.toJson(bookVO); //객체를 json으로 변경
		System.out.println(json);
	}
}
