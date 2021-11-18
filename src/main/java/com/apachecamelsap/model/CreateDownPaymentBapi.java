package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.List;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.Table;
import org.hibersap.bapi.BapiConstants;
import org.hibersap.bapi.BapiRet2;

@Bapi("BAPI_ACC_DOCUMENT_POST")
//@ThrowExceptionOnError
public class CreateDownPaymentBapi implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Import
	@Parameter(value = "CONTRACTHEADER", type = ParameterType.STRUCTURE)
	private ContractHeader contractHeader;
	
	@Import
	@Parameter(value = "DOCUMENTHEADER", type = ParameterType.STRUCTURE)
	private DocumentHeader documentHeader;
	
	@Import
	@Parameter(value = "CUSTOMERCPD", type = ParameterType.STRUCTURE)
	private CustomerCpd customerCpd;
	
	@Export
	@Parameter(value="OBJ_TYPE")
	private String objType;
	
	@Export
	@Parameter(value="OBJ_KEY")
	private String objKey;
	
	@Export
	@Parameter(value="OBJ_SYS")
	private String objSys;
	
	@Export
    @Parameter(value = BapiConstants.EXPORT_RETURN, type = ParameterType.STRUCTURE)
    private BapiRet2 bapiReturn;
	
	@Table
	@Parameter("CRITERIA")
	private List<Object> criteria;
	
	@Table
	@Parameter("EXTENSION1")
	private List<Object> extension1;
	
	@Table
	@Parameter("ACCOUNTGL")
	private List<Object> accountgl;
	
	@Table
	@Parameter("EXTENSION2")
	private List<Object> extension2;
	
	@Table
	@Parameter("CURRENCYAMOUNT")
	private List<Object> currencyAmount;
	
	@Table
	@Parameter("ACCOUNTRECEIVABLE")
	private List<Object> accountReceivable;
	
	@Table
	@Parameter("ACCOUNTTAX")
	private List<Object> accountTax;
	
	@Table
	@Parameter("CONTRACTITEM")
	private List<Object> contractItem;
	
	@Table
	@Parameter("ACCOUNTPAYABLE")
	private List<Object> accountPayable;
	
	@Table
	@Parameter("ACCOUNTWT")
	private List<Object> accountWt;
	
	@Table
	@Parameter("VALUEFIELD")
	private List<Object> valueField;
	
	@Table
	@Parameter("PAYMENTCARD")
	private List<Object> paymentCard;
	
	@Table
	@Parameter("REALESTATE")
	private List<Object> realestate;

	public ContractHeader getContractHeader() {
		return contractHeader;
	}

	public void setContractHeader(ContractHeader contractHeader) {
		this.contractHeader = contractHeader;
	}

	public DocumentHeader getDocumentHeader() {
		return documentHeader;
	}

	public void setDocumentHeader(DocumentHeader documentHeader) {
		this.documentHeader = documentHeader;
	}

	public CustomerCpd getCustomerCpd() {
		return customerCpd;
	}

	public void setCustomerCpd(CustomerCpd customerCpd) {
		this.customerCpd = customerCpd;
	}

	public String getObjType() {
		return objType;
	}

	public void setObjType(String objType) {
		this.objType = objType;
	}

	public String getObjKey() {
		return objKey;
	}

	public void setObjKey(String objKey) {
		this.objKey = objKey;
	}

	public String getObjSys() {
		return objSys;
	}

	public void setObjSys(String objSys) {
		this.objSys = objSys;
	}

	public BapiRet2 getBapiReturn() {
		return bapiReturn;
	}

	public void setBapiReturn(BapiRet2 bapiReturn) {
		this.bapiReturn = bapiReturn;
	}

	public List<Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(List<Object> criteria) {
		this.criteria = criteria;
	}

	public List<Object> getExtension1() {
		return extension1;
	}

	public void setExtension1(List<Object> extension1) {
		this.extension1 = extension1;
	}

	public List<Object> getAccountgl() {
		return accountgl;
	}

	public void setAccountgl(List<Object> accountgl) {
		this.accountgl = accountgl;
	}

	public List<Object> getExtension2() {
		return extension2;
	}

	public void setExtension2(List<Object> extension2) {
		this.extension2 = extension2;
	}

	public List<Object> getCurrencyAmount() {
		return currencyAmount;
	}

	public void setCurrencyAmount(List<Object> currencyAmount) {
		this.currencyAmount = currencyAmount;
	}

	public List<Object> getAccountReceivable() {
		return accountReceivable;
	}

	public void setAccountReceivable(List<Object> accountReceivable) {
		this.accountReceivable = accountReceivable;
	}

	public List<Object> getAccountTax() {
		return accountTax;
	}

	public void setAccountTax(List<Object> accountTax) {
		this.accountTax = accountTax;
	}

	public List<Object> getContractItem() {
		return contractItem;
	}

	public void setContractItem(List<Object> contractItem) {
		this.contractItem = contractItem;
	}

	public List<Object> getAccountPayable() {
		return accountPayable;
	}

	public void setAccountPayable(List<Object> accountPayable) {
		this.accountPayable = accountPayable;
	}

	public List<Object> getAccountWt() {
		return accountWt;
	}

	public void setAccountWt(List<Object> accountWt) {
		this.accountWt = accountWt;
	}

	public List<Object> getValueField() {
		return valueField;
	}

	public void setValueField(List<Object> valueField) {
		this.valueField = valueField;
	}

	public List<Object> getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(List<Object> paymentCard) {
		this.paymentCard = paymentCard;
	}

	public List<Object> getRealestate() {
		return realestate;
	}

	public void setRealestate(List<Object> realestate) {
		this.realestate = realestate;
	}
}
