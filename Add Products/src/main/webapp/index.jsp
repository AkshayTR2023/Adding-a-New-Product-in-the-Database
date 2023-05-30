<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product Home</title>
</head>
<body>
	<h2>Enter product details to be added...</h2>
    <form action="addProductServlet" method="POST">
    <table>
        <tr><td>Enter Product Name </td><td><input type="text" name="pName"></td></tr>
		<tr><td>Enter Product Cost </td><td><input type="text" name="pCost"></td></tr>
		<tr><td></td><td><input type="submit" value="Add Product"></td></tr>

        </table>
    </form>
    
   <form action="showProducts" method="POST">
   	<input type="submit" value="View Available Products">
   </form>
    
</body>
</html>
