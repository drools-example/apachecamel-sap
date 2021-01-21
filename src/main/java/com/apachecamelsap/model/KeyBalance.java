package com.apachecamelsap.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
/**
 * 
 * @author jugalpatel
 *
 */
@BapiStructure
public class KeyBalance implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("CURRENCY")
    private String currency;
	
	@Parameter("T_CURR_BAL")
    private BigDecimal tCurrBal;
	
	@Parameter("LOC_CURRCY")
    private String locCurrcy;
	
	@Parameter("SP_GL_IND")
    private String spGlInd;
	
	@Parameter("LC_BAL")
    private BigDecimal lcBal;
	
	@Parameter("DB_CR_IND")
    private String dbCrInd;

	public String getCurrency() {
		return currency;
	}

	public BigDecimal gettCurrBal() {
		return tCurrBal;
	}

	public String getLocCurrcy() {
		return locCurrcy;
	}

	public String getSpGlInd() {
		return spGlInd;
	}

	public BigDecimal getLcBal() {
		return lcBal;
	}

	public String getDbCrInd() {
		return dbCrInd;
	}
}
