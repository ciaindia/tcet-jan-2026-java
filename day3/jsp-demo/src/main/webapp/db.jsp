<%@ page import="java.sql.*" %>
<%
String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
String user = "root";
String password = "%TGBbgt5"; //In windows keep this blank

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url, user, password);
%>