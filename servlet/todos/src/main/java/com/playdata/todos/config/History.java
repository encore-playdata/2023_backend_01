package com.playdata.todos.config;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class History{

    private final static String history = "history";

    public static void setHistory(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        if(session.getAttribute("histMode")==null)
            session.setAttribute("histMode",false);
        Boolean mode = (Boolean) session.getAttribute("histMode");
        if(mode) return;
        Cookie[] cookies = req.getCookies();
        String requestURI = req.getRequestURI();
        int index = session.getAttribute("index")==null
                ? 0
                : (Integer) session.getAttribute("index");
        if(cookies == null) {
            resp.addCookie(new Cookie(history + index , requestURI));
            return;
        }
        int max = 0;
        for (int i  = 0; i< cookies.length; i++) {
            Cookie c = cookies[i];
            if(c.getName().contains(history)
                    &&
                    index == Integer.parseInt(c.getName().replace(history,"")
            )) {
                index = Integer.parseInt(
                        c.getName().replace(history, "")
                );
                max = i;
            }
        }
        index++;
        if(!cookies[max].getValue().equals(requestURI)) {
            session.setAttribute("index", index);
            resp.addCookie(new Cookie(history + index, requestURI));
        }

    }
    public static void back(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//         TODO: 뒤로가기
//         하나도 없으면 /login으로 가고
//        뒤로 가기
        String path = "/login";

        HttpSession session = req.getSession();
        Cookie[] cookies = req.getCookies();

        Integer index = (Integer) session.getAttribute("index");
        if(index-1 >= 0) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie c = cookies[i];
                if (c.getName().contains(history)
                        &&
                        index - 1 == Integer.parseInt(c.getName().replace(history, ""))) {
                    path = c.getValue();
                    break;
                }
            }
        }
        resp.sendRedirect(path);

        session.setAttribute("histMode", true);
        session.setAttribute("index", (Integer) session.getAttribute("index")-1);
    }
}
