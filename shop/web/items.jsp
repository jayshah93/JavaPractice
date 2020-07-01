<%@page import="java.util.List"%>
<%@page import="java.util.*, com.jay.shop.domain.*" %>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<title>

</title>
</head>
<body>
<%
String cartmessage = (String)request.getAttribute("cartmessage");
if (cartmessage!=null){
%>
<span style="color:red"><%=cartmessage %></span>
<%
}

String cartsuccess = (String)request.getAttribute("cartsuccess");
if(cartsuccess!=null){

%>
<span style="color:green"><%=cartsuccess %></span>
<%
}
%>
<form method="POST" action="/Shop/cs">
<input type="submit" name="action" value="Logout"/>
<input type="submit" name="action" value="help"/>
<table >
<tr>
	<td>ID</td>
	<td>Name</td>
	<td>Price</td>
	<td>Quantity</td>
</tr>

<%
List<Item> items = (List<Item>)request.getAttribute("items");
for(Item item : items){
%>

<tr>

	<td><input type = "checkbox" name="chk" value='<%=item.getId()%>'/></td>
	<td><%=item.getName() %></td>
	<td><%=item.getPrice() %></td>
	<td><input type="number" min="0" name="quantity<%=item.getId()%>"/></td>
 
</tr>

<%
}
%>


</table>
<input type="submit" name="action" value="Add to Cart" />
<input type="submit" name="action" value="Checkout" />
<input type="hidden" name="page" value="items"/>
</form>
</body>
</html>