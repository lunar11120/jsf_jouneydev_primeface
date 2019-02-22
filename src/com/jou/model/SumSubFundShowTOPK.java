/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jou.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class SumSubFundShowTOPK implements Serializable {

    @Column(name = "TRAN_ID")
    private String tranId;
    @Column(name = "SUB_FUND")
    private String subFund;
    @Column(name = "FUND_AF")
    private String fundAf;

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getSubFund() {
        return subFund;
    }

    public void setSubFund(String subFund) {
        this.subFund = subFund;
    }

    public String getFundAf() {
        return fundAf;
    }

    public void setFundAf(String fundAf) {
        this.fundAf = fundAf;
    }
}
