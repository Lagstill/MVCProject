package com.alex.foodcart;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FoodCart6")
public class FoodCart6 extends HttpServlet { 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get data from database
		try {
			List<Food6> fooditems =FoodCartDBUtil.getFoodList6();
			request.setAttribute("fooditems", fooditems);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		//redirect to different page(view)
		RequestDispatcher dispatcher= request.getRequestDispatcher("show-food6.jsp");
		dispatcher.forward(request, response);
	}
}
