package by.htp.les01.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ConnectionPoolException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		ConnectionPool connectionPool = new ConnectionPool();

		try {

			con = connectionPool.takeConnection();

			String sql = "SELECT * FROM users";

			st = con.prepareStatement(sql);
			rs = st.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getString("surname") + " "
						+ rs.getString("email"));
			}

//			while (rs.next()) {
//				
//				pst = con.prepareStatement(sql);
//				pst.setString(1, "o" + rs.getString("email"));
//				pst.setInt(2, rs.getRow());
//				pst.executeUpdate();
//				
//				
//				System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getString("surname") + " "
//						+ rs.getString("email"));
//			}

		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// log
			}

			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				// log
			}

			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// log
			}

		}
		System.out.println("ok");

		connectionPool.dispose();

	}

}
