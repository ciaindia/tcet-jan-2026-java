<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>

<%
String idParam = request.getParameter("id");
String name = request.getParameter("name");
String email = request.getParameter("email");

// Server-side validation
if (idParam == null || name == null || email == null ||
    name.trim().equals("") || email.trim().equals("")) {
    out.println("Invalid input data");
    return;
}

int id = Integer.parseInt(idParam);

PreparedStatement ps = con.prepareStatement(
    "UPDATE users SET name=?, email=? WHERE id=?"
);
ps.setString(1, name);
ps.setString(2, email);
ps.setInt(3, id);

int rows = ps.executeUpdate();
ps.close();
con.close();

if (rows > 0) {
    response.sendRedirect("listUsers.jsp");
} else {
    out.println("Update failed");
}
%>