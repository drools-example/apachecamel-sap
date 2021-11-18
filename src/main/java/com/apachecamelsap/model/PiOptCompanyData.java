package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class PiOptCompanyData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("CONTROL_ACCOUNT")
    private String controlAccount;
	
	@Parameter("TAXJURCODE")
    private String taxJurcode;
	
	@Parameter("DELYG_PLNT")
    private String delygPlnt;
	
	@Parameter("PMNTTRMS")
    private String pmnttrms;
	
	@Parameter("C_CTR_AREA")
    private String cCtrArea;
	
	@Parameter("SHIP_COND")
    private String shipCond;
	
	@Parameter("TRANSPZONE")
    private String transpZone;
	
	@Parameter("PART_DLV")
    private String partDlv;

	public String getControlAccount() {
		return controlAccount;
	}

	public void setControlAccount(String controlAccount) {
		this.controlAccount = controlAccount;
	}

	public String getTaxJurcode() {
		return taxJurcode;
	}

	public void setTaxJurcode(String taxJurcode) {
		this.taxJurcode = taxJurcode;
	}

	public String getDelygPlnt() {
		return delygPlnt;
	}

	public void setDelygPlnt(String delygPlnt) {
		this.delygPlnt = delygPlnt;
	}

	public String getPmnttrms() {
		return pmnttrms;
	}

	public void setPmnttrms(String pmnttrms) {
		this.pmnttrms = pmnttrms;
	}

	public String getcCtrArea() {
		return cCtrArea;
	}

	public void setcCtrArea(String cCtrArea) {
		this.cCtrArea = cCtrArea;
	}

	public String getShipCond() {
		return shipCond;
	}

	public void setShipCond(String shipCond) {
		this.shipCond = shipCond;
	}

	public String getTranspZone() {
		return transpZone;
	}

	public void setTranspZone(String transpZone) {
		this.transpZone = transpZone;
	}

	public String getPartDlv() {
		return partDlv;
	}

	public void setPartDlv(String partDlv) {
		this.partDlv = partDlv;
	}
}
