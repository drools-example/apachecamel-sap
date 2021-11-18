package com.apachecamelsap.model;

import java.io.Serializable;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.ThrowExceptionOnError;

@Bapi("BAPI_CUSTOMER_CREATEFROMDATA1")
@ThrowExceptionOnError
public class CreateCustomerBapi implements Serializable {

	private static final long serialVersionUID = 1L;

	@Import
	@Parameter(value = "PI_COMPANYDATA", type = ParameterType.STRUCTURE)
	private PiCompanyData piCompanyData;
	
	@Import
	@Parameter("PI_CONSUMEREN")
	private String piConsumer;
	
	@Import
	@Parameter(value = "PI_COPYREFERENCE", type = ParameterType.STRUCTURE)
	private PiCopyReference piCopyReference;
	
	@Import
	@Parameter("PI_CREDIT_CONTROL_FLAG")
	private String piCreditControlFlag;
	
	@Import
	@Parameter(value = "PI_OPT_COMPANYDATA", type = ParameterType.STRUCTURE)
	private PiOptCompanyData piOptCompanyData;
	
	@Import
	@Parameter(value = "PI_OPT_PERSONALDATA", type = ParameterType.STRUCTURE)
	private PiOptPersonalData piOptPersonalData;
	
	@Import
	@Parameter(value = "PI_PERSONALDATA", type = ParameterType.STRUCTURE)
	private PiPersonalData piPersonalData;
	
	@Export
	@Parameter(value="CUSTOMERNO")
	private String customerNo;

	public PiCompanyData getPiCompanyData() {
		return piCompanyData;
	}

	public void setPiCompanyData(PiCompanyData piCompanyData) {
		this.piCompanyData = piCompanyData;
	}

	public String getPiConsumer() {
		return piConsumer;
	}

	public void setPiConsumer(String piConsumer) {
		this.piConsumer = piConsumer;
	}

	public PiCopyReference getPiCopyReference() {
		return piCopyReference;
	}

	public void setPiCopyReference(PiCopyReference piCopyReference) {
		this.piCopyReference = piCopyReference;
	}

	public String getPiCreditControlFlag() {
		return piCreditControlFlag;
	}

	public void setPiCreditControlFlag(String piCreditControlFlag) {
		this.piCreditControlFlag = piCreditControlFlag;
	}

	public PiOptCompanyData getPiOptCompanyData() {
		return piOptCompanyData;
	}

	public void setPiOptCompanyData(PiOptCompanyData piOptCompanyData) {
		this.piOptCompanyData = piOptCompanyData;
	}

	public PiOptPersonalData getPiOptPersonalData() {
		return piOptPersonalData;
	}

	public void setPiOptPersonalData(PiOptPersonalData piOptPersonalData) {
		this.piOptPersonalData = piOptPersonalData;
	}

	public PiPersonalData getPiPersonalData() {
		return piPersonalData;
	}

	public void setPiPersonalData(PiPersonalData piPersonalData) {
		this.piPersonalData = piPersonalData;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
}
