package com.playdata.todos.servlet;

import com.playdata.todos.config.History;
import com.playdata.todos.dao.UserDao;
import com.playdata.todos.dto.User;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        History.setHistory(req, resp);
        req.getRequestDispatcher("views/login.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new UserDao().login(username, password);
//        Cookie cookie = new Cookie("uid", user.getId().toString());
//        Cookie cookie2 = new Cookie("uname", user.getName());
//        cookie.setMaxAge(10);
//        resp.addCookie(cookie);
//        resp.addCookie(cookie2);
        HttpSession session = req.getSession();
        session.setAttribute("uname", user.getName());

        if(user != null){
            resp.sendRedirect("/main");
        }else resp.sendRedirect("/user");
    }
}
