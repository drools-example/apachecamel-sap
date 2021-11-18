package com.apachecamelsap.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jugalpatel
 *
 */
public class CustomerDetailsVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String customerNo;
	
	private String companyCode;
    
	private HashMap<String, Object> customerAddress;

    private HashMap<String, Object> customerGeneralDetail;

    private HashMap<String, Object> customerCompanyDetail;

    private HashMap<String, Object> returnData;

    private boolean isUserExist;

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
	
    public HashMap<String, Object> getCustomerAddress() {
        return customerAddress;
    }

    public boolean isUserExist() {
        return isUserExist;
    }

    public void setUserExist(boolean userExist) {
        isUserExist = userExist;
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

	public HashMap<String, Object> getReturnData() {
		return returnData;
	}

	public void setReturnData(HashMap<String, Object> returnData) {
		this.returnData = returnData;
	}

	public void setCustomerAddress(HashMap<String, Object> customerAddress) {
		this.customerAddress = customerAddress;
	}
}
