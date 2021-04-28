package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.Table;
import org.hibersap.annotations.ThrowExceptionOnError;
import org.hibersap.bapi.BapiRet2;
/**
 * 
 * @author jugalpatel
 *
 */
@Bapi("BAPI_CUSTOMER_GETDETAIL2")
@ThrowExceptionOnError
public class CustomerDetailsBapi implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Import
	@Parameter("CUSTOMERNO")
	private String customerNo;
	
	@Import
	@Parameter("COMPANYCODE")
	private String companyCode;
	
	@Export
	@Parameter(value="CUSTOMERADDRESS")
	private Map customerAddress;
	
	@Export
	@Parameter(value="CUSTOMERGENERALDETAIL")
	private Map customerGeneralDetail;
	
	@Export
	@Parameter(value="CUSTOMERCOMPANYDETAIL")
	private Map customerCompanyDetail;
	
	@Export
	@Parameter(value="RETURN")
	private Map returnData;
	
	@Table
	@Parameter("CUSTOMERBANKDETAIL")
	private List<CustomerBankDetail> customerBankDetail;
	
	@Table
	@Parameter("CUSTOMERIBANDETAIL")
	private List<CustomerIbanDetail> customerIbanDetail;
	
	@Table
	@Parameter("CUSTOMERSEPADETAIL")
	private List<CustomerSepaDetail> customerSepaDetail;

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Map getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Map customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Map getCustomerGeneralDetail() {
		return customerGeneralDetail;
	}

	public void setCustomerGeneralDetail(Map customerGeneralDetail) {
		this.customerGeneralDetail = customerGeneralDetail;
	}

	public Map getCustomerCompanyDetail() {
		return customerCompanyDetail;
	}

	public void setCustomerCompanyDetail(Map customerCompanyDetail) {
		this.customerCompanyDetail = customerCompanyDetail;
	}


	public Map getReturnData() {
		return returnData;
	}

	public void setReturnData(Map returnData) {
		this.returnData = returnData;
	}

	public List<CustomerBankDetail> getCustomerBankDetail() {
		return customerBankDetail;
	}

	public void setCustomerBankDetail(List<CustomerBankDetail> customerBankDetail) {
		this.customerBankDetail = customerBankDetail;
	}

	public List<CustomerIbanDetail> getCustomerIbanDetail() {
		return customerIbanDetail;
	}

	public void setCustomerIbanDetail(List<CustomerIbanDetail> customerIbanDetail) {
		this.customerIbanDetail = customerIbanDetail;
	}

	public List<CustomerSepaDetail> getCustomerSepaDetail() {
		return customerSepaDetail;
	}

	public void setCustomerSepaDetail(List<CustomerSepaDetail> customerSepaDetail) {
		this.customerSepaDetail = customerSepaDetail;
	}
}
