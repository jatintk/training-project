package com.oracle.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.web.dao.ProductDao;
import com.oracle.web.model.Product;

/**
 * Servlet implementation class GetProductController
 */
public class GetProductController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		ProductDao dao = new ProductDao();
		Product p1 = dao.getProduct(id);
		request.setAttribute("product", p1);
		RequestDispatcher rd = request.getRequestDispatcher("showProduct.jsp");
		rd.forward(request, response);
		
	}


}
