package emsProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class managementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		databaseConnector base = new databaseConnector();
		base.connection = connect(base);
		System.out.println("Hello world part two");
	}
	
	private static Connection connect(databaseConnector d){
		try {
			d.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return d.connection;
	}

}
