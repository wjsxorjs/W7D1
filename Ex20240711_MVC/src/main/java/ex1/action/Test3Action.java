package ex1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Test3Action implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// request에 저장할 현재날짜를 구하자!
		String result = "회원";
		String v1 = request.getParameter("v1");
		
		if(v1 == null) {
			result = "비회원";
		} else if(v1.equalsIgnoreCase("admin")) {
			result = "관리자";
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",result);
		
		// 뷰 페이지 지정
		mv.setViewName("ex3");
		
		return mv;
	}

}
