package com.apachecamelsap.bean;

import java.io.Serializable;

/**
 * 
 * @author jugalpatel
 *
 */
public class CustomerDetailsVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String customerNo;
	
	private String companyCode;

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
}
