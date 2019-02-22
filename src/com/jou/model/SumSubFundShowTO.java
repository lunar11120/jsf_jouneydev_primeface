/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jou.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author Administrator
 */
@Entity
public class SumSubFundShowTO implements Serializable {

    @EmbeddedId
    protected SumSubFundShowTOPK sumSubFundShowTOPK;
    @Column(name = "FUND_TYPE")
    private String fundType;
    @Column(name = "DESC_NAME")
    private String descName;
    @Column(name = "CCUF")
    private String ccuf;
    @Column(name = "K_VALUE")
    private String kValue;
    @Column(name = "ADJRW_NHSO")
    private String adjrwNhso;
    @Column(name = "POINT")
    private Double point;
    @Column(name = "TOTAL_RATE")
    private Double totalRate;
    @Column(name = "CHARGE_RULE")
    private Double chargeRule;
    @Column(name = "TOTL_AMT")
    private Double totlAmt;
    @Column(name = "ACT_AMT")
    private Double actAmt;
    //New film
    @Column(name = "BASE_RATE_TYPE")
    private String base_rate_type;

    public SumSubFundShowTOPK getSumSubFundShowTOPK() {
        return sumSubFundShowTOPK;
    }

    public void setSumSubFundShowTOPK(SumSubFundShowTOPK sumSubFundShowTOPK) {
        this.sumSubFundShowTOPK = sumSubFundShowTOPK;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getAdjrwNhso() {
        return adjrwNhso;
    }

    public void setAdjrwNhso(String adjrwNhso) {
        this.adjrwNhso = adjrwNhso;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public Double getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(Double totalRate) {
        this.totalRate = totalRate;
    }

    public Double getChargeRule() {
        return chargeRule;
    }

    public void setChargeRule(Double chargeRule) {
        this.chargeRule = chargeRule;
    }

    public Double getTotlAmt() {
        return totlAmt;
    }

    public void setTotlAmt(Double totlAmt) {
        this.totlAmt = totlAmt;
    }

    public Double getActAmt() {
        return actAmt;
    }

    public void setActAmt(Double actAmt) {
        this.actAmt = actAmt;
    }

    public String getDescName() {
        return descName;
    }

    public void setDescName(String descName) {
        this.descName = descName;
    }

    public String getCcuf() {
        return ccuf;
    }

    public void setCcuf(String ccuf) {
        this.ccuf = ccuf;
    }

    public String getBase_rate_type() {
        return base_rate_type;
    }

    public void setBase_rate_type(String base_rate_type) {
        this.base_rate_type = base_rate_type;
    }

   

    /**
     * @return the kValue
     */
    public String getkValue() {
        return kValue;
    }

    /**
     * @param kValue the kValue to set
     */
    public void setkValue(String kValue) {
        this.kValue = kValue;
    }
}
