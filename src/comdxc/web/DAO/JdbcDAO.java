package comdxc.web.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import comdxc.we.util.ConnectionManager;

public class JdbcDAO {
	
	Connection con = null;
	public JdbcDAO() throws Exception {
		con = ConnectionManager.getConnection();
		con.setAutoCommit(false);
	}
	
	public void save() throws SQLException {
		con.commit();
		con.close();
	}
	
	public void undo() throws SQLException {
		con.rollback();
		con.close();
	}
	

}
