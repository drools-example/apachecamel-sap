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
/**
 *
 * @author jugalpatel
 *
 */
@Bapi("ZSD_BAPI_BILLINGDOC_GETLIST")
@ThrowExceptionOnError
public class InvoiceDetailsBapi implements Serializable {

    private static final long serialVersionUID = 1L;

    @Import
    @Parameter("SIGN")
    private String sign;

    @Import
    @Parameter("OPTION")
    private String option;

    @Import
    @Parameter("REF_DOC_LOW")
    private String refDocLow;

    @Import
    @Parameter("REF_DOC_HIGH")
    private String refDocHigh;

    @Export
    @Parameter(value = BapiConstants.EXPORT_RETURN, type = ParameterType.STRUCTURE)
    private BapiRet2 bapiReturn;

    @Table
	@Parameter("SUCCESS")
	private List<InvoiceDetails> invoicedetails;

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getRefDocLow() {
		return refDocLow;
	}

	public void setRefDocLow(String refDocLow) {
		this.refDocLow = refDocLow;
	}

	public String getRefDocHigh() {
		return refDocHigh;
	}

	public void setRefDocHigh(String refDocHigh) {
		this.refDocHigh = refDocHigh;
	}

	public BapiRet2 getBapiReturn() {
		return bapiReturn;
	}

	public void setBapiReturn(BapiRet2 bapiReturn) {
		this.bapiReturn = bapiReturn;
	}

	public List<InvoiceDetails> getInvoicedetails() {
		return invoicedetails;
	}

	public void setInvoicedetails(List<InvoiceDetails> invoicedetails) {
		this.invoicedetails = invoicedetails;
	}
}
