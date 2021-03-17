package net.codejavasqlcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class javaMYSQLtest {

	static Scanner myObj = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			int i=1;
			while(i==1) {
				
				System.out.println("\n 1.Insert ");
				System.out.println("2.update");
				System.out.println("3.Delete");
				System.out.println("4.View Table");
				System.out.println("5.Exit \n");
				System.out.println("Enter your choice:");
				

			int x = myObj.nextInt();
			
			if (x==1) {
				insert();	
			}
			else if(x==2) {
				update();
			}
			else if (x==3) {
				delete();
			}
			else if (x==4) {
				display();
			}
			else if(x==5) {
				break;
			}
		}	
		} catch (SQLException e) {
			System.out.println("connection error");
			e.printStackTrace();
		}
	}

	private static void insert() throws SQLException {
		System.out.print("Enter Employee Name: ");
		String name = myObj.next();
		System.out.println("Enter Employee Salary: ");
		int salary = myObj.nextInt();
		
		String insertsql="INSERT INTO employee (name,salary) values(?,?)";
		
		PreparedStatement statement= getcon().prepareStatement(insertsql);
		
		statement.setString(1,name);
		statement.setInt(2,salary);
		statement.executeUpdate();	
		statement.close();
	}
	private static void update() throws SQLException {
		System.out.println("Enter Employee id: ");
		int id = myObj.nextInt();
		System.out.print("Enter Employee Name: ");
		String name = myObj.next();

		
		String updatesql="update employee set name=? where empid=?";
	
		PreparedStatement statement= getcon().prepareStatement(updatesql);
		
		statement.setString(1,name);
		statement.setInt(2,id);
		statement.executeUpdate();	
		statement.close();
	}
	private static void delete() throws SQLException {
		System.out.println("Enter Employee id: ");
		int id = myObj.nextInt();
		
		String deletesql="delete from employee where empid=?";
		
		PreparedStatement statement= getcon().prepareStatement(deletesql);
		
		statement.setInt(1,id);
		
		statement.executeUpdate();	
		statement.close();
	}
	private static void display() throws SQLException {
		
		String displaysql="select * from employee";
		
		PreparedStatement statement= getcon().prepareStatement(displaysql);
		
		ResultSet result = statement.executeQuery();	
		while (result.next()) {
			
			int empid=result.getInt(1);
			String Name=result.getString(2);
			int Salary= result.getInt(3);
			
			System.out.println(empid+" "+Name+" "+Salary);
		}
		statement.close();
		
	}
	
	private static Connection getcon() {
		String url ="jdbc:mysql://localhost:3306/newjava";
		String username="root";
		String password="rinson@123";
		try {
			return DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	
	}

}
