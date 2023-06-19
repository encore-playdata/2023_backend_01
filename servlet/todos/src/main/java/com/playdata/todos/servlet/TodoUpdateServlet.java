package com.playdata.todos.servlet;

import com.playdata.todos.dao.TodoDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TodoUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("todoid", req.getParameter("todoid"));
        int id = Integer.parseInt(req.getParameter("todoid"));
        String content = new TodoDao().findById(id).getContent();
        req.setAttribute("content", content);
        req.getRequestDispatcher("/views/todoupdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int uid = (Integer) req.getSession().getAttribute("uid");
        int id = Integer.parseInt(req.getParameter("id"));
        String content = req.getParameter("content");
        new TodoDao().update(id, uid, content);
        resp.sendRedirect("/main");

    }
}
