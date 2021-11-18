package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.List;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.Table;
import org.hibersap.annotations.ThrowExceptionOnError;

@Bapi("BAPI_SALESORDER_CREATEFROMDAT2")
//@ThrowExceptionOnError
public class CreateSaleOrderBapi implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Import
	@Parameter(value = "ORDER_HEADER_IN", type = ParameterType.STRUCTURE)
	private OrderHeaderIn order_header_in;
	
	@Export
	@Parameter(value="SALESDOCUMENT")
	private String salesDocument;
	
	@Table
	@Parameter("ORDER_PARTNERS")
	private List<Object> order_partners;

	public OrderHeaderIn getOrder_header_in() {
		return order_header_in;
	}

	public void setOrder_header_in(OrderHeaderIn order_header_in) {
		this.order_header_in = order_header_in;
	}

	public String getSalesDocument() {
		return salesDocument;
	}

	public void setSalesDocument(String salesDocument) {
		this.salesDocument = salesDocument;
	}

	public List<Object> getOrder_partners() {
		return order_partners;
	}

	public void setOrder_partners(List<Object> order_partners) {
		this.order_partners = order_partners;
	}
}
