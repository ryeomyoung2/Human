package com.study.springboot;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myController {

	@RequestMapping("/login")
	public String login() {
		System.out.println("login called.");
		return "login";
	}

	@RequestMapping("/multiple")
	public String multiple() {
		return "multiple";
	}

	@RequestMapping("/checkUser")
	public String checkUser(HttpServletRequest req, Model model) {
		String loginId = req.getParameter("loginid");
		String pw = req.getParameter("passcode");
		if (!loginId.equals("R") || !pw.equals("1111")) {  //특정한 아이디와 비밀번호가 아니면 다시 login.jsp로 돌아가는 코드
			return "redirect:/login";                      //
		}                                                  //

		model.addAttribute("loginid", loginId);
		model.addAttribute("passcode", pw);
		return "logininfo";
	}
	
	
//	@RequestMapping("/checkUser")
//	public String checkUser(Member member, Model model) {
//		String loginId = member.getLoginId();
//		String pw = member.getPasscode();
//		
//		if (!loginId.equals("R") || !pw.equals("1111")) {  //특정한 아이디와 비밀번호가 아니면 다시 login.jsp로 돌아가는 코드
//			return "redirect:/login";                      //
//		}                                                  //
//
//		model.addAttribute("loginid", loginId);
//		model.addAttribute("passcode", pw);
//		return "logininfo";
//	}
	
//	@RequestMapping("/multipleDan")
//	public String multipleDan(HttpServletRequest req, Model model) {
//		String Dan = req.getParameter("Dan");
//		
//
//		model.addAttribute("Dan",Dan);
//		return "result";
//	}

	@RequestMapping("/multipleDan/{Dan}")
	public String multipleDan(@PathVariable String Dan, Model model) {
//		String Dan = req.getParameter("Dan");
		model.addAttribute("Dan", Dan); // result로 Dan을 보낼게 아니라면 이 줄은 없어도됨
		int n = Integer.parseInt(Dan);

		if (n < 2 || n > 9) { // n이 2이하거나 9보다크면 다시 이전화면 출력
			return "redirect:/multiple"; //
		} //

		String result2 = "";
		for (int j = 1; j < 10; j++) {
			result2 = result2 + (n + " x " + j + " = " + n * j) + "<br>";
		}
		
		model.addAttribute("result2", result2);
		return "result";
	}

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "JSP in Gradle"; // raw string 문자열자체
	}

	@RequestMapping("/test1") // URL일부(경로)
	public String test1(Model model) {
		model.addAttribute("name", "Lim Yeo Myeong");
		model.addAttribute("gender", "Male");
		model.addAttribute("age", 27);
		return "test1"; // JSP파일이름
	}

	@RequestMapping("/test2")
	public ModelAndView test2() {
		ModelAndView mv = new ModelAndView();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Grape");
		list.add("Peach");

		mv.addObject("lists", list);
		mv.addObject("names", "사과,포도,복숭아");
		mv.setViewName("test2");

		return mv;
	}

	@RequestMapping("/mt")
	public String mt() {
		return "mt";
	}
	@RequestMapping("/test3/{fruit}/{flower}")
	public String rest_test(@PathVariable String fruit,
							@PathVariable String flower,
							Model model) {
		model.addAttribute("fruit",fruit);
		model.addAttribute("flower",flower);
		return "test4";
	}
}
