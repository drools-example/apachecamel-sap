package com.apachecamelsap.bean;

import java.io.Serializable;

public class KeyBalanceVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String companyCode;
	private String customer;
	private String keydate;
	private String balance;
	private String notedItems;

	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getKeydate() {
		return keydate;
	}
	public void setKeydate(String keydate) {
		this.keydate = keydate;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getNotedItems() {
		return notedItems;
	}
	public void setNotedItems(String notedItems) {
		this.notedItems = notedItems;
	}
}
