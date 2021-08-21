/**********************************************************
 * 				PSG COLLEGE OF TECHNOLOGY
 * 						AMCS
 * 				JAVA PACKAGE SUBMISSION
 * 				  CLOUD KITCHEN MENU		
 * 					   19PD05
 *                     19PD019
 ************************************************************/


package com.alex.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class FoodCartDBUtil {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/cloudkitchen?useSSL=false";
		String userName="root";
		String password="Vishal@2003";
		ArrayList<Food> food = new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con=DriverManager.getConnection(url, userName,password);
		
		
		//create a statement
		Statement stmt=con.createStatement();
		
		//execute the statement and loop
		ResultSet rs= stmt.executeQuery("select * from smoothies");
		while(rs.next())
		{
			
			String name=rs.getString(1);
			String avail=rs.getString(2);
			int sweet=rs.getInt(3);
			int price=rs.getInt(4);
			Food f=new Food(name,avail,sweet,price);
			food.add(f);
		}
		
		return food;
	}

	public static List<Food2> getFoodList2() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/cloudkitchen?useSSL=false";
		String userName="root";
		String password="Vishal@2003";
		ArrayList<Food2> food = new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con=DriverManager.getConnection(url, userName,password);
		
		
		//create a statement
		Statement stmt=con.createStatement();
		
		//execute the statement and loop
		ResultSet rs= stmt.executeQuery("select * from bread");
		while(rs.next())
		{
			
			String name=rs.getString(1);
			int price=rs.getInt(2);
			Food2 f=new Food2(name,price);
			food.add(f);
		}
		
		return food;
	}
	
	public static List<Food3> getFoodList3() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/cloudkitchen?useSSL=false";
		String userName="root";
		String password="Vishal@2003";
		ArrayList<Food3> food = new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con=DriverManager.getConnection(url, userName,password);
		
		
		//create a statement
		Statement stmt=con.createStatement();
		
		//execute the statement and loop
		ResultSet rs= stmt.executeQuery("select * from tea");
		while(rs.next())
		{
			
			String name=rs.getString(1);
			int price=rs.getInt(2);
			Food3 f=new Food3(name,price);
			food.add(f);
		}
		
		return food;
	}
	public static List<Food4> getFoodList4() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/cloudkitchen?useSSL=false";
		String userName="root";
		String password="Vishal@2003";
		ArrayList<Food4> food = new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con=DriverManager.getConnection(url, userName,password);
		
		
		//create a statement
		Statement stmt=con.createStatement();
		
		//execute the statement and loop
		ResultSet rs= stmt.executeQuery("select * from maincourse");
		while(rs.next())
		{
			
			String name=rs.getString(1);
			int spice=rs.getInt(2);
			int sweet=rs.getInt(3);
			int price=rs.getInt(4);
			Food4 f=new Food4(name,spice,sweet,price);
			food.add(f);
		}
		
		return food;
	}
	
	public static List<Food5> getFoodList5() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/cloudkitchen?useSSL=false";
		String userName="root";
		String password="Vishal@2003";
		ArrayList<Food5> food = new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con=DriverManager.getConnection(url, userName,password);
		
		
		//create a statement
		Statement stmt=con.createStatement();
		
		//execute the statement and loop
		ResultSet rs= stmt.executeQuery("select * from soups");
		while(rs.next())
		{
			
			String name=rs.getString(1);
			int spice=rs.getInt(2);
			int sweet=rs.getInt(3);
			int price=rs.getInt(4);
			Food5 f=new Food5(name,spice,sweet,price);
			food.add(f);
		}
		
		return food;
	}
	
	public static List<Food6> getFoodList6() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/cloudkitchen?useSSL=false";
		String userName="root";
		String password="Vishal@2003";
		ArrayList<Food6> food = new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con=DriverManager.getConnection(url, userName,password);
		
		
		//create a statement
		Statement stmt=con.createStatement();
		
		//execute the statement and loop
		ResultSet rs= stmt.executeQuery("select * from soups");
		while(rs.next())
		{
			
			String name=rs.getString(1);
			int spice=rs.getInt(2);
			int sweet=rs.getInt(3);
			int price=rs.getInt(4);
			Food6 f=new Food6(name,spice,sweet,price);
			food.add(f);
		}
		
		return food;
	}
	
	public static List<Food7> getFoodList7() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/cloudkitchen?useSSL=false";
		String userName="root";
		String password="Vishal@2003";
		ArrayList<Food7> food = new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con=DriverManager.getConnection(url, userName,password);
		
		
		//create a statement
		Statement stmt=con.createStatement();
		
		//execute the statement and loop
		ResultSet rs= stmt.executeQuery("select * from subziyan");
		while(rs.next())
		{
			
			String name=rs.getString(1);
			int spice=rs.getInt(2);
			int price=rs.getInt(3);
			Food7 f=new Food7(name,spice,price);
			food.add(f);
		}
		
		return food;
	}
	
	
	public static List<Food8> getFoodList8() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/cloudkitchen?useSSL=false";
		String userName="root";
		String password="Vishal@2003";
		ArrayList<Food8> food = new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con=DriverManager.getConnection(url, userName,password);
		
		
		//create a statement
		Statement stmt=con.createStatement();
		
		//execute the statement and loop
		ResultSet rs= stmt.executeQuery("select * from alltimefav");
		while(rs.next())
		{
			
			String name=rs.getString(1);
			int spice=rs.getInt(2);
			int price=rs.getInt(3);
			Food8 f=new Food8(name,spice,price);
			food.add(f);
		}
		
		return food;
	}
}
