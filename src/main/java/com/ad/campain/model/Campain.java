package com.ad.campain.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Campain {

	private String campainId;
	private String accountId;
	private String areaCode;
	private int minAge;
	private int maxAge;
	private String campainDetail;
	
	public Campain(){}

	public String getCampainId() {
		return campainId;
	}

	public void setCampainId(String campainId) {
		this.campainId = campainId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public String getCampainDetail() {
		return campainDetail;
	}

	public void setCampainDetail(String campainDetail) {
		this.campainDetail = campainDetail;
	}

}
