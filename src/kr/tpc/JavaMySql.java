package kr.tpc;

public class JavaMySql implements DbConnect {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("MySql DB를 연결합니다.");
	}

}
