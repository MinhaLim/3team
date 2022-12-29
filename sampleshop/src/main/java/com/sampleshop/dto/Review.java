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
	
	public Review(int rev_code, int user_code, int score, String title, String content) {
		super();
		this.rev_code = rev_code;
		this.user_code = user_code;
		this.score = score;
		this.title = title;
		Content = content;
	}
	
}