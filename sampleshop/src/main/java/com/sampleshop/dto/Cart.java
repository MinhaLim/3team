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

public class Cart {
	private int cart_code;
	private int user_code;
	private int item_code;
	private int cnt;
	
	private String userid;
	private String item_name;
	private int amount;
	
	
	public Cart(int cart_code, int cnt) {
		super();
		this.cart_code = cart_code;
		this.cnt = cnt;
	}

	public Cart(int cart_code, int user_code, int item_code, int cnt) {
		this.cart_code = cart_code;
		this.user_code = user_code;
		this.item_code = item_code;
		this.cnt = cnt;
	}
	
}