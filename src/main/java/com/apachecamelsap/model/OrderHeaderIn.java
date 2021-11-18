package com.apachecamelsap.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class OrderHeaderIn implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Parameter("DUN_COUNT")
	private BigDecimal dun_count;

	@Parameter("CT_VALID_F")
	private String ct_valid_f;

	@Parameter("CMLQTY_DAT")
	private String cmlqty_dat;

	@Parameter("COLLECT_NO")
	private String collect_no;

	@Parameter("SALES_DIST")
	private String sales_dist;

	@Parameter("EXCH_RATE_FI_V")
	private BigDecimal exch_rate_fi_v;

	@Parameter("PURCH_NO_C")
	private String purch_no_c;

	@Parameter("REFOBJKEY")
	private String refobjkey;

	@Parameter("TELEPHONE")
	private String telephone;

	@Parameter("CURR_ISO")
	private String curr_iso;

	@Parameter("REFDOCTYPE")
	private String refdoctype;

	@Parameter("COMPL_DLV")
	private String compl_dlv;

	@Parameter("PURCH_NO_S")
	private String purch_no_s;

	@Parameter("PO_DAT_S")
	private String po_dat_s;

	@Parameter("BILL_SCHED")
	private String bill_sched;

	@Parameter("EXRATE_FI")
	private BigDecimal exrate_fi;

	@Parameter("DATE_TYPE")
	private String date_type;

	@Parameter("ORD_REASON")
	private String ord_reason;

	@Parameter("INCOTERMS2")
	private String incoterms2;

	@Parameter("CT_VALID_T")
	private String ct_valid_t;

	@Parameter("INCOTERMS1")
	private String incoterms1;

	@Parameter("REF_DOC_L_LONG")
	private String ref_doc_l_long;

	@Parameter("S_PROC_IND")
	private String s_proc_ind;

	@Parameter("BUSINESS_PARTNER_NO")
	private String business_partner_no;

	@Parameter("QT_VALID_T")
	private String qt_valid_t;

	@Parameter("INCOTERMS3L")
	private String incoterms3l;

	@Parameter("EUTRI_DEAL")
	private String eutri_deal;

	@Parameter("REPORTING_FREQ")
	private String reporting_freq;

	@Parameter("SHIP_COND")
	private String ship_cond;

	@Parameter("SHIP_TYPE")
	private String ship_type;

	@Parameter("PO_SUPPLEM")
	private String po_supplem;

	@Parameter("MN_INVOICE")
	private String mn_invoice;

	@Parameter("SALES_OFF")
	private String sales_off;

	@Parameter("PMTGAR_PRO")
	private String pmtgar_pro;

	@Parameter("QT_VALID_F")
	private String qt_valid_f;

	@Parameter("WBS_ELEM")
	private String wbs_elem;

	@Parameter("TREASURY_ACC_SYMBOL")
	private String treasury_acc_symbol;

	//@Parameter("CAMPAIGN")
	//private String campaign;

	@Parameter("REFDOC_CAT")
	private String refdoc_cat;

	@Parameter("DUNN_BLOCK")
	private String dunn_block;

	@Parameter("MAST_CONTR")
	private String mast_contr;

	@Parameter("DUN_DATE")
	private String dun_date;

	@Parameter("COMP_CDE_B")
	private String comp_cde_b;

	@Parameter("REC_POINT")
	private String rec_point;

	@Parameter("CANCELLATION_ALLOWED")
	private String cancellation_allowed;

	@Parameter("PRICE_DATE")
	private String price_date;

	@Parameter("INCOTERMSV")
	private String incotermsv;

	@Parameter("SEPA_MANDATE_ID")
	private String sepa_mandate_id;

	@Parameter("NOTIF_NO")
	private String notif_no;

	@Parameter("VERSION")
	private String version;

	@Parameter("CUST_GRP5")
	private String cust_grp5;

	@Parameter("PP_SEARCH")
	private String pp_search;

	@Parameter("REF_1_S")
	private String ref_1_s;

	@Parameter("CUST_GRP2")
	private String cust_grp2;

	@Parameter("PLDLVSTYP")
	private String pldlvstyp;

	@Parameter("CUST_GRP1")
	private String cust_grp1;

	@Parameter("CUST_GRP4")
	private String cust_grp4;

	@Parameter("SD_DOC_CAT")
	private String sd_doc_cat;

	@Parameter("INCOTERMS2L")
	private String incoterms2l;

	@Parameter("CUST_GRP3")
	private String cust_grp3;

	@Parameter("FKK_CONACCT")
	private String fkk_conacct;

	@Parameter("DLVSCHDUSE")
	private String dlvschduse;

	@Parameter("EXCHG_RATE_V")
	private BigDecimal exchg_rate_v;

	@Parameter("PRICE_LIST")
	private String price_list;

	@Parameter("WAR_DATE")
	private String war_date;

	@Parameter("PO_METH_S")
	private String po_meth_s;

	@Parameter("PO_METHOD")
	private String po_method;

	@Parameter("REF_DOC_L")
	private String ref_doc_l;

	@Parameter("SERV_DATE")
	private String serv_date;

	@Parameter("BUSINESS_EVENT_TCODE")
	private String business_event_tcode;

	@Parameter("ORDCOMB_IN")
	private String ordcomb_in;

	@Parameter("DOC_TYPE")
	private String doc_type;

	@Parameter("TAXDEP_CTY")
	private String taxdep_cty;

	@Parameter("ADD_VAL_DY0")
	private String add_val_dy0;

	@Parameter("PAYMENT_METHODS")
	private String payment_methods;

	@Parameter("PSM_PSTNG_DATE")
	private String psm_pstng_date;

	@Parameter("DISTR_CHAN")
	private String distr_chan;

	@Parameter("DEPARTM_NO")
	private String departm_no;

	@Parameter("CREATED_BY")
	private String created_by;

	@Parameter("MODIFICATION_ALLOWED")
	private String modification_allowed;

	@Parameter("REF_PROC")
	private String ref_proc;

	@Parameter("ACCNT_ASGN")
	private String accnt_asgn;

	@Parameter("CALC_MOTIVE")
	private String calc_motive;

	@Parameter("DOC_NUM_FI")
	private String doc_num_fi;

	@Parameter("DOC_CLASS")
	private String doc_class;

	@Parameter("NAME")
	private String name;

	@Parameter("BILL_BLOCK")
	private String bill_block;

	@Parameter("REQ_DATE_H")
	private String req_date_h;

	@Parameter("EXCHG_RATE")
	private BigDecimal exchg_rate;

	@Parameter("SALES_GRP")
	private String sales_grp;

	@Parameter("DUNN_KEY")
	private String dunn_key;

	@Parameter("REFDOC_CAT_LONG")
	private String refdoc_cat_long;

	@Parameter("SALES_ORG")
	private String sales_org;

	@Parameter("REF_1")
	private String ref_1;

	@Parameter("REF_DOC")
	private String ref_doc;

	@Parameter("REFOBJTYPE")
	private String refobjtype;

	@Parameter("DIVISION")
	private String division;

	@Parameter("DLV_TIME")
	private String dlv_time;

	@Parameter("ASS_NUMBER")
	private String ass_number;

	@Parameter("PRICE_GRP")
	private String price_grp;

	@Parameter("BILL_DATE")
	private String bill_date;

	@Parameter("PMNTTRMS")
	private String pmnttrms;

	@Parameter("CUST_GROUP")
	private String cust_group;

	@Parameter("PYMT_METH")
	private String pymt_meth;

	@Parameter("TAX_CLASS7")
	private String tax_class7;

	@Parameter("CURRENCY")
	private String currency;

	@Parameter("TAX_CLASS6")
	private String tax_class6;

	@Parameter("TAX_CLASS5")
	private String tax_class5;

	@Parameter("CSTCNDGRP4")
	private String cstcndgrp4;

	@Parameter("TAX_CLASS4")
	private String tax_class4;

	@Parameter("CSTCNDGRP5")
	private String cstcndgrp5;

	@Parameter("CSTCNDGRP2")
	private String cstcndgrp2;

	@Parameter("CSTCNDGRP3")
	private String cstcndgrp3;

	@Parameter("H_CURR_ISO")
	private String h_curr_iso;

	@Parameter("TAX_CLASS9")
	private String tax_class9;

	@Parameter("TAX_CLASS8")
	private String tax_class8;

	@Parameter("CSTCNDGRP1")
	private String cstcndgrp1;

	@Parameter("FIX_VAL_DY")
	private String fix_val_dy;

	@Parameter("TAXDST_CTY")
	private String taxdst_cty;

	@Parameter("LINE_TIME")
	private Date line_timet;

	@Parameter("ALTTAX_CLS")
	private String alttax_cls;

	@Parameter("CHKPRTAUTH")
	private String chkprtauth;

	@Parameter("DLV_BLOCK")
	private String dlv_block;

	@Parameter("TAX_CLASS3")
	private String tax_class3;

	@Parameter("SD_DOC_CAT_LONG")
	private String sd_doc_cat_long;

	@Parameter("TAX_CLASS2")
	private String tax_class2;

	@Parameter("PURCH_DATE")
	private Date purch_date;

	@Parameter("DOC_DATE")
	private Date doc_date;

	@Parameter("H_CURR")
	private String h_curr;

	@Parameter("INVO_SCHED")
	private String invo_sched;

	public BigDecimal getDun_count() {
		return dun_count;
	}

	public void setDun_count(BigDecimal dun_count) {
		this.dun_count = dun_count;
	}

	public String getCt_valid_f() {
		return ct_valid_f;
	}

	public void setCt_valid_f(String ct_valid_f) {
		this.ct_valid_f = ct_valid_f;
	}

	public String getCmlqty_dat() {
		return cmlqty_dat;
	}

	public void setCmlqty_dat(String cmlqty_dat) {
		this.cmlqty_dat = cmlqty_dat;
	}

	public String getCollect_no() {
		return collect_no;
	}

	public void setCollect_no(String collect_no) {
		this.collect_no = collect_no;
	}

	public String getSales_dist() {
		return sales_dist;
	}

	public void setSales_dist(String sales_dist) {
		this.sales_dist = sales_dist;
	}

	public BigDecimal getExch_rate_fi_v() {
		return exch_rate_fi_v;
	}

	public void setExch_rate_fi_v(BigDecimal exch_rate_fi_v) {
		this.exch_rate_fi_v = exch_rate_fi_v;
	}

	public String getPurch_no_c() {
		return purch_no_c;
	}

	public void setPurch_no_c(String purch_no_c) {
		this.purch_no_c = purch_no_c;
	}

	public String getRefobjkey() {
		return refobjkey;
	}

	public void setRefobjkey(String refobjkey) {
		this.refobjkey = refobjkey;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCurr_iso() {
		return curr_iso;
	}

	public void setCurr_iso(String curr_iso) {
		this.curr_iso = curr_iso;
	}

	public String getRefdoctype() {
		return refdoctype;
	}

	public void setRefdoctype(String refdoctype) {
		this.refdoctype = refdoctype;
	}

	public String getCompl_dlv() {
		return compl_dlv;
	}

	public void setCompl_dlv(String compl_dlv) {
		this.compl_dlv = compl_dlv;
	}

	public String getPurch_no_s() {
		return purch_no_s;
	}

	public void setPurch_no_s(String purch_no_s) {
		this.purch_no_s = purch_no_s;
	}

	public String getPo_dat_s() {
		return po_dat_s;
	}

	public void setPo_dat_s(String po_dat_s) {
		this.po_dat_s = po_dat_s;
	}

	public String getBill_sched() {
		return bill_sched;
	}

	public void setBill_sched(String bill_sched) {
		this.bill_sched = bill_sched;
	}

	public BigDecimal getExrate_fi() {
		return exrate_fi;
	}

	public void setExrate_fi(BigDecimal exrate_fi) {
		this.exrate_fi = exrate_fi;
	}

	public String getDate_type() {
		return date_type;
	}

	public void setDate_type(String date_type) {
		this.date_type = date_type;
	}

	public String getOrd_reason() {
		return ord_reason;
	}

	public void setOrd_reason(String ord_reason) {
		this.ord_reason = ord_reason;
	}

	public String getIncoterms2() {
		return incoterms2;
	}

	public void setIncoterms2(String incoterms2) {
		this.incoterms2 = incoterms2;
	}

	public String getCt_valid_t() {
		return ct_valid_t;
	}

	public void setCt_valid_t(String ct_valid_t) {
		this.ct_valid_t = ct_valid_t;
	}

	public String getIncoterms1() {
		return incoterms1;
	}

	public void setIncoterms1(String incoterms1) {
		this.incoterms1 = incoterms1;
	}

	public String getRef_doc_l_long() {
		return ref_doc_l_long;
	}

	public void setRef_doc_l_long(String ref_doc_l_long) {
		this.ref_doc_l_long = ref_doc_l_long;
	}

	public String getS_proc_ind() {
		return s_proc_ind;
	}

	public void setS_proc_ind(String s_proc_ind) {
		this.s_proc_ind = s_proc_ind;
	}

	public String getBusiness_partner_no() {
		return business_partner_no;
	}

	public void setBusiness_partner_no(String business_partner_no) {
		this.business_partner_no = business_partner_no;
	}

	public String getQt_valid_t() {
		return qt_valid_t;
	}

	public void setQt_valid_t(String qt_valid_t) {
		this.qt_valid_t = qt_valid_t;
	}

	public String getIncoterms3l() {
		return incoterms3l;
	}

	public void setIncoterms3l(String incoterms3l) {
		this.incoterms3l = incoterms3l;
	}

	public String getEutri_deal() {
		return eutri_deal;
	}

	public void setEutri_deal(String eutri_deal) {
		this.eutri_deal = eutri_deal;
	}

	public String getReporting_freq() {
		return reporting_freq;
	}

	public void setReporting_freq(String reporting_freq) {
		this.reporting_freq = reporting_freq;
	}

	public String getShip_cond() {
		return ship_cond;
	}

	public void setShip_cond(String ship_cond) {
		this.ship_cond = ship_cond;
	}

	public String getShip_type() {
		return ship_type;
	}

	public void setShip_type(String ship_type) {
		this.ship_type = ship_type;
	}

	public String getPo_supplem() {
		return po_supplem;
	}

	public void setPo_supplem(String po_supplem) {
		this.po_supplem = po_supplem;
	}

	public String getMn_invoice() {
		return mn_invoice;
	}

	public void setMn_invoice(String mn_invoice) {
		this.mn_invoice = mn_invoice;
	}

	public String getSales_off() {
		return sales_off;
	}

	public void setSales_off(String sales_off) {
		this.sales_off = sales_off;
	}

	public String getPmtgar_pro() {
		return pmtgar_pro;
	}

	public void setPmtgar_pro(String pmtgar_pro) {
		this.pmtgar_pro = pmtgar_pro;
	}

	public String getQt_valid_f() {
		return qt_valid_f;
	}

	public void setQt_valid_f(String qt_valid_f) {
		this.qt_valid_f = qt_valid_f;
	}

	public String getWbs_elem() {
		return wbs_elem;
	}

	public void setWbs_elem(String wbs_elem) {
		this.wbs_elem = wbs_elem;
	}

	public String getTreasury_acc_symbol() {
		return treasury_acc_symbol;
	}

	public void setTreasury_acc_symbol(String treasury_acc_symbol) {
		this.treasury_acc_symbol = treasury_acc_symbol;
	}

	public String getRefdoc_cat() {
		return refdoc_cat;
	}

	public void setRefdoc_cat(String refdoc_cat) {
		this.refdoc_cat = refdoc_cat;
	}

	public String getDunn_block() {
		return dunn_block;
	}

	public void setDunn_block(String dunn_block) {
		this.dunn_block = dunn_block;
	}

	public String getMast_contr() {
		return mast_contr;
	}

	public void setMast_contr(String mast_contr) {
		this.mast_contr = mast_contr;
	}

	public String getDun_date() {
		return dun_date;
	}

	public void setDun_date(String dun_date) {
		this.dun_date = dun_date;
	}

	public String getComp_cde_b() {
		return comp_cde_b;
	}

	public void setComp_cde_b(String comp_cde_b) {
		this.comp_cde_b = comp_cde_b;
	}

	public String getRec_point() {
		return rec_point;
	}

	public void setRec_point(String rec_point) {
		this.rec_point = rec_point;
	}

	public String getCancellation_allowed() {
		return cancellation_allowed;
	}

	public void setCancellation_allowed(String cancellation_allowed) {
		this.cancellation_allowed = cancellation_allowed;
	}

	public String getPrice_date() {
		return price_date;
	}

	public void setPrice_date(String price_date) {
		this.price_date = price_date;
	}

	public String getIncotermsv() {
		return incotermsv;
	}

	public void setIncotermsv(String incotermsv) {
		this.incotermsv = incotermsv;
	}

	public String getSepa_mandate_id() {
		return sepa_mandate_id;
	}

	public void setSepa_mandate_id(String sepa_mandate_id) {
		this.sepa_mandate_id = sepa_mandate_id;
	}

	public String getNotif_no() {
		return notif_no;
	}

	public void setNotif_no(String notif_no) {
		this.notif_no = notif_no;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCust_grp5() {
		return cust_grp5;
	}

	public void setCust_grp5(String cust_grp5) {
		this.cust_grp5 = cust_grp5;
	}

	public String getPp_search() {
		return pp_search;
	}

	public void setPp_search(String pp_search) {
		this.pp_search = pp_search;
	}

	public String getRef_1_s() {
		return ref_1_s;
	}

	public void setRef_1_s(String ref_1_s) {
		this.ref_1_s = ref_1_s;
	}

	public String getCust_grp2() {
		return cust_grp2;
	}

	public void setCust_grp2(String cust_grp2) {
		this.cust_grp2 = cust_grp2;
	}

	public String getPldlvstyp() {
		return pldlvstyp;
	}

	public void setPldlvstyp(String pldlvstyp) {
		this.pldlvstyp = pldlvstyp;
	}

	public String getCust_grp1() {
		return cust_grp1;
	}

	public void setCust_grp1(String cust_grp1) {
		this.cust_grp1 = cust_grp1;
	}

	public String getCust_grp4() {
		return cust_grp4;
	}

	public void setCust_grp4(String cust_grp4) {
		this.cust_grp4 = cust_grp4;
	}

	public String getSd_doc_cat() {
		return sd_doc_cat;
	}

	public void setSd_doc_cat(String sd_doc_cat) {
		this.sd_doc_cat = sd_doc_cat;
	}

	public String getIncoterms2l() {
		return incoterms2l;
	}

	public void setIncoterms2l(String incoterms2l) {
		this.incoterms2l = incoterms2l;
	}

	public String getCust_grp3() {
		return cust_grp3;
	}

	public void setCust_grp3(String cust_grp3) {
		this.cust_grp3 = cust_grp3;
	}

	public String getFkk_conacct() {
		return fkk_conacct;
	}

	public void setFkk_conacct(String fkk_conacct) {
		this.fkk_conacct = fkk_conacct;
	}

	public String getDlvschduse() {
		return dlvschduse;
	}

	public void setDlvschduse(String dlvschduse) {
		this.dlvschduse = dlvschduse;
	}

	public BigDecimal getExchg_rate_v() {
		return exchg_rate_v;
	}

	public void setExchg_rate_v(BigDecimal exchg_rate_v) {
		this.exchg_rate_v = exchg_rate_v;
	}

	public String getPrice_list() {
		return price_list;
	}

	public void setPrice_list(String price_list) {
		this.price_list = price_list;
	}

	public String getWar_date() {
		return war_date;
	}

	public void setWar_date(String war_date) {
		this.war_date = war_date;
	}

	public String getPo_meth_s() {
		return po_meth_s;
	}

	public void setPo_meth_s(String po_meth_s) {
		this.po_meth_s = po_meth_s;
	}

	public String getPo_method() {
		return po_method;
	}

	public void setPo_method(String po_method) {
		this.po_method = po_method;
	}

	public String getRef_doc_l() {
		return ref_doc_l;
	}

	public void setRef_doc_l(String ref_doc_l) {
		this.ref_doc_l = ref_doc_l;
	}

	public String getServ_date() {
		return serv_date;
	}

	public void setServ_date(String serv_date) {
		this.serv_date = serv_date;
	}

	public String getBusiness_event_tcode() {
		return business_event_tcode;
	}

	public void setBusiness_event_tcode(String business_event_tcode) {
		this.business_event_tcode = business_event_tcode;
	}

	public String getOrdcomb_in() {
		return ordcomb_in;
	}

	public void setOrdcomb_in(String ordcomb_in) {
		this.ordcomb_in = ordcomb_in;
	}

	public String getDoc_type() {
		return doc_type;
	}

	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}

	public String getTaxdep_cty() {
		return taxdep_cty;
	}

	public void setTaxdep_cty(String taxdep_cty) {
		this.taxdep_cty = taxdep_cty;
	}

	public String getAdd_val_dy0() {
		return add_val_dy0;
	}

	public void setAdd_val_dy0(String add_val_dy0) {
		this.add_val_dy0 = add_val_dy0;
	}

	public String getPayment_methods() {
		return payment_methods;
	}

	public void setPayment_methods(String payment_methods) {
		this.payment_methods = payment_methods;
	}

	public String getPsm_pstng_date() {
		return psm_pstng_date;
	}

	public void setPsm_pstng_date(String psm_pstng_date) {
		this.psm_pstng_date = psm_pstng_date;
	}

	public String getDistr_chan() {
		return distr_chan;
	}

	public void setDistr_chan(String distr_chan) {
		this.distr_chan = distr_chan;
	}

	public String getDepartm_no() {
		return departm_no;
	}

	public void setDepartm_no(String departm_no) {
		this.departm_no = departm_no;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModification_allowed() {
		return modification_allowed;
	}

	public void setModification_allowed(String modification_allowed) {
		this.modification_allowed = modification_allowed;
	}

	public String getRef_proc() {
		return ref_proc;
	}

	public void setRef_proc(String ref_proc) {
		this.ref_proc = ref_proc;
	}

	public String getAccnt_asgn() {
		return accnt_asgn;
	}

	public void setAccnt_asgn(String accnt_asgn) {
		this.accnt_asgn = accnt_asgn;
	}

	public String getCalc_motive() {
		return calc_motive;
	}

	public void setCalc_motive(String calc_motive) {
		this.calc_motive = calc_motive;
	}

	public String getDoc_num_fi() {
		return doc_num_fi;
	}

	public void setDoc_num_fi(String doc_num_fi) {
		this.doc_num_fi = doc_num_fi;
	}

	public String getDoc_class() {
		return doc_class;
	}

	public void setDoc_class(String doc_class) {
		this.doc_class = doc_class;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBill_block() {
		return bill_block;
	}

	public void setBill_block(String bill_block) {
		this.bill_block = bill_block;
	}

	public String getReq_date_h() {
		return req_date_h;
	}

	public void setReq_date_h(String req_date_h) {
		this.req_date_h = req_date_h;
	}

	public BigDecimal getExchg_rate() {
		return exchg_rate;
	}

	public void setExchg_rate(BigDecimal exchg_rate) {
		this.exchg_rate = exchg_rate;
	}

	public String getSales_grp() {
		return sales_grp;
	}

	public void setSales_grp(String sales_grp) {
		this.sales_grp = sales_grp;
	}

	public String getDunn_key() {
		return dunn_key;
	}

	public void setDunn_key(String dunn_key) {
		this.dunn_key = dunn_key;
	}

	public String getRefdoc_cat_long() {
		return refdoc_cat_long;
	}

	public void setRefdoc_cat_long(String refdoc_cat_long) {
		this.refdoc_cat_long = refdoc_cat_long;
	}

	public String getSales_org() {
		return sales_org;
	}

	public void setSales_org(String sales_org) {
		this.sales_org = sales_org;
	}

	public String getRef_1() {
		return ref_1;
	}

	public void setRef_1(String ref_1) {
		this.ref_1 = ref_1;
	}

	public String getRef_doc() {
		return ref_doc;
	}

	public void setRef_doc(String ref_doc) {
		this.ref_doc = ref_doc;
	}

	public String getRefobjtype() {
		return refobjtype;
	}

	public void setRefobjtype(String refobjtype) {
		this.refobjtype = refobjtype;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDlv_time() {
		return dlv_time;
	}

	public void setDlv_time(String dlv_time) {
		this.dlv_time = dlv_time;
	}

	public String getAss_number() {
		return ass_number;
	}

	public void setAss_number(String ass_number) {
		this.ass_number = ass_number;
	}

	public String getPrice_grp() {
		return price_grp;
	}

	public void setPrice_grp(String price_grp) {
		this.price_grp = price_grp;
	}

	public String getBill_date() {
		return bill_date;
	}

	public void setBill_date(String bill_date) {
		this.bill_date = bill_date;
	}

	public String getPmnttrms() {
		return pmnttrms;
	}

	public void setPmnttrms(String pmnttrms) {
		this.pmnttrms = pmnttrms;
	}

	public String getCust_group() {
		return cust_group;
	}

	public void setCust_group(String cust_group) {
		this.cust_group = cust_group;
	}

	public String getPymt_meth() {
		return pymt_meth;
	}

	public void setPymt_meth(String pymt_meth) {
		this.pymt_meth = pymt_meth;
	}

	public String getTax_class7() {
		return tax_class7;
	}

	public void setTax_class7(String tax_class7) {
		this.tax_class7 = tax_class7;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTax_class6() {
		return tax_class6;
	}

	public void setTax_class6(String tax_class6) {
		this.tax_class6 = tax_class6;
	}

	public String getTax_class5() {
		return tax_class5;
	}

	public void setTax_class5(String tax_class5) {
		this.tax_class5 = tax_class5;
	}

	public String getCstcndgrp4() {
		return cstcndgrp4;
	}

	public void setCstcndgrp4(String cstcndgrp4) {
		this.cstcndgrp4 = cstcndgrp4;
	}

	public String getTax_class4() {
		return tax_class4;
	}

	public void setTax_class4(String tax_class4) {
		this.tax_class4 = tax_class4;
	}

	public String getCstcndgrp5() {
		return cstcndgrp5;
	}

	public void setCstcndgrp5(String cstcndgrp5) {
		this.cstcndgrp5 = cstcndgrp5;
	}

	public String getCstcndgrp2() {
		return cstcndgrp2;
	}

	public void setCstcndgrp2(String cstcndgrp2) {
		this.cstcndgrp2 = cstcndgrp2;
	}

	public String getCstcndgrp3() {
		return cstcndgrp3;
	}

	public void setCstcndgrp3(String cstcndgrp3) {
		this.cstcndgrp3 = cstcndgrp3;
	}

	public String getH_curr_iso() {
		return h_curr_iso;
	}

	public void setH_curr_iso(String h_curr_iso) {
		this.h_curr_iso = h_curr_iso;
	}

	public String getTax_class9() {
		return tax_class9;
	}

	public void setTax_class9(String tax_class9) {
		this.tax_class9 = tax_class9;
	}

	public String getTax_class8() {
		return tax_class8;
	}

	public void setTax_class8(String tax_class8) {
		this.tax_class8 = tax_class8;
	}

	public String getCstcndgrp1() {
		return cstcndgrp1;
	}

	public void setCstcndgrp1(String cstcndgrp1) {
		this.cstcndgrp1 = cstcndgrp1;
	}

	public String getFix_val_dy() {
		return fix_val_dy;
	}

	public void setFix_val_dy(String fix_val_dy) {
		this.fix_val_dy = fix_val_dy;
	}

	public String getTaxdst_cty() {
		return taxdst_cty;
	}

	public void setTaxdst_cty(String taxdst_cty) {
		this.taxdst_cty = taxdst_cty;
	}

	public Date getLine_timet() {
		return line_timet;
	}

	public void setLine_timet(Date line_timet) {
		this.line_timet = line_timet;
	}

	public String getAlttax_cls() {
		return alttax_cls;
	}

	public void setAlttax_cls(String alttax_cls) {
		this.alttax_cls = alttax_cls;
	}

	public String getChkprtauth() {
		return chkprtauth;
	}

	public void setChkprtauth(String chkprtauth) {
		this.chkprtauth = chkprtauth;
	}

	public String getDlv_block() {
		return dlv_block;
	}

	public void setDlv_block(String dlv_block) {
		this.dlv_block = dlv_block;
	}

	public String getTax_class3() {
		return tax_class3;
	}

	public void setTax_class3(String tax_class3) {
		this.tax_class3 = tax_class3;
	}

	public String getSd_doc_cat_long() {
		return sd_doc_cat_long;
	}

	public void setSd_doc_cat_long(String sd_doc_cat_long) {
		this.sd_doc_cat_long = sd_doc_cat_long;
	}

	public String getTax_class2() {
		return tax_class2;
	}

	public void setTax_class2(String tax_class2) {
		this.tax_class2 = tax_class2;
	}

	public Date getPurch_date() {
		return purch_date;
	}

	public void setPurch_date(Date purch_date) {
		this.purch_date = purch_date;
	}

	public Date getDoc_date() {
		return doc_date;
	}

	public void setDoc_date(Date doc_date) {
		this.doc_date = doc_date;
	}

	public String getH_curr() {
		return h_curr;
	}

	public void setH_curr(String h_curr) {
		this.h_curr = h_curr;
	}

	public String getInvo_sched() {
		return invo_sched;
	}

	public void setInvo_sched(String invo_sched) {
		this.invo_sched = invo_sched;
	}
}
