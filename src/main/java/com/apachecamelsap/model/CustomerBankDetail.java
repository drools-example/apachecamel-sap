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
public class CustomerBankDetail implements Serializable {

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
	
	@Parameter("PARTNER_BK")
    private Date partner_bk;
	
	@Parameter("COLL_AUTH")
    private Date coll_auth;
	
	@Parameter("BANK_REF")
    private Date bank_ref;

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

	public Date getPartner_bk() {
		return partner_bk;
	}

	public void setPartner_bk(Date partner_bk) {
		this.partner_bk = partner_bk;
	}

	public Date getColl_auth() {
		return coll_auth;
	}

	public void setColl_auth(Date coll_auth) {
		this.coll_auth = coll_auth;
	}

	public Date getBank_ref() {
		return bank_ref;
	}

	public void setBank_ref(Date bank_ref) {
		this.bank_ref = bank_ref;
	}
}