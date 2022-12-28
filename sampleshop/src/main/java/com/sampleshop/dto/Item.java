package com.sampleshop.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Item {
	private int item_code;
	private int cate_code;
	private String name;
	private int price;
	private String about;
	private int stock;
	private Date rdate;
}
