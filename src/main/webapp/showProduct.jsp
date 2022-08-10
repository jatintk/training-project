<%@ page import ="com.oracle.web.model.Product" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%



Product p1 = (Product)request.getAttribute("product");
//out.println(p1);

//out.println(p1.getName());
//out.println(p1.getPrice());
//out.println(p1.getCategory());

%>

<br>
<center>
<form action="index.jsp">
    <input type="submit" value="Go Back" />
</form>
<table border="2" cellpadding="10" width="400px">
            <caption><h2>Searched Product</h2></caption>
            <tr height="50 px">
               
                <th>Name</th>
                <th>Price</th>
                <th>Category</th>
            </tr>
            <tr height="50 px">
            <td><% out.println(p1.getName()); %>
            <td><% out.println(p1.getPrice()); %>
            <td><% out.println(p1.getCategory()) ;%>
            </tr>
</table>

<br>

<form action="addCart">
<input type="Submit" value="Add to Cart">


</form>


</center>


<jsp:include page="footer.jsp" />
</body>
</html>