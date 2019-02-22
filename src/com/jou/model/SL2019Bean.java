package com.jou.model;

public class SL2019Bean {
    // main data table
    private Integer seq;
    private String apprDate;
    private String type;
    private String createDate;
    private String createBy;
    private String updateDate;
    private String updateBy;
    private String sendStatus;
    private String appealSendStatus;
    private boolean allowNormalSelectFlag;
    private boolean allowAppealSelectFlag;

    //select data table
    private String hcode;
    private String repNo;
    private String budgetCode;
    private String projectCode;
    private Double payment;
    private String status;
    private String remark;
    
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getApprDate() {
		return apprDate;
	}
	public void setApprDate(String apprDate) {
		this.apprDate = apprDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getSendStatus() {
		return sendStatus;
	}
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getAppealSendStatus() {
		return appealSendStatus;
	}
	public void setAppealSendStatus(String appealSendStatus) {
		this.appealSendStatus = appealSendStatus;
	}
	public boolean isAllowNormalSelectFlag() {
		return allowNormalSelectFlag;
	}
	public void setAllowNormalSelectFlag(boolean allowNormalSelectFlag) {
		this.allowNormalSelectFlag = allowNormalSelectFlag;
	}
	public boolean isAllowAppealSelectFlag() {
		return allowAppealSelectFlag;
	}
	public void setAllowAppealSelectFlag(boolean allowAppealSelectFlag) {
		this.allowAppealSelectFlag = allowAppealSelectFlag;
	}
	public String getHcode() {
		return hcode;
	}
	public void setHcode(String hcode) {
		this.hcode = hcode;
	}
	public String getRepNo() {
		return repNo;
	}
	public void setRepNo(String repNo) {
		this.repNo = repNo;
	}
	public String getBudgetCode() {
		return budgetCode;
	}
	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public Double getPayment() {
		return payment;
	}
	public void setPayment(Double payment) {
		this.payment = payment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public SL2019Bean(Integer seq, String apprDate, String type, String createDate, String createBy, String updateDate,
			String updateBy, String sendStatus, String appealSendStatus, boolean allowNormalSelectFlag,
			boolean allowAppealSelectFlag, String hcode, String repNo, String budgetCode, String projectCode,
			Double payment, String status, String remark) {
		super();
		this.seq = seq;
		this.apprDate = apprDate;
		this.type = type;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.sendStatus = sendStatus;
		this.appealSendStatus = appealSendStatus;
		this.allowNormalSelectFlag = allowNormalSelectFlag;
		this.allowAppealSelectFlag = allowAppealSelectFlag;
		this.hcode = hcode;
		this.repNo = repNo;
		this.budgetCode = budgetCode;
		this.projectCode = projectCode;
		this.payment = payment;
		this.status = status;
		this.remark = remark;
	}
	public SL2019Bean() {
		super();
	}
	@Override
	public String toString() {
		return "SL2019Bean [apprDate=" + apprDate + ", type=" + type + ", sendStatus=" + sendStatus
				+ ", appealSendStatus=" + appealSendStatus + ", allowNormalSelectFlag=" + allowNormalSelectFlag
				+ ", allowAppealSelectFlag=" + allowAppealSelectFlag + ", projectCode=" + projectCode + ", payment="
				+ payment + ", status=" + status + "]";
	}

    
    

}
