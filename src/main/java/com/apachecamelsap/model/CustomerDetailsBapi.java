package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
	private HashMap<String,Object> customerAddress;
	
	@Export
	@Parameter(value="CUSTOMERGENERALDETAIL")
	private HashMap<String,Object> customerGeneralDetail;
	
	@Export
	@Parameter(value="CUSTOMERCOMPANYDETAIL")
	private HashMap<String,Object> customerCompanyDetail;
	
	@Export
	@Parameter(value="RETURN")
	private HashMap<String,Object> returnData;
	
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

	public HashMap<String, Object> getReturnData() {
		return returnData;
	}

	public void setReturnData(HashMap<String, Object> returnData) {
		this.returnData = returnData;
	}

	public HashMap<String, Object> getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(HashMap<String, Object> customerAddress) {
		this.customerAddress = customerAddress;
	}

	public HashMap<String, Object> getCustomerGeneralDetail() {
		return customerGeneralDetail;
	}

	public void setCustomerGeneralDetail(HashMap<String, Object> customerGeneralDetail) {
		this.customerGeneralDetail = customerGeneralDetail;
	}

	public HashMap<String, Object> getCustomerCompanyDetail() {
		return customerCompanyDetail;
	}

	public void setCustomerCompanyDetail(HashMap<String, Object> customerCompanyDetail) {
		this.customerCompanyDetail = customerCompanyDetail;
	}
}
