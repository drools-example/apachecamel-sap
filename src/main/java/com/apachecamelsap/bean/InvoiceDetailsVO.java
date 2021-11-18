package com.apachecamelsap.bean;

import java.io.Serializable;

public class InvoiceDetailsVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String sign;
	private String option;
	private String refDocLow;
	private String refDocHigh;

	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getRefDocLow() {
		return refDocLow;
	}
	public void setRefDocLow(String refDocLow) {
		this.refDocLow = refDocLow;
	}
	public String getRefDocHigh() {
		return refDocHigh;
	}
	public void setRefDocHigh(String refDocHigh) {
		this.refDocHigh = refDocHigh;
	}
}
