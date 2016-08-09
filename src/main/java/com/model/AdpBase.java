package com.model;

import java.sql.Timestamp;
import java.util.Date;

public class AdpBase {
	private long id;
	private String adpName;
	private String adpCode;
	private Date createTime;
	private Timestamp updateTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdpName() {
		return adpName;
	}

	public void setAdpName(String adpName) {
		this.adpName = adpName;
	}

	public String getAdpCode() {
		return adpCode;
	}

	public void setAdpCode(String adpCode) {
		this.adpCode = adpCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "AdpBase [id=" + id + ", adpName=" + adpName + ", adpCode=" + adpCode + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

}
