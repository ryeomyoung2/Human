package com.study.springboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/loginform")                        //저장된세션이없으면 회원가입창부터 뜨게하는코드
	public String loginform(HttpServletRequest req) {		
		HttpSession session=req.getSession();			
		if(session.getAttribute("userid")==null) {		
				return "redirect:/signon";				
		}
		return "loginform";
	}													 //
	
//	@RequestMapping("/loginform")						 //로그인창부터 나오게하기	
//	public String loginform() {
//		
//		
//		return "loginform";	
//		
//		
//	}
	@RequestMapping("/signon")
	public String signon() {
		
		return "signon";
	}
	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
	
	
//	@RequestMapping("/create")
//	public String insert(@ModelAttribute("dto") @Valid ContentDto contentDto,
//							BindingResult result)
//	{
//		String page= "loginok";
//		System.out.println(contentDto);
//		
//		if(result.hasErrors()) {
//
//			if(result.getFieldError("loginid")!=null) {
//				System.out.println("1:"+result.getFieldError("loginid").getDefaultMessage());
//			}
//			if(result.getFieldError("passcode")!=null) {
//				System.out.println("2:"+result.getFieldError("passcode").getDefaultMessage());
//			}
//			page="loginform";
//		}
//		
//		return page;
		
		
//	}
//	@RequestMapping("/create2")
//	public String insert2(@ModelAttribute("dto2") @Valid ContentDto2 contentDto2,
//							BindingResult result)
//	{
//		String page= "register";
//		System.out.println(contentDto2);
//		
//		if(result.hasErrors()) {
//
//			if(result.getFieldError("loginid2")!=null) {
//				System.out.println("1:"+result.getFieldError("loginid2").getDefaultMessage());
//			}
//			if(result.getFieldError("passcode2")!=null) {
//				System.out.println("2:"+result.getFieldError("passcode2").getDefaultMessage());
//			}
//			if(result.getFieldError("passcode3")!=null) {
//				System.out.println("3:"+result.getFieldError("passcode3").getDefaultMessage());
//			}
//			if(result.getFieldError("name")!=null) {
//				System.out.println("4:"+result.getFieldError("name").getDefaultMessage());
//			}
//			if(result.getFieldError("mobile")!=null) {
//				System.out.println("5:"+result.getFieldError("mobile").getDefaultMessage());
//			}
//			page="signon";
//		}
//		
//		return page;
//		
//		
//	}
	@RequestMapping("/dologin")
	public String dologin(HttpServletRequest req, Model model) {
		String loginid = req.getParameter("loginid");
		String passcode = req.getParameter("passcode");
		HttpSession session = req.getSession(); //세션변수 생성하는 코드
		if (!loginid.equals(session.getAttribute("userid")) || !passcode.equals(session.getAttribute("passcd"))) {  
			return "redirect:/loginform";                      
		}                                                  

		model.addAttribute("loginid", loginid);
		model.addAttribute("passcode", passcode);
		return "loginok";
	}
	@RequestMapping("/dosign")
	public String dosign(HttpServletRequest req, Model model) {
		HttpSession session=req.getSession();  //세션변수 생성하는 코드
		
		String loginid = req.getParameter("loginid");
		String passcode = req.getParameter("passcode");
		String passcode2 = req.getParameter("passcode2");
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		if (!passcode.equals(passcode2)) {  
			return "redirect:/signon";                      
		}  
		
		session.setAttribute("userid", loginid); //세션변수 생성하는 코드
		session.setAttribute("passcd", passcode); //
		
		model.addAttribute("loginid", loginid);
		model.addAttribute("passcode", passcode);
		model.addAttribute("passcode2", passcode2);
		model.addAttribute("name", name);
		model.addAttribute("mobile", mobile);
		return "register";
	}

	
}
