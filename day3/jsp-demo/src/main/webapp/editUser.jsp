<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>

<%
String idParam = request.getParameter("id");
if (idParam == null) {
    out.println("Invalid User ID");
    return;
}

int id = Integer.parseInt(idParam);
PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE id=?");
ps.setInt(1, id);
ResultSet rs = ps.executeQuery();

if (!rs.next()) {
    out.println("User not found");
    return;
}
%>

<html>
<body>
    <h2>Edit User</h2>
    <form action="updateUser.jsp" method="post">
        <input type="hidden" name="id" value="<%= rs.getInt("id") %>">
        Name: <input type="text" name="name" value="<%= rs.getString("name") %>" required><br>
        Email: <input type="email" name="email" value="<%= rs.getString("email") %>" required><br>
        <input type="submit" value="Update">
    </form>
    <a href="listUsers.jsp">Back to List</a>
</body>
</html>

<%
rs.close();
ps.close();
con.close();
%>