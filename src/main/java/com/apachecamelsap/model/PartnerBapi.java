package com.apachecamelsap.model;

import java.io.Serializable;
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

@Bapi("CUSTOMER_PARTNERFS_GET")
public class PartnerBapi implements Serializable {

    private static final long serialVersionUID = 1L;

    @Import
    @Parameter("IV_KUNNR")
    private String customerNo;

    @Import
    @Parameter("IV_VKORG")
    private String saleOrg;

    @Import
    @Parameter("IV_VTWEG")
    private String channel;

    @Import
    @Parameter("IV_SPART")
    private String division;
    
    @Table
    @Parameter("ET_E1KNVPM")
    private List<Partners> partners;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getSaleOrg() {
        return saleOrg;
    }

    public void setSaleOrg(String saleOrg) {
        this.saleOrg = saleOrg;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<Partners> getPartners() {
        return partners;
    }

    public void setPartners(List<Partners> partners) {
        this.partners = partners;
    }
}
