package com.playdata.todos.servlet;

import com.playdata.todos.config.History;
import com.playdata.todos.dao.UserDao;
import com.playdata.todos.dto.User;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("views/main.html").forward(req, resp);
        History.setHistory(req, resp);
        Cookie[] cookies = req.getCookies();
        String uid = null;
        String uname = null;
        for (Cookie c:cookies) {
            if(c.getName().equals("uid")) uid = c.getValue();
            if(c.getName().equals("uname")) uname = c.getValue();
        }
        HttpSession session = req.getSession();
        User byId = new UserDao().findById((Integer) session.getAttribute("uid"));
        if( session.getAttribute("uname") != null){

            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = resp.getWriter();
            System.out.println(session.getAttribute("uname"));
            writer.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>main</title>\n" +
                    "<link rel=\"stylesheet\"\n" +
                    "          href=\"/css/login.css\">\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>"  + byId.getName() + " 환영합니다.</h1>\n" +
//                    "    <h1>" + UserDao.me.getCreateAt() + " 가입했습니다.</h1>\n" +
                    "    <img src=\"/img/ffsf.png\">\n" +
                    "   <a href=\"/back\">back</a>\n" +
//                    "   <a href=\"/todos\">+</a>\n" +
                    "   <a href=\"/userupdate\">user udpate</a>\n" +
                    "</body>\n" +
                    "</html>");
            writer.close();
        }else{
            resp.sendRedirect("/login");
        }

    }
}
