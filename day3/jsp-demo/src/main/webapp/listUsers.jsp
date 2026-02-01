<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>

<h2>User List</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Actions</th>
</tr>

<%
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM users ORDER BY id DESC");

while(rs.next()) {
    int id = rs.getInt("id"); //primary key
%>
<tr>
    <td><%= id %></td>
    <td><%= rs.getString("name") %></td>
    <td><%= rs.getString("email") %></td>
    <td>
        <a href="editUser.jsp?id=<%= id %>">Edit</a> |
        <a href="deleteUser.jsp?id=<%= id %>">Delete</a>
    </td>
</tr>
<% } 

rs.close();
st.close();
con.close();
%>

</table>
<br>
<a href="addUser.jsp">Add New User</a>