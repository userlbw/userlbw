package com.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Pagejump extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> l=new ArrayList<String>();
        l.add("111");
        l.add("222");
        l.add("333");
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pw=resp.getWriter();
        for(String s:l){
            pw.write("<p>"+s+"<p>");
        }
        pw.flush();
        pw.close();
    }
}
