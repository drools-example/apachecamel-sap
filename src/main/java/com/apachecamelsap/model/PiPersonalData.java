package com.apachecamelsap.model;

import java.io.Serializable;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class PiPersonalData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("SECONDNAME")
    private String secondName;
	
	@Parameter("LANGU_P")
    private String languP;
	
	@Parameter("FIRSTNAME")
    private String firstName;
	
	@Parameter("DISTRICT")
    private String district;
	
	@Parameter("FLOOR")
    private String floor;
	
	@Parameter("MIDDLENAME")
    private String middleName;
	
	@Parameter("BUILDING")
    private String building;
	
	@Parameter("COUNTRY")
    private String country;
	
	@Parameter("LASTNAME")
    private String lastName;
	
	@Parameter("PO_BOX_CIT")
    private String poBoxCit;
	
	@Parameter("CURRENCY")
    private String currency;
	
	@Parameter("FAX_EXTENS")
    private String faxExtens;
	
	@Parameter("PO_BOX")
    private String poBox;
	
	@Parameter("POSTL_COD2")
    private String postlCod2;
	
	@Parameter("POSTL_COD1")
    private String postlCod1;
	
	@Parameter("TITLE_KEY")
    private String titleKey;
	
	@Parameter("TEL1_EXT")
    private String tel1Ext;
	
	@Parameter("TITLE_P")
    private String titleP;
	
	@Parameter("CURRENCY_ISO")
    private String currencyIso;
	
	@Parameter("STREET")
    private String stret;
	
	@Parameter("COUNTRYISO")
    private String countryIso;
	
	@Parameter("E_MAIL")
    private String eMail;
	
	@Parameter("LANGUP_ISO")
    private String langupIso;
	
	@Parameter("ROOM_NO")
    private String roomNo;
	
	@Parameter("REGION")
    private String region;
	
	@Parameter("FAX_NUMBER")
    private String faxNumber;
	
	@Parameter("CITY")
    private String city;
	
	@Parameter("ONLY_CHANGE_COMADDRESS")
    private String onlyChangeComaddress;
	
	@Parameter("DATE_BIRTH")
    private Date dateBirth;
	
	@Parameter("HOUSE_NO")
    private String houseNo;

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLanguP() {
		return languP;
	}

	public void setLanguP(String languP) {
		this.languP = languP;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPoBoxCit() {
		return poBoxCit;
	}

	public void setPoBoxCit(String poBoxCit) {
		this.poBoxCit = poBoxCit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFaxExtens() {
		return faxExtens;
	}

	public void setFaxExtens(String faxExtens) {
		this.faxExtens = faxExtens;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getPostlCod2() {
		return postlCod2;
	}

	public void setPostlCod2(String postlCod2) {
		this.postlCod2 = postlCod2;
	}

	public String getPostlCod1() {
		return postlCod1;
	}

	public void setPostlCod1(String postlCod1) {
		this.postlCod1 = postlCod1;
	}

	public String getTitleKey() {
		return titleKey;
	}

	public void setTitleKey(String titleKey) {
		this.titleKey = titleKey;
	}

	public String getTel1Ext() {
		return tel1Ext;
	}

	public void setTel1Ext(String tel1Ext) {
		this.tel1Ext = tel1Ext;
	}

	public String getTitleP() {
		return titleP;
	}

	public void setTitleP(String titleP) {
		this.titleP = titleP;
	}

	public String getCurrencyIso() {
		return currencyIso;
	}

	public void setCurrencyIso(String currencyIso) {
		this.currencyIso = currencyIso;
	}

	public String getStret() {
		return stret;
	}

	public void setStret(String stret) {
		this.stret = stret;
	}

	public String getCountryIso() {
		return countryIso;
	}

	public void setCountryIso(String countryIso) {
		this.countryIso = countryIso;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getLangupIso() {
		return langupIso;
	}

	public void setLangupIso(String langupIso) {
		this.langupIso = langupIso;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOnlyChangeComaddress() {
		return onlyChangeComaddress;
	}

	public void setOnlyChangeComaddress(String onlyChangeComaddress) {
		this.onlyChangeComaddress = onlyChangeComaddress;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
}
