package com.mercury.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.mercury.beans.User;
import com.mercury.util.JdbcUtil;

public class UserDao {

	public void save(User u) {
		String sql = "{?=call SAVEUSER(?, ?)}";
		try(Connection connection = JdbcUtil.getConnection();
				CallableStatement cs = connection.prepareCall(sql);) {
			
			cs.setString(2, u.getName());
			cs.setInt(3, u.getAge());
			
			cs.registerOutParameter(1, Types.INTEGER);
			
			cs.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// method stub
	public User getByName(String name) {
		User u = null;
		String sql = "select * from sample where name = ?";	// place holder
		
		try(Connection connection = JdbcUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);) {

			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u = new User(rs.getString("name"), rs.getInt("age"));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return u;
	}
	
	public List<User> getAll() {
		List<User> users = new ArrayList();
		String sql = "select * from sample";
		
		try(Connection connection = JdbcUtil.getConnection();
				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery(sql);) {
			
			// rs.next() : move to the next, and return if still exist;
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				User u = new User(name, age);
				users.add(u);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}
}
