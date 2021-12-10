import kr.tpc.DbConnect;
import kr.tpc.JavaMySql;
import kr.tpc.JavaOracle;

public class TPC28 {
	public static void main(String[] args) {
		
		//Oracle, MySQL -> Driver Class가 필요
		//가상으로 이 Driver Class를 만들어보자.
		DbConnect conn1 = new JavaOracle();
		conn1.getConnection("url", "bit", "12345");
		
		DbConnect conn2 = new JavaMySql();
		conn2.getConnection("root", "azure", "12345");
	}
}