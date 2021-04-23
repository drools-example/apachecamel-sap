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
public class Bukrs implements Serializable {

	private static final long serialVersionUID = 1L;

	@Parameter("SIGN")
    private String sign;
	
	@Parameter("OPTION")
    private String option;
	
	@Parameter("LOW")
    private String low;
	
	@Parameter("HIGH")
    private Date high;

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public Date getHigh() {
		return high;
	}

	public void setHigh(Date high) {
		this.high = high;
	}
}
