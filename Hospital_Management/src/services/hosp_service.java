package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.Connect;

import Model.Login_model;

public class hosp_service {
	Connection con = Connect.getConnection();

	public int insert(Login_model lm) {
		// TODO Auto-generated method stub
		try {
			String s1 = "INSERT INTO `login`(`user`, `pass`) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(s1);
			System.out.println("fff");

			ps.setString(1, lm.getUser());
			ps.setString(2, lm.getPass());
			
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				return rs.getInt(1);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return 0;
	}
	}


