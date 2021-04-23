package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
/**
 * 
 * @author jugalpatel
 *
 */
@BapiStructure
public class CustomerSepaDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("CUSTOMER")
    private Date customer;
	
	@Parameter("IBAN")
    private Date iban;
	
	@Parameter("APPLICATION")
    private Date application;
	
	@Parameter("SEPA_CREDITOR_ID")
    private Date sepa_creditor_id;
	
	@Parameter("SEPA_MANDATE_ID")
    private Date sepa_mandate_id;
	
	@Parameter("DUMMY")
    private Date dummy;

	public Date getCustomer() {
		return customer;
	}

	public void setCustomer(Date customer) {
		this.customer = customer;
	}

	public Date getIban() {
		return iban;
	}

	public void setIban(Date iban) {
		this.iban = iban;
	}

	public Date getApplication() {
		return application;
	}

	public void setApplication(Date application) {
		this.application = application;
	}

	public Date getSepa_creditor_id() {
		return sepa_creditor_id;
	}

	public void setSepa_creditor_id(Date sepa_creditor_id) {
		this.sepa_creditor_id = sepa_creditor_id;
	}

	public Date getSepa_mandate_id() {
		return sepa_mandate_id;
	}

	public void setSepa_mandate_id(Date sepa_mandate_id) {
		this.sepa_mandate_id = sepa_mandate_id;
	}

	public Date getDummy() {
		return dummy;
	}

	public void setDummy(Date dummy) {
		this.dummy = dummy;
	}
}