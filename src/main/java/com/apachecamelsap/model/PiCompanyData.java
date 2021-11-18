package com.apachecamelsap.model;

import java.io.Serializable;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class PiCompanyData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("TEL1_NUMBR")
    private String tel1Number;
	
	@Parameter("CITY_NO")
    private String cityNo;
	
	@Parameter("DISTRICT")
    private String district;
	
	@Parameter("NAME_4")
    private String name4;
	
	@Parameter("FLOOR")
    private String floor;
	
	@Parameter("BUILDING")
    private String building;
	
	@Parameter("COUNTRY")
    private String country;
	
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
	
	@Parameter("POSTL_COD3")
    private String postlCod3;
	
	@Parameter("TEL1_EXT")
    private String tel1Ext;
	
	@Parameter("LANGU_ISO")
    private String languIso;
	
	@Parameter("LANGU")
    private String langu;
	
	@Parameter("CURRENCY_ISO")
    private String currencyIso;
	
	@Parameter("STREET")
    private String street;
	
	@Parameter("COUNTRYISO")
    private String countryIso;
	
	@Parameter("NAME_2")
    private String name2;
	
	@Parameter("E_MAIL")
    private String email;
	
	@Parameter("NAME_3")
    private String name3;
	
	@Parameter("ROOM_NO")
    private String roomNo;
	
	@Parameter("NAME")
    private String name;
	
	@Parameter("REGION")
    private String region;
	
	@Parameter("FAX_NUMBER")
    private String faxNumber;
	
	@Parameter("CITY")
    private String city;
	
	@Parameter("DELIV_DIS")
    private String delivDis;
	
	@Parameter("C_O_NAME")
    private String coName;
	
	@Parameter("HOUSE_NO")
    private String houseNo;

	public String getTel1Number() {
		return tel1Number;
	}

	public void setTel1Number(String tel1Number) {
		this.tel1Number = tel1Number;
	}

	public String getCityNo() {
		return cityNo;
	}

	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
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

	public String getPostlCod3() {
		return postlCod3;
	}

	public void setPostlCod3(String postlCod3) {
		this.postlCod3 = postlCod3;
	}

	public String getTel1Ext() {
		return tel1Ext;
	}

	public void setTel1Ext(String tel1Ext) {
		this.tel1Ext = tel1Ext;
	}

	public String getLanguIso() {
		return languIso;
	}

	public void setLanguIso(String languIso) {
		this.languIso = languIso;
	}

	public String getLangu() {
		return langu;
	}

	public void setLangu(String langu) {
		this.langu = langu;
	}

	public String getCurrencyIso() {
		return currencyIso;
	}

	public void setCurrencyIso(String currencyIso) {
		this.currencyIso = currencyIso;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountryIso() {
		return countryIso;
	}

	public void setCountryIso(String countryIso) {
		this.countryIso = countryIso;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
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

	public String getDelivDis() {
		return delivDis;
	}

	public void setDelivDis(String delivDis) {
		this.delivDis = delivDis;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
}
