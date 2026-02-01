<!-- http://localhost:8081/demo/cube_action.jsp?num=5 -->
 
<%
String num = request.getParameter("num");
if (num != null) {
    int x = Integer.parseInt(num);
%>
    Cube: <%= x * x * x %>
<% } %>