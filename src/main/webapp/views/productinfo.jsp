<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<thead>
			<tr>
				<th>Product Details</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Product Name</td>
				<td>${product.productName}</td>
			</tr>
		<tr>
				<td>Product Description</td>
				<td>${product.productDescription}</td>
			</tr>
			
			<tr>
				<td>Price</td>
				<td>${product.price}</td>
			</tr>
		</tbody>
	</table>

</body>
</html>