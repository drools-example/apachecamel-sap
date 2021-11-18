package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.Table;
import org.hibersap.annotations.ThrowExceptionOnError;
import org.hibersap.bapi.BapiRet2;

@Bapi("VELO01_GET_PARTNERS")
public class GetCustomerPartnerBapi implements Serializable {

    private static final long serialVersionUID = 1L;

    @Import
    @Parameter("KUNNR")
    private String customerNo;

    @Import
    @Parameter("SALESORG")
    private String saleOrg;

    @Import
    @Parameter("DISTR_CHAN")
    private String distChannel;

    @Import
    @Parameter("DIVISION")
    private String distDivision;

    @Import
    @Parameter("PARVW")
    private String partnerFn;

    @Export
    @Parameter(value = "PARTNERS")
    private Map exportPartners;

    @Export
    @Parameter(value = "NO_OF_RECORDS")
    private Integer recordsCount;
    
    @Table
    @Parameter("PARTNER_ET")
    private List<CustomerPartners> customerPartners;

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

    public String getDistChannel() {
        return distChannel;
    }

    public void setDistChannel(String distChannel) {
        this.distChannel = distChannel;
    }

    public String getDistDivision() {
        return distDivision;
    }

    public void setDistDivision(String distDivision) {
        this.distDivision = distDivision;
    }

    public String getPartnerFn() {
        return partnerFn;
    }

    public void setPartnerFn(String partnerFn) {
        this.partnerFn = partnerFn;
    }



    public Map getExportPartners() {
        return exportPartners;
    }

    public void setExportPartners(Map exportPartners) {
        this.exportPartners = exportPartners;
    }

    public Integer getrecordsCount() {
        return recordsCount;
    }

    public void setrecordsCount(Integer recordsCount) {
        this.recordsCount = recordsCount;
    }



    public List<CustomerPartners> getCustomerPartners() {
        return customerPartners;
    }

    public void setCustomerPartners(List<CustomerPartners> customerPartners) {
        this.customerPartners = customerPartners;
    }
}
