package com.itdfq.sys;

import com.itdfq.houtai.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		String url = request.getRequestURI();
		
		HttpSession session  = request.getSession();
		User user = (User) session.getAttribute("user");
		
//		if(user == null) {
//			PrintWriter out = response.getWriter();
////			out.print("<script>window.top.location.href ='/login.html'</script>");
//           return false;
//		}
		
		
		
		//request.getRequestDispatcher("/login.jsp").forward(request, response);
		
		
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		
	}

}
