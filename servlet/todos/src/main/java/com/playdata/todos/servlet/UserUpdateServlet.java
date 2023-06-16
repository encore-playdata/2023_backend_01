package com.playdata.todos.servlet;

import com.playdata.todos.config.History;
import com.playdata.todos.dao.UserDao;
import com.playdata.todos.dto.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        History.setHistory(req, resp);
        req.getRequestDispatcher("views/userupdate.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String password = req.getParameter("password");
        String name = req.getParameter("name");
        User user = new User((Integer)req.getSession().getAttribute("uid"), null, password, name, null);
        UserDao userDao = new UserDao();
        userDao.update(user);
        resp.sendRedirect("/main");
        resp.setStatus(201);
    }
}
