
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form method="post" action="/todoupdate">
    <input type="number" value="${todoid}" name="id">
    <input type="text" value="${content}" name="content">
    <input type="submit">
  </form>
</body>
</html>
