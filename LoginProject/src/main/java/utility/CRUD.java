package utility;

import java.sql.*;
import java.util.ArrayList;

import model.Account;

public final class CRUD {
	private CRUD() {}  
	private static CRUD instance=null;
	public static CRUD getinstance() {
		if(instance==null)
			instance=new CRUD();
		return instance;
	}
	PreparedStatement ps;
	ResultSet rs;
	public void inserimento(String username,String email,String password) {
		Connection conn=Connettore.getInstance().apriConnessione();
		String insertSQL="insert into account (username,password,email) values"
				+ "(?,?,?)";
		try {
			ps=conn.prepareStatement(insertSQL);
			ps.setString(1,username);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void inserimento(Account a) {
		Connection conn=Connettore.getInstance().apriConnessione();
		String insertSQL="insert into account (username,password,email) values"
				+ "(?,?,?)";
		try {
			ps=conn.prepareStatement(insertSQL);
			ps.setString(1,a.getUsername());
			ps.setString(2,a.getPassword());
			ps.setString(3,a.getEmail());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Account> getQueryAccount(){
		ArrayList<Account> listaAcc=new ArrayList<>();
		Connection conn=Connettore.getInstance().apriConnessione();
		String selectSQL="select * from account";
		try {
			ps=conn.prepareStatement(selectSQL);
			rs=ps.executeQuery();
			while(rs.next()) {
				listaAcc.add(new Account(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getString("email")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaAcc;
	}

	public void rimozione(int id) {
		Connection conn=Connettore.getInstance().apriConnessione();
		String deleteSQL="delete from account where id=?";
		try {
			ps=conn.prepareStatement(deleteSQL);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
