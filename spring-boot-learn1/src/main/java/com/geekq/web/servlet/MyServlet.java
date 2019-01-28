package com.geekq.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 邱润泽
 */
@WebServlet(urlPatterns = "/my/servlet",asyncSupported = true)
public class MyServlet  extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        AsyncContext asyncContext = req.startAsync();

        /**
         * 异步方式非阻塞
         */
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                try {
                    resp.getWriter().println("hello world");
                    //触发完成
                    asyncContext.complete();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
