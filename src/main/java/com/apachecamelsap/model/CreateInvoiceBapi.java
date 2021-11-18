package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.List;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.Table;

@Bapi("BAPI_BILLINGDOC_CREATEMULTIPLE")
//@ThrowExceptionOnError
public class CreateInvoiceBapi implements Serializable {

	private static final long serialVersionUID = 1L;

	@Import
	@Parameter(value = "CREATORDATAIN", type = ParameterType.STRUCTURE)
	private CreatorDataIn creatorDataIn;
	
	@Import
	@Parameter(value = "POSTING")
	private String posting;
	
	@Import
	@Parameter(value = "TESTRUN")
	private String testrun;
	
	@Table
	@Parameter("BILLINGDATAIN")
	private List<Object> billingDataIn;
	
	@Table
	@Parameter("SUCCESS")
	private List<Object> success;
	
	@Table
	@Parameter("RETURN")
	private List<Object> returnErrors;

	public CreatorDataIn getCreatorDataIn() {
		return creatorDataIn;
	}

	public void setCreatorDataIn(CreatorDataIn creatorDataIn) {
		this.creatorDataIn = creatorDataIn;
	}

	public String getPosting() {
		return posting;
	}

	public void setPosting(String posting) {
		this.posting = posting;
	}

	public String getTestrun() {
		return testrun;
	}

	public void setTestrun(String testrun) {
		this.testrun = testrun;
	}

	public List<Object> getBillingDataIn() {
		return billingDataIn;
	}

	public void setBillingDataIn(List<Object> billingDataIn) {
		this.billingDataIn = billingDataIn;
	}

	public List<Object> getSuccess() {
		return success;
	}

	public void setSuccess(List<Object> success) {
		this.success = success;
	}

	public List<Object> getReturnErrors() {
		return returnErrors;
	}

	public void setReturnErrors(List<Object> returnErrors) {
		this.returnErrors = returnErrors;
	}
	
}
