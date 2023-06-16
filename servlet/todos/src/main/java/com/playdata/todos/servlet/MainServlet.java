package com.playdata.todos.servlet;

import com.playdata.todos.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("views/main.html").forward(req, resp);
        Cookie[] cookies = req.getCookies();
        String uid = null;
        String uname = null;
        for (Cookie c:cookies) {
            if(c.getName().equals("uid")) uid = c.getValue();
            if(c.getName().equals("uname")) uname = c.getValue();
        }
        if(uid != null && uname != null){
            HttpSession session = req.getSession();
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = resp.getWriter();
            writer.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>main</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>" + uname + " " + session.getAttribute("uname") + " 환영합니다.</h1>\n" +
//                    "    <h1>" + UserDao.me.getCreateAt() + " 가입했습니다.</h1>\n" +
                    "    <img src=\"/img/ffsf.png\">\n" +
                    "</body>\n" +
                    "</html>");
            writer.close();
        }else{
            resp.sendRedirect("/login");
        }

    }
}
