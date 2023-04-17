package com.jsp.chap04;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

// url 요청으로 /hahahoho 라고 요청하면 test.jsp를 열어줄 것이다.
@WebServlet("/hahahoho")
public class TestViewServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        // jsp 파일 열기 : 포워딩
        RequestDispatcher dp = servletRequest.getRequestDispatcher("WEB-INF/test.jsp");
        dp.forward(servletRequest, servletResponse);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
