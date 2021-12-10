package kr.tpc;

public class JavaOracle implements DbConnect {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Oracle DB를 연결합니다.");
	}

}
