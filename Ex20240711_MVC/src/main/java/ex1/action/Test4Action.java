package ex1.action;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ex1.vo.ParamVO;

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
	
	@RequestMapping("/t8.inc")
	public String exe5() {
		
		return "ex8";
	}

	@RequestMapping("/t9.inc")
	public ModelAndView exe6(String c_idx, String u_name, String unit, String[] hobby) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("c_idx",c_idx);
		mv.addObject("u_name",u_name);
		mv.addObject("unit",unit);
		mv.addObject("hobby",hobby);
		
		mv.setViewName("ex9");
		
		return mv;
	}
	
	@RequestMapping("/t10.inc")
	public ModelAndView exe7(ParamVO pvo) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("vo",pvo);
		
		mv.setViewName("ex10");
		
		return mv;
	}
}
