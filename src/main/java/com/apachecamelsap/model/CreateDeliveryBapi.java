package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.Table;

@Bapi("BAPI_OUTB_DELIVERY_CREATE_SLS")
//@ThrowExceptionOnError
public class CreateDeliveryBapi implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Import
	@Parameter("SHIP_POINT")
	private String ship_point;
	
	@Import
	@Parameter("DUE_DATE")
	private Date due_date;
	
	@Import
	@Parameter("NO_DEQUEUE")
	private String no_dequeue;
	
	@Import
	@Parameter("DEBUG_FLG")
	private String debug_flg;
	
	@Export
	@Parameter(value="NUM_DELIVERIES")
	private String num_deliveries;
	
	@Export
	@Parameter(value="DELIVERY")
	private String delivery;
	
	@Table
	@Parameter("SALES_ORDER_ITEMS")
	private List<Object> salesOrderItems;

	public String getShip_point() {
		return ship_point;
	}

	public void setShip_point(String ship_point) {
		this.ship_point = ship_point;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public String getNo_dequeue() {
		return no_dequeue;
	}

	public void setNo_dequeue(String no_dequeue) {
		this.no_dequeue = no_dequeue;
	}

	public String getDebug_flg() {
		return debug_flg;
	}

	public void setDebug_flg(String debug_flg) {
		this.debug_flg = debug_flg;
	}

	public String getNum_deliveries() {
		return num_deliveries;
	}

	public void setNum_deliveries(String num_deliveries) {
		this.num_deliveries = num_deliveries;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public List<Object> getSalesOrderItems() {
		return salesOrderItems;
	}

	public void setSalesOrderItems(List<Object> salesOrderItems) {
		this.salesOrderItems = salesOrderItems;
	}
}
