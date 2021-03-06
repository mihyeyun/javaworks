package dbconnection.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DB 연결과 종료
public class JDBCUtil {
	
	private static String driverclass = "oracle.jdbc.OracleDriver";	//오라이클 드라이버
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";	//db경로
	private static String username = "system";
	private static String password = "12345";
	
	//DB 연결 메서드
	public static Connection getConnection() {
		try {
			Class.forName(driverclass);
			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//DB 연결 종료(Insert, Update, Delete)
	public static void close(Connection conn, PreparedStatement pstmt) {
		if(pstmt != null) {	//db 연결되어 있다면
			try {
				pstmt.close(); 	// 연결 종료
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//DB 연결종료(select)
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {	//반환 객체가 있으면
			try {
				rs.close();	//반환 종료
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
