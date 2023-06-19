<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>todos insert</title>
</head>
<body>
    <%
        if(session.getAttribute("uid")==null)
            response.sendRedirect("/login");
    %>
    <div>
      <form action="/todoinsert" method="post">
        <input type="text" name="content" placeholder="content을 입력해주세요">
        <input type="submit">
      </form>
    </div>
</body>
</html>