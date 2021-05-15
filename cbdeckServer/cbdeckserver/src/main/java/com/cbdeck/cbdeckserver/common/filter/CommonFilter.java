package com.cbdeck.cbdeckserver.common.filter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * description: 统一过滤器
 *
 * @date: 2021/2/13 18:26
 * @author: gong.wei
 */
@WebFilter(urlPatterns = {"/*"}, filterName = "commonFilter")
@Component
public class CommonFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext servletContext = filterConfig.getServletContext();
        /*AbstractApplicationContext cxt = (AbstractApplicationContext) WebApplicationContextUtils.getWebApplicationContext(servletContext);
        if (cxt != null && cxt.getBean("buildTokenService") != null && this.buildTokenService == null) {
            this.buildTokenService = (BuildTokenService)cxt.getBean("buildTokenService");
        }*/

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse)response;
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        res.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with, sid, mycustom, smuser");
        res.addHeader("Access-Control-Max-Age", "1800");
        filterChain.doFilter(request, res);
    }

    @Override
    public void destroy() {

    }

}
