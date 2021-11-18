package com.apachecamelsap.model;

import java.io.Serializable;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class PiCopyReference implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("SALESORG")
    private String salesOrg;
	
	@Parameter("REF_CUSTMR")
    private String refCustmr;

	@Parameter("DIVISION")
    private String division;
	
	@Parameter("DISTR_CHAN")
    private String distrChan;

	public String getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}

	public String getRefCustmr() {
		return refCustmr;
	}

	public void setRefCustmr(String refCustmr) {
		this.refCustmr = refCustmr;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDistrChan() {
		return distrChan;
	}

	public void setDistrChan(String distrChan) {
		this.distrChan = distrChan;
	}
}
