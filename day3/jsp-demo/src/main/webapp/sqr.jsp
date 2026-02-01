<!-- http://localhost:8081/demo/sqr.jsp?number=5 -->
<%
String num = request.getParameter("number");
if (num != null) {
    int x = Integer.parseInt(num);
%>
    Square: <%= x * x %>
<% } %>
<!-- CW1: WAP to print addition of 2 numbers-->