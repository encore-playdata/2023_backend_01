package com.naver.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LegacyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String query = req.getParameter("query");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>");
        writer.println("</head>");
        writer.println("<body>");
        for (int i = 0; i < 5; i++) {
            writer.println("<h1>legacy 안녕 세상</h1>");
            writer.println(id +"님 환영하요");
            writer.println(query +"를 검색했네요");
        }
        writer.println("</body>");
        writer.println("</html>");
        writer.close();

        super.doGet(req, resp);
    }
}
