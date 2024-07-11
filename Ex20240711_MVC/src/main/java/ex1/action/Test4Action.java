package ex1.action;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test4Action {
	@RequestMapping("/t4.inc")
	public ModelAndView exe() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("msg", "연습입니다");
		
		mv.setViewName("ex4");
		
		return mv;
	}
	
	@RequestMapping("/t5.inc")
	public ModelAndView exe2() {
		// request에 저장할 현재날짜를 구하자!
		
		LocalDate now = LocalDate.now();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("now",now.toString());
		
		// 뷰 페이지 지정
		mv.setViewName("ex5");
		
		return mv;
	}
	@RequestMapping("/t6.inc")
	public String exe3() {
		
		
		return "ex6";
	}
	
	@RequestMapping("/t7.inc")
	public ModelAndView exe4(String id, String pw) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("id",id);
		mv.addObject("pw",pw);
		
		mv.setViewName("ex7");
		
		return mv;
	}
}
