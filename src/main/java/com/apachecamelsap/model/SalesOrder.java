package com.apachecamelsap.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
/**
 * 
 * @author jugalpatel
 *
 */
@BapiStructure
public class SalesOrder implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("PURCH_NO")
    private String purchNo;
	
	@Parameter("NET_VALUE")
    private BigDecimal netValue;
	
	@Parameter("CREATION_TIME")
    private Date creationTime;
	
	@Parameter("SOLD_TO")
    private String soldTo;
	
	@Parameter("EXCHG_RATE_V")
    private BigDecimal exchgRateV;
	
	@Parameter("REQ_DATE")
    private Date reqDate;
	
	@Parameter("STATUS_DOC")
    private String statusDoc;
	
	@Parameter("DOC_TYPE")
    private String docType;
	
	@Parameter("BASE_UOM")
    private String baseUOM;
	
	@Parameter("PURCH_NO_C")
    private String purchNoC;
	
	@Parameter("DISTR_CHAN")
    private String distrChan;
	
	@Parameter("CURR_ISO")
    private String currISO;
	
	@Parameter("SD_DOC")
    private String sdDoc;
	
	@Parameter("DOC_STATUS")
    private String docStatus;
	
	@Parameter("MAT_VERS")
    private String matVers;
	
	@Parameter("NET_PRICE")
    private BigDecimal netPrice;
	
	@Parameter("STORE_LOC")
    private String storeLoc;
	
	@Parameter("CREATION_DATE")
    private Date creationDate;
	
	@Parameter("GI_DATE")
    private Date giDate;
	
	@Parameter("NAME")
    private String name;
	
	@Parameter("ORD_REASON")
    private String ordReason;
	
	@Parameter("BILL_BLOCK")
    private String billBlock;
	
	@Parameter("SORT_TEXT")
    private String sortText;
	
	@Parameter("EXCHG_RATE")
    private BigDecimal exchgRate;
	
	@Parameter("SALES_GRP")
    private String salesGrp;
	
	@Parameter("PLANT")
    private String plant;
	
	@Parameter("B_UOM_ISO")
    private String bUomIso;
	
	@Parameter("SALES_ORG")
    private String salesOrg;
	
	@Parameter("COND_P_UNT")
    private BigDecimal condPUnt;
	
	@Parameter("REQ_QTY")
    private BigDecimal reqQty;
	
	@Parameter("MAT_GUID")
    private String matGuid;
	
	@Parameter("DIVISION")
    private String division;
	
	@Parameter("SALES_OFF")
    private String salesOff;
	
	@Parameter("VALID_TO")
    private Date validTo;
	
	@Parameter("BATCH")
    private String batch;
	
	@Parameter("VALID_FROM")
    private Date validForm;
	
	@Parameter("ITM_NUMBER")
    private String itmNumber;
	
	@Parameter("MATERIAL")
    private String material;
	
	@Parameter("CURRENCY")
    private String currency;
	
	@Parameter("NET_VAL_HD")
    private BigDecimal netValHD;
	
	@Parameter("REQ_SEGMENT")
    private String reqSegment;
	
	@Parameter("DLV_QTY")
    private BigDecimal dlvQty;
	
	@Parameter("S_UNIT_ISO")
    private String sUnitISO;
	
	@Parameter("SALES_UNIT")
    private String salesUnit;
	
	@Parameter("REASON_REJ")
    private String reasonRej;
	
	@Parameter("CD_UNT_ISO")
    private String cdUntISO;
	
	@Parameter("SHIP_POINT")
    private String shipPoint;
	
	@Parameter("MAT_EXT")
    private String matExt;

    @Parameter("COND_UNIT")
    private String condUnit;

    @Parameter("DLV_BLOCK")
    private String dlvBlock;

    @Parameter("DOC_DATE")
    private Date docDate;

	public String getPurchNo() {
		return purchNo;
	}

	public BigDecimal getNetValue() {
		return netValue;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public String getSoldTo() {
		return soldTo;
	}

	public BigDecimal getExchgRateV() {
		return exchgRateV;
	}

	public Date getReqDate() {
		return reqDate;
	}

	public String getStatusDoc() {
		return statusDoc;
	}

	public String getDocType() {
		return docType;
	}

	public String getBaseUOM() {
		return baseUOM;
	}

	public String getPurchNoC() {
		return purchNoC;
	}

	public String getDistrChan() {
		return distrChan;
	}

	public String getCurrISO() {
		return currISO;
	}

	public String getSdDoc() {
		return sdDoc;
	}

	public String getDocStatus() {
		return docStatus;
	}

	public String getMatVers() {
		return matVers;
	}

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public String getStoreLoc() {
		return storeLoc;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getGiDate() {
		return giDate;
	}

	public String getName() {
		return name;
	}

	public String getOrdReason() {
		return ordReason;
	}

	public String getBillBlock() {
		return billBlock;
	}

	public String getSortText() {
		return sortText;
	}

	public BigDecimal getExchgRate() {
		return exchgRate;
	}

	public String getSalesGrp() {
		return salesGrp;
	}

	public String getPlant() {
		return plant;
	}

	public String getbUomIso() {
		return bUomIso;
	}

	public String getSalesOrg() {
		return salesOrg;
	}

	public BigDecimal getCondPUnt() {
		return condPUnt;
	}

	public BigDecimal getReqQty() {
		return reqQty;
	}

	public String getMatGuid() {
		return matGuid;
	}

	public String getDivision() {
		return division;
	}

	public String getSalesOff() {
		return salesOff;
	}

	public Date getValidTo() {
		return validTo;
	}

	public String getBatch() {
		return batch;
	}

	public Date getValidForm() {
		return validForm;
	}

	public String getItmNumber() {
		return itmNumber;
	}

	public String getMaterial() {
		return material;
	}

	public String getCurrency() {
		return currency;
	}

	public BigDecimal getNetValHD() {
		return netValHD;
	}

	public String getReqSegment() {
		return reqSegment;
	}

	public BigDecimal getDlvQty() {
		return dlvQty;
	}

	public String getsUnitISO() {
		return sUnitISO;
	}

	public String getSalesUnit() {
		return salesUnit;
	}

	public String getReasonRej() {
		return reasonRej;
	}

	public String getCdUntISO() {
		return cdUntISO;
	}

	public String getShipPoint() {
		return shipPoint;
	}

	public String getMatExt() {
		return matExt;
	}

	public String getCondUnit() {
		return condUnit;
	}

	public String getDlvBlock() {
		return dlvBlock;
	}

	public Date getDocDate() {
		return docDate;
	}

}
