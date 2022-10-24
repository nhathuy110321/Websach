package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class CoSodao {
	public Connection cn;
	public void Ketnoi()  {
		//b1: xác đinh hê qtcsdl
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.print("ok buoc 1 ");
			cn=DriverManager.getConnection("jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=QlSach;user=sa; password=123456789");
			System.out.print("ok buoc 2 ");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] ts) {
		
			CoSodao cs= new CoSodao();
			cs.Ketnoi();
	}		
}
