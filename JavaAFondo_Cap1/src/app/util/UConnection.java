package app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class UConnection {
	private static Connection conn = null;
	private static String driver = "com.mysql.jdbc.Driver";
	private static String protocol = "jdbc:mysql";
	private static String port = "localhost:3306";
	private static String bd = "tienda";
	private static String user = "root";
	private static String pass = "masterkey";

	public static Connection getConnection() {
		try {
			if (!(conn == null) && conn.isClosed()) {
				return conn;// i was already connected.
			} else {// not connected to mysql.
				// up driver
				Class.forName(driver);
				// establishing connection.
				// conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda",
				// user,pass);
				conn = DriverManager.getConnection(protocol + "://" + port + "/" + bd, user, pass);
				return conn;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}
}
