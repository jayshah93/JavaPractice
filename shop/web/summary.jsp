<%@page import="com.jay.shop.service.ItemsServices"%>
<%@page import="java.util.List"%>
<%@page import="com.jay.shop.domain.CartItem"%>
<%@page import="com.jay.shop.domain.Cart"%>
<html>
<head>
<title>
Summary-of-Cart
</title>
</head>
<body>
<form method="POST" action="/Shop/cs">
<input type="submit" name="action" value="Logout"/>
<input type="submit" name="action" value="help"/>
<table>
<tr>
	<td>Name</td>
	<td>Quantity</td>
	<td>Total Price</td>
</tr>
<%
Cart cart=(Cart)session.getAttribute("cart");
List<CartItem>items= cart.getItems();
for(CartItem itemss : items){
%>

<tr>

	
	<td><%=itemss.getName() %></td>
	<td><%=itemss.getQuantity()%></td>
	
	<td><%=itemss.getPrice() %></td>
	
 
</tr>

<%
}
%>
</table>
<h3>
Grand Total : <%=cart.getGrandTotal() %>
</h3>
<input type="submit" name="action" value="Back to cart" />
<input type="submit" name="action" value="Checkout" />
<input type="hidden" name="page" value="summary"/>
</form>
</body>
</html>