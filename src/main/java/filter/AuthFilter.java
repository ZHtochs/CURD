package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AuthFilter")
public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String uri = request.getRequestURI();
        //如果访问的资源是以css或者js结尾的，那么就不需要判断是否登录
        if (uri.endsWith(".css") || uri.endsWith(".js")) {
            chain.doFilter(request, response);
            return;
        }

        if (uri.endsWith("login.html") || uri.endsWith("login")) {
            chain.doFilter(request, response);
            return;
        }

        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName) {
            response.sendRedirect("login.html");
            return;
        }
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
