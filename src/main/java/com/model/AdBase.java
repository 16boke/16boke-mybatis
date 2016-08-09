package com.model;

import java.sql.Timestamp;
import java.util.Date;

public class AdBase {
	private long id;
	private String adName;
	private Date pdateFrom;
	private Date pdateEnd;
	private Date createTime;
	private Timestamp updateTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public Date getPdateFrom() {
		return pdateFrom;
	}

	public void setPdateFrom(Date pdateFrom) {
		this.pdateFrom = pdateFrom;
	}

	public Date getPdateEnd() {
		return pdateEnd;
	}

	public void setPdateEnd(Date pdateEnd) {
		this.pdateEnd = pdateEnd;
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
		return "AdBase [id=" + id + ", adName=" + adName + ", pdateFrom=" + pdateFrom + ", pdateEnd=" + pdateEnd + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}

}
