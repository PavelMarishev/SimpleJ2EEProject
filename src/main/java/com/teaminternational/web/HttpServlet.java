package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServlet extends BaseHttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doGet(req, resp);
        HelloWorldGenerator hello = getBean(HelloWorldGenerator.COMPONENT_NAME);
        hello.sayHello();
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        pw.print("<html>\n" +
                "<head>\n" +
                "<title>HelloWorldPage</title>\n" +
                "/head\n" +
                "body bgcolor=\"grey\"\n" +
               hello.sayHello()+"\n"+
                "</body>\n"+
                "</html>\n");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        super.doPost(req, resp);
    }
}
