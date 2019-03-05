package com.chainsys.busapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	public int Singnup(User user) {
		int status = 0;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "insert into signup(username,email,password,confirm_password) values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getConfirm_password());

			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public int save(User user) {
		int status = 0;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "insert into chainsysregister(Id,name,password,email,sex,department) values(?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getName());
			System.out.println("name="+user.getName());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getSex());
			ps.setString(6, user.getDepartment());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public int update(User user) {
		int status = 0;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "update chainsysregister set name=?,password=?,email=?,sex=?,Department=? where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getSex());
			ps.setString(5, user.getDepartment());
			ps.setInt(6, user.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public int delete(User user) {
		int status = 0;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "delete from chainsysregister where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, user.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public List<User> getAllRecords() {
		List<User> list = new ArrayList<User>();

		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "select Id,name,password,email,sex,department from chainsysregister";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setSex(rs.getString("sex"));
				user.setDepartment(rs.getString("department"));
				list.add(user);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public User getRecordById(User user) {
		User u = null;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "select Id,name,password,email,sex,department from chainsysregister where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setEmail(rs.getString("email"));
				u.setSex(rs.getString("sex"));
				u.setDepartment(rs.getString("department"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}
}
