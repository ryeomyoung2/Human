package com.study.springboot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContentDto2 {
	
	@NotNull(message="content is null")
	@NotEmpty(message="content is empty")
	private String loginid2;
	@NotNull(message="content is null")
	@NotEmpty(message="content is empty")
	private String passcode2;
	@NotNull(message="content is null")
	@NotEmpty(message="content is empty")
	private String passcode3;
	@NotNull(message="content is null")
	@NotEmpty(message="content is empty")
	private String name;
	@NotNull(message="content is null")
	@NotEmpty(message="content is empty")
	private String mobile;

}
//없어도 되는 파일