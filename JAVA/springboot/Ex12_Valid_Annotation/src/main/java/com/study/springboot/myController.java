package com.study.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "validator(2)";
	}
	@RequestMapping("/insertForm")
	public String insert1() {
		return "createPage";
	}
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") @Valid ContentDto contentDto,
						  BindingResult result, Model model) {
		String page = "createDonePage"; // 성공하면 표시될 JSP 화일이름
		System.out.println(contentDto);
		
		String errmsg="";
		if(result.hasErrors()) {
			System.out.println("getAllErrors: "+result.getAllErrors());
			if(result.getFieldError("writer")!=null) {
				System.out.println("1:"+
						result.getFieldError("writer").getDefaultMessage());  //getCode());	
				errmsg+=result.getFieldError("writer").getDefaultMessage();
						
			}
			if(result.getFieldError("content")!=null){
				System.out.println("2"+
						result.getFieldError("content").getDefaultMessage()); //getCode());
				errmsg+="   "+result.getFieldError("content").getDefaultMessage();
			}
			contentDto.setError_message(errmsg);
			page="createPage";
		}
		return page;
	}
}

