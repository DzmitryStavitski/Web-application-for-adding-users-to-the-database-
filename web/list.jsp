<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Xiaomi
  Date: 25.09.2020
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">

<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>USERS LIST</h1>
</div>

<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-light-blue">
            <h2>Users</h2>
        </div>

        <%
            List<String> names = (List<String>) request.getAttribute("userNames");
            if(names != null && !names.isEmpty()) {
                out.println("<ul class=\"w3-ul\">");
                for(String s : names) {
                    out.println("<li class=\"w3-hover-sand\">" + s + "</li>");
                }
                out.println("</ul>");
            } else
                out.println("<p> NO USERS </p>");
        %>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
