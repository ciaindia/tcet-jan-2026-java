<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>

<%
String idParam = request.getParameter("id");

if (idParam == null) {
    out.println("Invalid User ID");
    return;
}






int id = Integer.parseInt(idParam);

PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE id=?");
ps.setInt(1, id);
ps.executeUpdate();

ps.close();
con.close();

response.sendRedirect("listUsers.jsp");
%>