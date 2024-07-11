package ex1.action;

import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Test2Action implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// request에 저장할 현재날짜를 구하자!
		Date now1 = new Date(System.currentTimeMillis());
		
		LocalDate now2 = LocalDate.now();
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("now1",now1.toString());
		mv.addObject("now2",now2.toString());
		
		// 뷰 페이지 지정
		mv.setViewName("ex2");
		
		return mv;
	}

}
