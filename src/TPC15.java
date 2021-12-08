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
		
	}
}
