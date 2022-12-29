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
public class Order {
	private int order_code;
	private int user_code;
	private int tot_price;
	private String payment;
	private Date order_date;
	private int addr_code;
}
