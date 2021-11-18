package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.Table;
import org.hibersap.annotations.ThrowExceptionOnError;
import org.hibersap.bapi.BapiRet2;
/**
 * 
 * @author jugalpatel
 *
 */
@Bapi("BAPI_SALESORDER_GETLIST")
@ThrowExceptionOnError
public class SalesOrderGetListBapi implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Import
	@Parameter("CUSTOMER_NUMBER")
	private String customer_number;
	
	@Import
	@Parameter("DOCUMENT_DATE")
	private Date document_date;
	
	@Import
	@Parameter("DOCUMENT_DATE_TO")
	private Date document_date_to;
	
	@Import
	@Parameter("MATERIAL")
	private String material;
	
	@Import
	@Parameter("PURCHASE_ORDER")
	private String purchase_order;
	
	@Import
	@Parameter("PURCHASE_ORDER_NUMBER")
	private String purchase_order_number;
	
	@Import
	@Parameter("SALES_ORGANIZATION")
	private String sales_organization;
	
	@Import
	@Parameter("TRANSACTION_GROUP")
	private String transaction_group;

	@Export
	@Parameter(value="RETURN", type = ParameterType.STRUCTURE)
	private BapiRet2 returnData;
	
	@Table
	@Parameter("SALES_ORDERS")
	private List<SalesOrder> sales_orders;

	public String getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}

	public Date getDocument_date() {
		return document_date;
	}

	public void setDocument_date(Date document_date) {
		this.document_date = document_date;
	}

	public Date getDocument_date_to() {
		return document_date_to;
	}

	public void setDocument_date_to(Date document_date_to) {
		this.document_date_to = document_date_to;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPurchase_order() {
		return purchase_order;
	}

	public void setPurchase_order(String purchase_order) {
		this.purchase_order = purchase_order;
	}

	public String getPurchase_order_number() {
		return purchase_order_number;
	}

	public void setPurchase_order_number(String purchase_order_number) {
		this.purchase_order_number = purchase_order_number;
	}

	public String getSales_organization() {
		return sales_organization;
	}

	public void setSales_organization(String sales_organization) {
		this.sales_organization = sales_organization;
	}

	public String getTransaction_group() {
		return transaction_group;
	}

	public void setTransaction_group(String transaction_group) {
		this.transaction_group = transaction_group;
	}

	public BapiRet2 getReturnData() {
		return returnData;
	}

	public void setReturnData(BapiRet2 returnData) {
		this.returnData = returnData;
	}

	public List<SalesOrder> getSales_orders() {
		return sales_orders;
	}

	public void setSales_orders(List<SalesOrder> sales_orders) {
		this.sales_orders = sales_orders;
	}
}
