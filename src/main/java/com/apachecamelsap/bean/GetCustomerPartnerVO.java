package com.apachecamelsap.bean;

import java.io.Serializable;
import java.util.Map;

public class GetCustomerPartnerVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String customerNo;
	private String saleOrg;
	private String distChannel;
	private String distDivision;
	private String partnerFn;


    private Map partners;

    private Integer recordsCount;

	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getSaleOrg() {
		return saleOrg;
	}
	public void setSaleOrg(String saleOrg) {
		this.saleOrg = saleOrg;
	}

    public String getDistChannel() {
		return distChannel;
	}
	public void setDistChannel(String distChannel) {
		this.distChannel = distChannel;
	}

    public String getDistDivision() {
		return distDivision;
	}
	public void setDistDivision(String distDivision) {
		this.distDivision = distDivision;
	}

    public String getPartnerFn() {
		return partnerFn;
	}
	public void setPartnerFn(String partnerFn) {
		this.partnerFn = partnerFn;
	}

    public Map getpartners() {
		return partners;
	}

	public void setpartners(Map partners) {
		this.partners = partners;
	}

    public Integer getrecordsCount() {
		return recordsCount;
	}

	public void setrecordsCount(Integer recordsCount) {
		this.recordsCount = recordsCount;
	}
}
