import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		//��������
		//private���δ� �������� ���ϹǷ� getter, setter�� �̿�
		MemberVO memberVO = new MemberVO();
		memberVO.setName("ȫ�浿");
		memberVO.setAge(12);
		memberVO.setTel("010-1111-1111");
		memberVO.setAddr("����");
		
		System.out.println(memberVO.getName());
		System.out.println(memberVO.getAge());
		System.out.println(memberVO.getTel());
		System.out.println(memberVO.getAddr());
		
	}
}
