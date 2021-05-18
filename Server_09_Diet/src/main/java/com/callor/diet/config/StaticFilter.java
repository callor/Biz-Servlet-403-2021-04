package com.callor.diet.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "/Static",urlPatterns = "/*.css")
public class StaticFilter  implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		res.setContentType("text/css;charset=utf-8");
		chain.doFilter(req, res);
	}
}
