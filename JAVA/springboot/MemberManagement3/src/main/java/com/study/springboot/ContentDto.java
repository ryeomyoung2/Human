package com.study.springboot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContentDto {
	@NotNull(message="writer is null")
	@NotEmpty(message="writer is empty")
	private String loginid;
	@NotNull(message="content is null")
	@NotEmpty(message="content is empty")
	private String passcode;

}

//없어도 되는 파일