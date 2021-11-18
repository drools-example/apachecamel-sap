package com.apachecamelsap.model;

import java.io.Serializable;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class ContractHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("FIKEY")
    private String fiKey;
	
	@Parameter("PAYMENT_FORM_REF")
    private String paymentFormRef;
	
	@Parameter("DOC_TYPE_CA")
    private String docTypeCa;
	
	@Parameter("DOC_NO")
    private String docNo;
	
	@Parameter("RES_KEY")
    private String resKey;

	public String getFiKey() {
		return fiKey;
	}

	public void setFiKey(String fiKey) {
		this.fiKey = fiKey;
	}

	public String getPaymentFormRef() {
		return paymentFormRef;
	}

	public void setPaymentFormRef(String paymentFormRef) {
		this.paymentFormRef = paymentFormRef;
	}

	public String getDocTypeCa() {
		return docTypeCa;
	}

	public void setDocTypeCa(String docTypeCa) {
		this.docTypeCa = docTypeCa;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public String getResKey() {
		return resKey;
	}

	public void setResKey(String resKey) {
		this.resKey = resKey;
	}
}
