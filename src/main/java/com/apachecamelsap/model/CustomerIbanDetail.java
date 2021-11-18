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
public class CustomerIbanDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("CUSTOMER")
    private Date customer;
	
	@Parameter("BANK_CTRY")
    private Date bank_ctry;
	
	@Parameter("BANK_KEY")
    private Date bank_key;
	
	@Parameter("BANK_ACCT")
    private Date bank_acct;
	
	@Parameter("CTRL_KEY")
    private Date ctrl_key;
	
	@Parameter("IBAN")
    private Date iban;
	
	@Parameter("VALID_FROM")
    private Date validFrom;
	
	@Parameter("DUMMY")
    private Date dummy;

	public Date getCustomer() {
		return customer;
	}

	public void setCustomer(Date customer) {
		this.customer = customer;
	}

	public Date getBank_ctry() {
		return bank_ctry;
	}

	public void setBank_ctry(Date bank_ctry) {
		this.bank_ctry = bank_ctry;
	}

	public Date getBank_key() {
		return bank_key;
	}

	public void setBank_key(Date bank_key) {
		this.bank_key = bank_key;
	}

	public Date getBank_acct() {
		return bank_acct;
	}

	public void setBank_acct(Date bank_acct) {
		this.bank_acct = bank_acct;
	}

	public Date getCtrl_key() {
		return ctrl_key;
	}

	public void setCtrl_key(Date ctrl_key) {
		this.ctrl_key = ctrl_key;
	}

	public Date getIban() {
		return iban;
	}

	public void setIban(Date iban) {
		this.iban = iban;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getDummy() {
		return dummy;
	}

	public void setDummy(Date dummy) {
		this.dummy = dummy;
	}
}