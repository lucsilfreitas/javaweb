package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	private static String url = "jdbc:mysql://localhost/drmanager";
	private static String password = "";
	private static String user = "root";
	private static Connection connection = null;
	

	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	
	private static void conectar() {
		
		try {
			
			if (connection == null) {
				Class.forName("com.mysql.jdbc.Driver");
                connection =  DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);
                System.out.println("Conexao realizada com sucesso!");
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro de conexao!");
		}
		
		
	}

	public static Connection getConnection() {
		return connection;
	}
	
}
