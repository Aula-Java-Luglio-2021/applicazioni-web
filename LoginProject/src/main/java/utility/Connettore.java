package utility;

import java.sql.*;

public final class Connettore {
	private static Connettore instance=null;
	private Connettore() {}
	public static Connettore getInstance() {
		if(instance==null) 
			instance=new Connettore();
			return instance;
	}
	
	private Connection conn=null;
	private final String URL_DB="jdbc:mysql://localhost:3306/provajdbc?useUnicode="
			+ "true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private final String USERNAME="root";
	private final String PASSWORD="";
	private final String DRIVER="com.mysql.cj.jdbc.Driver";
	
	public Connection apriConnessione() {
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL_DB,USERNAME,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
