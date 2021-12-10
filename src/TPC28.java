import kr.tpc.DbConnect;
import kr.tpc.JavaMySql;
import kr.tpc.JavaOracle;

public class TPC28 {
	public static void main(String[] args) {
		
		//Oracle, MySQL -> Driver Class�� �ʿ�
		//�������� �� Driver Class�� ������.
		DbConnect conn1 = new JavaOracle();
		conn1.getConnection("url", "bit", "12345");
		
		DbConnect conn2 = new JavaMySql();
		conn2.getConnection("root", "azure", "12345");
	}
}