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

public class UserReview {
	private String userid;
	private String username;
	private String itemname;
	private int score;
	private String title;
	private String content;

}
