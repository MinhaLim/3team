package com.sampleshop.dto;

import java.util.Date;

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

public class Review {
	private int rev_code;
	private int item_code;
	private int user_code;
	private int score;
	private String title;
	private String Content;
	private Date rdate;
}