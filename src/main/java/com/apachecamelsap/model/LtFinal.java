package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
/**
 * 
 * @author jugalpatel
 *
 */
@BapiStructure
public class LtFinal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("DOC_DATE")
    private Date docDate;

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}
}
