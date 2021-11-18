package com.apachecamelsap.model;

import java.io.Serializable;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
/**
 *
 * @author jugalpatel
 *
 */
@BapiStructure
public class CustomerPartners implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("PARVW")
    private String partnerType;

	public String getPartnerType() {
		return partnerType;
	}
}
