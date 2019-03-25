package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import connection.Connect;

import Model.Login_model;

public class Login_service {
	Connection con=Connect.getConnection();

	public Login_model logincheck(String user, String pass) {
		// TODO Auto-generated method stub
		System.out.println("inside login  check");
		Login_model lm=null;
		try
		{
			String s1="SELECT id,user,pass FROM login WHERE user=? AND pass=?";
			PreparedStatement ps=con.prepareStatement(s1);
			ps.setString(1,user);
			ps.setString(2, pass);
			System.out.println(ps);
			ResultSet rs= ps.executeQuery();
			System.out.println(s1);
			while(rs.next())
			{
				lm=new Login_model();
				lm.setId(rs.getInt(1));
				lm.setUser(rs.getString(2));
				lm.setPass(rs.getString(3));
				System.out.println("okkkk");
				return lm;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
