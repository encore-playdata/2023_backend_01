<%@ page import="com.playdata.todos.dto.TodoJoinUser" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table>
    <tr>
        <td>id</td>
        <td>content</td>
        <td>작성자</td>
        <td>작성일</td>
        <td>check</td>
    </tr>
<%
    List<TodoJoinUser> todos = (List<TodoJoinUser>)request.getAttribute("todolist");
    if(todos.size() != 0){
        for (TodoJoinUser todo :todos) {%>
            <tr>
                <td><%= todo.getId()%></td>
                <td><%= todo.getContent()%></td>
                <td><%= todo.getCreateAt()%></td>
                <td><%= todo.getName()%></td>
                <td><%= todo.isChecked()%></td>
            </tr>
        <%
        }
    }
    %>
</table>
