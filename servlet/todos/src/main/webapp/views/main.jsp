<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>main</title>
</head>
<body>
    <%
        if(session.getAttribute("uid")==null)
            response.sendRedirect("/login");
    %>

    <img src="/img/ffsf.png">
    <%
        String uname = (String) request.getAttribute("uname");
        for(int i=0; i< 10; i++){%>

            <h1><%=uname%> 환영합니다.</h1>
        <% }
    %>
    <%@ include file="todos.jsp"%>
    <%@ include file="todolist.jsp"%>
</body>
</html>