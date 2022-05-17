<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Connection con;
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            try {
                String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=mytest;Username=sa;Password = dat09122001";

                con = DriverManager.getConnection(connectionURL);
                Statement st = con.createStatement();
                String sql = "Select * from PRODUCT";
                ResultSet rs = st.executeQuery(sql);
                out.println("<table border='1' cellpadding='2' cellspacing='0' width='100%'>");
                out.println("<tr><th>CODE</th><th>NAME</th>");
                out.println("<th>PRICE</th></tr>");
                while (rs.next()) {
                    out.println("<tr><td>" + rs.getString("CODE") + "</td><td>" + rs.getString("NAME") + "</td>");
                    out.println("<td>" + rs.getString("PRICE") + "</td></tr>");
                }
                out.println("</table>");
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        %>
    </body>
</html>
