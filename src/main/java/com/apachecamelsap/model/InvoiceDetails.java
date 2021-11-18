package com.apachecamelsap.model;

import java.io.Serializable;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class InvoiceDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("REF_DOC")
    private String refDoc;

    @Parameter("BILL_DOC")
    private String billDoc;


	public String getRefDoc() {
		return refDoc;
	}

	public String getBillDoc() {
		return billDoc;
	}
}
