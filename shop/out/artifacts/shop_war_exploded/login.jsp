<html>
<head>
<style>
table.space {
	margin-top: 50px;
	padding-top: 20px;
	width: 50%;

	}
</style>
<title>
Please Login
</title>
</head>
<body>
<%
String loginError = (String)request.getAttribute("loginError");
if(loginError!=null){

%>
<span style="color:red"><%=loginError %></span>
<%
}
%>
<form method="POST" action="/Shop/cs">
<table class="space" width="30%" bgcolor="0099CC" align="center">
<tr>
<td >Username:</td>
<td><input type = "text" name = "username"/></td>
</tr>
<tr>
<td >Password:</td>
 <td><input type = "password" name = "password"/></td>
<tr>
<td><input type="submit" name="action" value="Login"/></td>
<td><input type="reset"  value="Reset"/></td>

<td><input type="hidden" name="page" value="login"/></td>
</tr>
</table>
</form>
</body>
</html>