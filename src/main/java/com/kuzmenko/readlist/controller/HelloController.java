package com.kuzmenko.readlist.controller;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(value = "/hello") // Can be used instead web.xml
public class HelloController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        var username = request.getParameter("userName") != null ? request.getParameter("userName") : "man";
        var writer = response.getWriter();
        writer.println("<html> <body>");
        writer.println("<h1>Hello world!</h1>");
        writer.println("<h3>Hello " + username + " welcome to Servlet/JSP programming!</h3>");
        writer.println("</body> </html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    }


    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) {
    }


    @Override
    protected void doPatch(HttpServletRequest request, HttpServletResponse response) {
    }


    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
    }

}
