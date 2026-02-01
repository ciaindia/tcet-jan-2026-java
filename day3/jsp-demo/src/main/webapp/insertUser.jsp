<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");

// Server-side validation
if (name == null || email == null || 
    name.trim().equals("") || email.trim().equals("")) {
    out.println("Invalid Input");
    return;
}

PreparedStatement ps = con.prepareStatement(
    "INSERT INTO users(name, email) VALUES (?, ?)"
);
ps.setString(1, name);
ps.setString(2, email);

int rows = ps.executeUpdate();
ps.close();
con.close();

if (rows > 0) {
    response.sendRedirect("listUsers.jsp");
} else {
    out.println("Insert failed");
}
%>