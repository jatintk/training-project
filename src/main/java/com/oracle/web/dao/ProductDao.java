package com.oracle.web.dao;
import java.sql.*;
import com.oracle.web.model.Product;

public class ProductDao {
	public Product getProduct(int id) {
		Product p = new Product();
		
		p.setId(101);
		p.setName("Oracle DB");
		p.setPrice(50000);
		p.setCategory("Product");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from products where id= "+ id);
			if (rs.next())
			{
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setId(rs.getInt("price"));
				
				p.setCategory(rs.getString("category"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		return p;
	}

}
