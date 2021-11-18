package com.apachecamelsap.model;

import java.io.Serializable;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class Partners implements Serializable {

    private static final long serialVersionUID = 1L;

    @Parameter("MSGFN")
    private String function;

    @Parameter("PARVW")
    private String partnerFn;

    @Parameter("KUNN2")
    private String partnerNo;

    @Parameter("DEFPA")
    private String defaultPartner;

    @Parameter("KNREF")
    private String partnerDesc;

    @Parameter("PARZA")
    private String parza;

    public String getFunction() {
        return function;
    }

    public String getPartnerFn() {
        return partnerFn;
    }

    public String getPartnerNo() {
        return partnerNo;
    }

    public String getDefaultPartner() {
        return defaultPartner;
    }

    public String getPartnerDesc() {
        return partnerDesc;
    }

    public String getParza() {
        return parza;
    }
}
