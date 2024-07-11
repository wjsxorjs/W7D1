package ex1.action;

import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Test3Action implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// request에 저장할 현재날짜를 구하자!
		String v1 = request.getParameter("v1");
		
		if(v1 == null) {
			v1 = "a";
		}
		
		String result = "회원";
		
		if(v1.equals("admin")) {
			result = "관리자";
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",result);
		
		// 뷰 페이지 지정
		mv.setViewName("ex3");
		
		return mv;
	}

}
