package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store {
	//POJO CLASS-ES
	private Store name;
	private int branch_no;
	@Autowired
	private Devices phone;
	public Store getName() {
		return name;
	}
	public void setName(Store name) {
		this.name = name;
	}
	public int getBranch_no() {
		return branch_no;
	}
	public void setBranch_no(int branch_no) {
		this.branch_no = branch_no;
	}
	public void buy_device()
	{   
		phone.trial();
		System.out.println("Purchasing Device ");
	}
}
