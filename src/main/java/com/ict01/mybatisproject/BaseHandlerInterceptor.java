package com.ict01.mybatisproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Slf4j
public class BaseHandlerInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object
      handler) throws Exception {
    log.info("preHandle requestURI : {}", request.getRequestURI());
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object
      handler, ModelAndView modelAndView) throws Exception {
    log.info("postHandle requestURI : {}", request.getRequestURI());
  }
}