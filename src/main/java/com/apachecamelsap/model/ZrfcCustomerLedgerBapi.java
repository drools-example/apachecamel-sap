package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.List;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.Table;
import org.hibersap.annotations.ThrowExceptionOnError;
/**
 * 
 * @author jugalpatel
 *
 */
@Bapi("ZRFC_CUSTOMER_LEDGER")
@ThrowExceptionOnError
public class ZrfcCustomerLedgerBapi implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Import
	@Parameter("I1")
	private String I1;
	
	@Table
	@Parameter(value = "BUKRS", type = ParameterType.TABLE_STRUCTURE)
	private List<Bukrs> bukrs;
	
	@Table
	@Parameter(value = "G_BUDAT", type = ParameterType.TABLE_STRUCTURE)
	private List<Gbudat> g_budat;
	
	@Table
	@Parameter(value = "KUNNR", type = ParameterType.TABLE_STRUCTURE)
	private List<Kunnr> kunnr;
	
	@Table
	@Parameter(value = "LT_FINAL", type = ParameterType.TABLE_STRUCTURE)
	private List<LtFinal> lt_final;

	public String getI1() {
		return I1;
	}

	public void setI1(String i1) {
		I1 = i1;
	}

	public List<Bukrs> getBukrs() {
		return bukrs;
	}

	public void setBukrs(List<Bukrs> bukrs) {
		this.bukrs = bukrs;
	}

	public List<Gbudat> getG_budat() {
		return g_budat;
	}

	public void setG_budat(List<Gbudat> g_budat) {
		this.g_budat = g_budat;
	}

	public List<Kunnr> getKunnr() {
		return kunnr;
	}

	public void setKunnr(List<Kunnr> kunnr) {
		this.kunnr = kunnr;
	}

	public List<LtFinal> getLt_final() {
		return lt_final;
	}

	public void setLt_final(List<LtFinal> lt_final) {
		this.lt_final = lt_final;
	}
}
