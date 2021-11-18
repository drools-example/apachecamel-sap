package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class DocumentHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("HEADER_TXT")
    private String header_txt;
	
	@Parameter("REF_DOC_NO_LONG")
    private String ref_doc_no_long;
	
	@Parameter("AC_DOC_NO")
    private String ac_doc_no;
	
	@Parameter("BILL_CATEGORY")
    private String bill_category;
	
	@Parameter("ACC_PRINCIPLE")
    private String acc_principle;
	
	@Parameter("PSTNG_DATE")
    private Date pstng_date;
	
	@Parameter("DOC_TYPE")
    private String doc_type;
	
	@Parameter("TRANS_DATE")
    private Date trans_date;
	
	@Parameter("REASON_REV")
    private String reason_rev;
	
	@Parameter("USERNAME")
    private String username;
	
	@Parameter("COMP_CODE")
    private String comp_code;
	
	@Parameter("OBJ_TYPE")
    private String obj_type;
	
	@Parameter("FISC_YEAR")
    private String fisc_year;
	
	@Parameter("ECS_ENV")
    private String ecs_env;
	
	@Parameter("DOC_STATUS")
    private String doc_status;
	
	@Parameter("REF_DOC_NO")
    private String ref_doc_no;
	
	@Parameter("COMPO_ACC")
    private String compo_acc;
	
	@Parameter("OBJ_SYS")
    private String obj_sys;
	
	@Parameter("FIS_PERIOD")
    private String fis_period;
	
	@Parameter("NEG_POSTNG")
    private String neg_postng;
	
	@Parameter("VATDATE")
    private Date vatdate;
	
	@Parameter("BUS_ACT")
    private String bus_act;
	
	@Parameter("OBJ_KEY_INV")
    private String obj_key_inv;
	
	@Parameter("INVOICE_REC_DATE")
    private Date invoice_rec_date;
	
	@Parameter("OBJ_KEY")
    private String obj_key;
	
	@Parameter("PARTIAL_REV")
    private String partial_rev;
	
	@Parameter("OBJ_KEY_R")
    private String obj_key_r;
	
	@Parameter("DOC_DATE")
    private Date doc_date;

	public String getHeader_txt() {
		return header_txt;
	}

	public void setHeader_txt(String header_txt) {
		this.header_txt = header_txt;
	}

	public String getRef_doc_no_long() {
		return ref_doc_no_long;
	}

	public void setRef_doc_no_long(String ref_doc_no_long) {
		this.ref_doc_no_long = ref_doc_no_long;
	}

	public String getAc_doc_no() {
		return ac_doc_no;
	}

	public void setAc_doc_no(String ac_doc_no) {
		this.ac_doc_no = ac_doc_no;
	}

	public String getBill_category() {
		return bill_category;
	}

	public void setBill_category(String bill_category) {
		this.bill_category = bill_category;
	}

	public String getAcc_principle() {
		return acc_principle;
	}

	public void setAcc_principle(String acc_principle) {
		this.acc_principle = acc_principle;
	}

	public Date getPstng_date() {
		return pstng_date;
	}

	public void setPstng_date(Date pstng_date) {
		this.pstng_date = pstng_date;
	}

	public String getDoc_type() {
		return doc_type;
	}

	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}

	public Date getTrans_date() {
		return trans_date;
	}

	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}

	public String getReason_rev() {
		return reason_rev;
	}

	public void setReason_rev(String reason_rev) {
		this.reason_rev = reason_rev;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getComp_code() {
		return comp_code;
	}

	public void setComp_code(String comp_code) {
		this.comp_code = comp_code;
	}

	public String getObj_type() {
		return obj_type;
	}

	public void setObj_type(String obj_type) {
		this.obj_type = obj_type;
	}

	public String getFisc_year() {
		return fisc_year;
	}

	public void setFisc_year(String fisc_year) {
		this.fisc_year = fisc_year;
	}

	public String getEcs_env() {
		return ecs_env;
	}

	public void setEcs_env(String ecs_env) {
		this.ecs_env = ecs_env;
	}

	public String getDoc_status() {
		return doc_status;
	}

	public void setDoc_status(String doc_status) {
		this.doc_status = doc_status;
	}

	public String getRef_doc_no() {
		return ref_doc_no;
	}

	public void setRef_doc_no(String ref_doc_no) {
		this.ref_doc_no = ref_doc_no;
	}

	public String getCompo_acc() {
		return compo_acc;
	}

	public void setCompo_acc(String compo_acc) {
		this.compo_acc = compo_acc;
	}

	public String getObj_sys() {
		return obj_sys;
	}

	public void setObj_sys(String obj_sys) {
		this.obj_sys = obj_sys;
	}

	public String getFis_period() {
		return fis_period;
	}

	public void setFis_period(String fis_period) {
		this.fis_period = fis_period;
	}

	public String getNeg_postng() {
		return neg_postng;
	}

	public void setNeg_postng(String neg_postng) {
		this.neg_postng = neg_postng;
	}

	public Date getVatdate() {
		return vatdate;
	}

	public void setVatdate(Date vatdate) {
		this.vatdate = vatdate;
	}

	public String getBus_act() {
		return bus_act;
	}

	public void setBus_act(String bus_act) {
		this.bus_act = bus_act;
	}

	public String getObj_key_inv() {
		return obj_key_inv;
	}

	public void setObj_key_inv(String obj_key_inv) {
		this.obj_key_inv = obj_key_inv;
	}

	public Date getInvoice_rec_date() {
		return invoice_rec_date;
	}

	public void setInvoice_rec_date(Date invoice_rec_date) {
		this.invoice_rec_date = invoice_rec_date;
	}

	public String getObj_key() {
		return obj_key;
	}

	public void setObj_key(String obj_key) {
		this.obj_key = obj_key;
	}

	public String getPartial_rev() {
		return partial_rev;
	}

	public void setPartial_rev(String partial_rev) {
		this.partial_rev = partial_rev;
	}

	public String getObj_key_r() {
		return obj_key_r;
	}

	public void setObj_key_r(String obj_key_r) {
		this.obj_key_r = obj_key_r;
	}

	public Date getDoc_date() {
		return doc_date;
	}

	public void setDoc_date(Date doc_date) {
		this.doc_date = doc_date;
	}
}
