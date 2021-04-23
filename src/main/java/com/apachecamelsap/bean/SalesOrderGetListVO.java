package com.apachecamelsap.bean;

import java.io.Serializable;

public class SalesOrderGetListVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String customerNumber;
	private String salesOrganization;
	private String documentDate;
	private String documentDateTo;
	private String material;
	private String purchaseOrder;
	private String purchaseOrderNumber;
	private String transactionGroup;
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getDocumentDate() {
		return documentDate;
	}
	public void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
	}
	public String getDocumentDateTo() {
		return documentDateTo;
	}
	public void setDocumentDateTo(String documentDateTo) {
		this.documentDateTo = documentDateTo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public String getSalesOrganization() {
		return salesOrganization;
	}
	public void setSalesOrganization(String salesOrganization) {
		this.salesOrganization = salesOrganization;
	}
	public String getTransactionGroup() {
		return transactionGroup;
	}
	public void setTransactionGroup(String transactionGroup) {
		this.transactionGroup = transactionGroup;
	}
}
