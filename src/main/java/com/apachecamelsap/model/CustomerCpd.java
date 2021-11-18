package com.apachecamelsap.model;

import java.io.Serializable;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class CustomerCpd implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("TAX_NO_1")
    private String tax_no_1;
	
	@Parameter("INSTR_KEY")
    private String instr_key;
	
	@Parameter("TAX_NO_3")
    private String tax_no_3;
	
	@Parameter("POSTL_CODE")
    private String postl_code;
	
	@Parameter("POBX_PCD")
    private String pobx_pcd;
	
	@Parameter("TAX_NO_2")
    private String tax_no_2;
	
	@Parameter("EQUAL_TAX")
    private String equal_tax;
	
	@Parameter("TAX")
    private String tax;
	
	@Parameter("TAX_NO_4")
    private String tax_no_4;
	
	@Parameter("POBK_CURAC")
    private String pobk_curac;
	
	@Parameter("BANK_NO")
    private String bank_no;
	
	@Parameter("NAME_4")
    private String name_4;
	
	@Parameter("COUNTRY")
    private String country;
	
	@Parameter("SWIFT_CODE")
    private String swift_code;
	
	@Parameter("BANK_CTRY")
    private String bank_ctry;
	
	@Parameter("DME_IND")
    private String dme_ind;
	
	@Parameter("PO_BOX")
    private String po_box;
	
	@Parameter("IBAN")
    private String iban;
	
	@Parameter("LANGU_ISO")
    private String langu_iso;
	
	@Parameter("CTRL_KEY")
    private String ctrl_key;
	
	@Parameter("STREET")
    private String street;
	
	@Parameter("NAME_2")
    private String name_2;
	
	@Parameter("NAME_3")
    private String name_3;
	
	@Parameter("NAME")
    private String name;
	
	@Parameter("REGION")
    private String region;
	
	@Parameter("CITY")
    private String city;
	
	@Parameter("BANK_CTRY_ISO")
    private String bank_ctry_iso;
	
	@Parameter("COUNTRY_ISO")
    private String country_iso;
	
	@Parameter("TITLE")
    private String title;
	
	@Parameter("BANK_ACCT")
    private String bank_acct;

	public String getTax_no_1() {
		return tax_no_1;
	}

	public void setTax_no_1(String tax_no_1) {
		this.tax_no_1 = tax_no_1;
	}

	public String getInstr_key() {
		return instr_key;
	}

	public void setInstr_key(String instr_key) {
		this.instr_key = instr_key;
	}

	public String getTax_no_3() {
		return tax_no_3;
	}

	public void setTax_no_3(String tax_no_3) {
		this.tax_no_3 = tax_no_3;
	}

	public String getPostl_code() {
		return postl_code;
	}

	public void setPostl_code(String postl_code) {
		this.postl_code = postl_code;
	}

	public String getPobx_pcd() {
		return pobx_pcd;
	}

	public void setPobx_pcd(String pobx_pcd) {
		this.pobx_pcd = pobx_pcd;
	}

	public String getTax_no_2() {
		return tax_no_2;
	}

	public void setTax_no_2(String tax_no_2) {
		this.tax_no_2 = tax_no_2;
	}

	public String getEqual_tax() {
		return equal_tax;
	}

	public void setEqual_tax(String equal_tax) {
		this.equal_tax = equal_tax;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getTax_no_4() {
		return tax_no_4;
	}

	public void setTax_no_4(String tax_no_4) {
		this.tax_no_4 = tax_no_4;
	}

	public String getPobk_curac() {
		return pobk_curac;
	}

	public void setPobk_curac(String pobk_curac) {
		this.pobk_curac = pobk_curac;
	}

	public String getBank_no() {
		return bank_no;
	}

	public void setBank_no(String bank_no) {
		this.bank_no = bank_no;
	}

	public String getName_4() {
		return name_4;
	}

	public void setName_4(String name_4) {
		this.name_4 = name_4;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSwift_code() {
		return swift_code;
	}

	public void setSwift_code(String swift_code) {
		this.swift_code = swift_code;
	}

	public String getBank_ctry() {
		return bank_ctry;
	}

	public void setBank_ctry(String bank_ctry) {
		this.bank_ctry = bank_ctry;
	}

	public String getDme_ind() {
		return dme_ind;
	}

	public void setDme_ind(String dme_ind) {
		this.dme_ind = dme_ind;
	}

	public String getPo_box() {
		return po_box;
	}

	public void setPo_box(String po_box) {
		this.po_box = po_box;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getLangu_iso() {
		return langu_iso;
	}

	public void setLangu_iso(String langu_iso) {
		this.langu_iso = langu_iso;
	}

	public String getCtrl_key() {
		return ctrl_key;
	}

	public void setCtrl_key(String ctrl_key) {
		this.ctrl_key = ctrl_key;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getName_2() {
		return name_2;
	}

	public void setName_2(String name_2) {
		this.name_2 = name_2;
	}

	public String getName_3() {
		return name_3;
	}

	public void setName_3(String name_3) {
		this.name_3 = name_3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBank_ctry_iso() {
		return bank_ctry_iso;
	}

	public void setBank_ctry_iso(String bank_ctry_iso) {
		this.bank_ctry_iso = bank_ctry_iso;
	}

	public String getCountry_iso() {
		return country_iso;
	}

	public void setCountry_iso(String country_iso) {
		this.country_iso = country_iso;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBank_acct() {
		return bank_acct;
	}

	public void setBank_acct(String bank_acct) {
		this.bank_acct = bank_acct;
	}
}
