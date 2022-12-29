package com.sampleshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
	private int user_code;
	private String userid;
	private String pwd;
	private String name;
	private String tel;
	private String email;
	private int addr_code;
}
