import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		//정보은닉
		//private으로는 접근하지 못하므로 getter, setter를 이용
		MemberVO memberVO = new MemberVO();
		memberVO.setName("홍길동");
		memberVO.setAge(12);
		memberVO.setTel("010-1111-1111");
		memberVO.setAddr("서울");
		
		System.out.println(memberVO.getName());
		System.out.println(memberVO.getAge());
		System.out.println(memberVO.getTel());
		System.out.println(memberVO.getAddr());
		
		System.out.println("=================");
		
		//setter가 필요없음
		MemberVO memberVO2 = 
				new MemberVO("채민수", 22, "010-2222-2222", "경기");
		
		//생성자 초기화를 이용한 toString 출력
		//getter가 필요없음
		System.out.println(memberVO2.toString());
		
		System.out.println("=================");
		
		//Object의 toString을 오버라이딩해서 재정의했기 때문에
		//toString은 생략가능
		System.out.println(memberVO);
		System.out.println(memberVO2);
	}
}
