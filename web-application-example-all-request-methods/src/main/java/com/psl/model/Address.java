package com.psl.model;

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
public class Address {
	private int addressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private String pincode;

}
