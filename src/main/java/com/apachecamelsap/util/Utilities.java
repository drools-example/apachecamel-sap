package com.apachecamelsap.util;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.MissingResourceException;
import java.util.Properties;

import org.hibersap.annotations.Parameter;

/**
 * 
 * @author jugalpatel
 *
 */
public class Utilities implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Properties properties = null;
	
	public static String getProperty(String propertiesFile, String key) throws MissingResourceException {
        String result = null;
        try {
        	if (properties == null)
                properties = new Properties();
        	
            if (properties.getProperty(key) == null)
                properties.load(new FileInputStream(propertiesFile));
            
        } catch (Exception e) {
            properties = null;
            throw new MissingResourceException("ERROR loading property file", propertiesFile, key);
        }
        result = properties.getProperty(key);
        return result;
    }
	
	public static void getPOJOFields() {
		try {
			String fields = "DUN_COUNT,CT_VALID_F,CMLQTY_DAT,COLLECT_NO,SALES_DIST,EXCH_RATE_FI_V,PURCH_NO_C,REFOBJKEY,TELEPHONE,CURR_ISO,REFDOCTYPE,COMPL_DLV,PURCH_NO_S,PO_DAT_S,BILL_SCHED,EXRATE_FI,DATE_TYPE,ORD_REASON,INCOTERMS2,CT_VALID_T,INCOTERMS1,REF_DOC_L_LONG,S_PROC_IND,BUSINESS_PARTNER_NO,QT_VALID_T,INCOTERMS3L,EUTRI_DEAL,REPORTING_FREQ,SHIP_COND,SHIP_TYPE,PO_SUPPLEM,MN_INVOICE,SALES_OFF,PMTGAR_PRO,QT_VALID_F,WBS_ELEM,TREASURY_ACC_SYMBOL,CAMPAIGN,REFDOC_CAT,DUNN_BLOCK,MAST_CONTR,DUN_DATE,COMP_CDE_B,REC_POINT,CANCELLATION_ALLOWED,PRICE_DATE,INCOTERMSV,SEPA_MANDATE_ID,NOTIF_NO,VERSION,CUST_GRP5,PP_SEARCH,REF_1_S,CUST_GRP2,PLDLVSTYP,CUST_GRP1,CUST_GRP4,SD_DOC_CAT,INCOTERMS2L,CUST_GRP3,FKK_CONACCT,DLVSCHDUSE,EXCHG_RATE_V,PRICE_LIST,WAR_DATE,PO_METH_S,PO_METHOD,REF_DOC_L,SERV_DATE,BUSINESS_EVENT_TCODE,ORDCOMB_IN,DOC_TYPE,TAXDEP_CTY,ADD_VAL_DY0,PAYMENT_METHODS,PSM_PSTNG_DATE,DISTR_CHAN,DEPARTM_NO,CREATED_BY,MODIFICATION_ALLOWED,REF_PROC,ACCNT_ASGN,CALC_MOTIVE,DOC_NUM_FI,DOC_CLASS,NAME,BILL_BLOCK,REQ_DATE_H,EXCHG_RATE,SALES_GRP,DUNN_KEY,REFDOC_CAT_LONG,SALES_ORG,REF_1,REF_DOC,REFOBJTYPE,DIVISION,DLV_TIME,ASS_NUMBER,PRICE_GRP,BILL_DATE,PMNTTRMS,CUST_GROUP,PYMT_METH,TAX_CLASS7,CURRENCY,TAX_CLASS6,TAX_CLASS5,CSTCNDGRP4,TAX_CLASS4,CSTCNDGRP5,CSTCNDGRP2,CSTCNDGRP3,H_CURR_ISO,TAX_CLASS9,TAX_CLASS8,CSTCNDGRP1,FIX_VAL_DY,TAXDST_CTY,LINE_TIMEThu Jan 01 00:00:00 IST 1970,ALTTAX_CLS,CHKPRTAUTH,DLV_BLOCK,TAX_CLASS3,SD_DOC_CAT_LONG,TAX_CLASS2,PURCH_DATE,DOC_DATE,H_CURR,INVO_SCHED,";
			
			ArrayList<String> list = new ArrayList<>(Arrays.asList(fields.split(",")));
			list.forEach(flds -> {
				System.out.println("@Parameter(\"" + flds + "\")");
				System.out.println("private String " + flds.toLowerCase() + ";");
				System.out.println();
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getPOJOFields();
	}
}
