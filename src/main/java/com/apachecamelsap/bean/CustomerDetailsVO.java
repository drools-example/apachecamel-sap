package com.apachecamelsap.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * @author jugalpatel
 */
public class CustomerDetailsVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String customerNo;

    private String companyCode;

    private Map customerAddress;

    private Map customerGeneralDetail;

    private Map customerCompanyDetail;

    private Map returnData;

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

    public boolean isUserExist() {
        return isUserExist;
    }

    public void setUserExist(boolean userExist) {
        isUserExist = userExist;
    }
}
