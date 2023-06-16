package com.playdata.todos.config;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class History{

    public static void setHistory(HttpServletRequest req, HttpServletResponse resp){
        Cookie[] cookies = req.getCookies();
        String requestURI = req.getRequestURI();
        String history = "history";
        int index = 0;
        if(cookies == null) {
            resp.addCookie(new Cookie(history + index , requestURI));
            return;
        }
        int max = 0;
        for (int i  = 0; i< cookies.length; i++) {
            Cookie c = cookies[i];
            if(c.getName().contains(history)
                    &&
                    index < Integer.parseInt(c.getName().replace(history,"")
            )) {
                index = Integer.parseInt(
                        c.getName().replace(history, "")
                );
                max = i;
            }
        }
        index++;
        if(!cookies[max].getValue().equals(requestURI))
            resp.addCookie(new Cookie(history + index , requestURI));

    }
    public static void back(HttpServletRequest req, HttpServletResponse resp){
//         TODO: 뒤로가기
//         하나도 없으면 /login으로 가고
//        뒤로 가기 하면 최근 것만 찾아갈건데 이거를 개선해야지
    }
}
