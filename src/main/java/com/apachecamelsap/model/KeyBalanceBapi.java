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
import org.hibersap.bapi.BapiConstants;
import org.hibersap.bapi.BapiRet2;
/**
 * 
 * @author jugalpatel
 *
 */
@Bapi("BAPI_AR_ACC_GETKEYDATEBALANCE")
@ThrowExceptionOnError
public class KeyBalanceBapi implements Serializable {

    private static final long serialVersionUID = 1L;

    @Import
    @Parameter("COMPANYCODE")
    private String companyCode;

    @Import
    @Parameter("CUSTOMER")
    private String customer;

    @Import
    @Parameter("KEYDATE")
    private Date keydate;

    @Import
    @Parameter("BALANCESPGLI")
    private String balance;

    @Import
    @Parameter("NOTEDITEMS")
    private String notedItems;

    @Export
    @Parameter(value = BapiConstants.EXPORT_RETURN, type = ParameterType.STRUCTURE)
    private BapiRet2 bapiReturn;
    
    @Table
	@Parameter("KEYBALANCE")
	private List<KeyBalance> keybalance;

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Date getKeydate() {
		return keydate;
	}

	public void setKeydate(Date keydate) {
		this.keydate = keydate;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getNotedItems() {
		return notedItems;
	}

	public void setNotedItems(String notedItems) {
		this.notedItems = notedItems;
	}

	public BapiRet2 getBapiReturn() {
		return bapiReturn;
	}

	public void setBapiReturn(BapiRet2 bapiReturn) {
		this.bapiReturn = bapiReturn;
	}

	public List<KeyBalance> getKeybalance() {
		return keybalance;
	}

	public void setKeybalance(List<KeyBalance> keybalance) {
		this.keybalance = keybalance;
	}
}
