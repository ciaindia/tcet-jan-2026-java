<%@ page import="java.sql.*" %>
<%
String url = "jdbc:mysql://ciacloud.in:3306/tpdb?useSSL=false&serverTimezone=UTC";
String user = "tpuser";
String password = "%TGBbgt5";

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url, user, password);
%>


<%@ page import="java.sql.*" %>

<h2>User List</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Salary</th>
</tr>

<%
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM users");

while(rs.next()) {
    int id = rs.getInt("id");
%>
<tr>
    <td><%= id %></td>
    <td><%= rs.getString("name") %></td>
    <td><%= rs.getString("salary") %></td>
</tr>
<% } 

rs.close();
st.close();
con.close();
%>

</table>