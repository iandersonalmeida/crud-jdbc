package br.com.caelum.jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
	public Connection getConnection()
	{
		try
		{
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "mariaian");
		}catch(SQLException e)
		{
			throw new RuntimeException(e);
		}
	}
		
}
