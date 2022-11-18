
package com.example.uatskudetails.Models;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class OfferTerm {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("correlationid")
    @Expose
    private String correlationid;
    @SerializedName("deal_id")
    @Expose
    private String dealId;
    @SerializedName("term_internalid")
    @Expose
    private String termInternalid;
    @SerializedName("internal_booleanrule_id")
    @Expose
    private String internalBooleanruleId;
    @SerializedName("typecode")
    @Expose
    private String typecode;
    @SerializedName("mandatoryindicator")
    @Expose
    private String mandatoryindicator;
    @SerializedName("no_pertrans")
    @Expose
    private Integer noPertrans;
    @SerializedName("offering_type")
    @Expose
    private String offeringType;
    @SerializedName("offer_article_id")
    @Expose
    private String offerArticleId;
    @SerializedName("producttype")
    @Expose
    private String producttype;
    @SerializedName("oldarticlenumber")
    @Expose
    private String oldarticlenumber;
    @SerializedName("offer_productcategoryid")
    @Expose
    private String offerProductcategoryid;
    @SerializedName("offering_typecode")
    @Expose
    private Integer offeringTypecode;
    @SerializedName("condition_type")
    @Expose
    private String conditionType;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("quan_enforce")
    @Expose
    private String quanEnforce;
    @SerializedName("subsdiscavailable")
    @Expose
    private Boolean subsdiscavailable;
    @SerializedName("amount")
    @Expose
    private Object amount;
    @SerializedName("reward_type")
    @Expose
    private String rewardType;
    @SerializedName("rtypecode")
    @Expose
    private Integer rtypecode;
    @SerializedName("rvalue")
    @Expose
    private Integer rvalue;
    @SerializedName("meid_typecode")
    @Expose
    private Object meidTypecode;
    @SerializedName("meid_value")
    @Expose
    private Object meidValue;
    @SerializedName("trrq_qty")
    @Expose
    private Object trrqQty;
    @SerializedName("trrq_inctype")
    @Expose
    private String trrqInctype;
    @SerializedName("trrq_inctypedesc")
    @Expose
    private String trrqInctypedesc;
    @SerializedName("trrq_incdetails")
    @Expose
    private String trrqIncdetails;
    @SerializedName("couponcode")
    @Expose
    private String couponcode;
    @SerializedName("trrw_inctype")
    @Expose
    private Object trrwInctype;
    @SerializedName("trrw_inctypedesc")
    @Expose
    private String trrwInctypedesc;
    @SerializedName("trrw_inc_val")
    @Expose
    private Object trrwIncVal;
    @SerializedName("trrw_redemp_rate")
    @Expose
    private Object trrwRedempRate;
    @SerializedName("trrw_inc_qty")
    @Expose
    private Object trrwIncQty;
    @SerializedName("createdatetime")
    @Expose
    private String createdatetime;
    @SerializedName("term_internal_id")
    @Expose
    private String termInternalId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("totalTerms")
    @Expose
    private Integer totalTerms;
    @SerializedName("inexflag")
    @Expose
    private String inexflag;
    @SerializedName("u_inexflag")
    @Expose
    private Boolean uInexflag;
    @SerializedName("itype")
    @Expose
    private String itype;
    @SerializedName("inumbr")
    @Expose
    private String inumbr;
    @SerializedName("tt_deal")
    @Expose
    private Boolean ttDeal;
    @SerializedName("header")
    @Expose
    private Header header;
    @SerializedName("distribution")
    @Expose
    private Distribution distribution;
    @SerializedName("custgrp")
    @Expose
    private List<Custgrp> custgrp = null;
    @SerializedName("validforseasnsource")
    @Expose
    private Boolean validforseasnsource;
    @SerializedName("validforseasntarget")
    @Expose
    private Boolean validforseasntarget;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorrelationid() {
        return correlationid;
    }

    public void setCorrelationid(String correlationid) {
        this.correlationid = correlationid;
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getTermInternalid() {
        return termInternalid;
    }

    public void setTermInternalid(String termInternalid) {
        this.termInternalid = termInternalid;
    }

    public String getInternalBooleanruleId() {
        return internalBooleanruleId;
    }

    public void setInternalBooleanruleId(String internalBooleanruleId) {
        this.internalBooleanruleId = internalBooleanruleId;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getMandatoryindicator() {
        return mandatoryindicator;
    }

    public void setMandatoryindicator(String mandatoryindicator) {
        this.mandatoryindicator = mandatoryindicator;
    }

    public Integer getNoPertrans() {
        return noPertrans;
    }

    public void setNoPertrans(Integer noPertrans) {
        this.noPertrans = noPertrans;
    }

    public String getOfferingType() {
        return offeringType;
    }

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    public String getOfferArticleId() {
        return offerArticleId;
    }

    public void setOfferArticleId(String offerArticleId) {
        this.offerArticleId = offerArticleId;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getOldarticlenumber() {
        return oldarticlenumber;
    }

    public void setOldarticlenumber(String oldarticlenumber) {
        this.oldarticlenumber = oldarticlenumber;
    }

    public String getOfferProductcategoryid() {
        return offerProductcategoryid;
    }

    public void setOfferProductcategoryid(String offerProductcategoryid) {
        this.offerProductcategoryid = offerProductcategoryid;
    }

    public Integer getOfferingTypecode() {
        return offeringTypecode;
    }

    public void setOfferingTypecode(Integer offeringTypecode) {
        this.offeringTypecode = offeringTypecode;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getQuanEnforce() {
        return quanEnforce;
    }

    public void setQuanEnforce(String quanEnforce) {
        this.quanEnforce = quanEnforce;
    }

    public Boolean getSubsdiscavailable() {
        return subsdiscavailable;
    }

    public void setSubsdiscavailable(Boolean subsdiscavailable) {
        this.subsdiscavailable = subsdiscavailable;
    }

    public Object getAmount() {
        return amount;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getRtypecode() {
        return rtypecode;
    }

    public void setRtypecode(Integer rtypecode) {
        this.rtypecode = rtypecode;
    }

    public Integer getRvalue() {
        return rvalue;
    }

    public void setRvalue(Integer rvalue) {
        this.rvalue = rvalue;
    }

    public Object getMeidTypecode() {
        return meidTypecode;
    }

    public void setMeidTypecode(Object meidTypecode) {
        this.meidTypecode = meidTypecode;
    }

    public Object getMeidValue() {
        return meidValue;
    }

    public void setMeidValue(Object meidValue) {
        this.meidValue = meidValue;
    }

    public Object getTrrqQty() {
        return trrqQty;
    }

    public void setTrrqQty(Object trrqQty) {
        this.trrqQty = trrqQty;
    }

    public String getTrrqInctype() {
        return trrqInctype;
    }

    public void setTrrqInctype(String trrqInctype) {
        this.trrqInctype = trrqInctype;
    }

    public String getTrrqInctypedesc() {
        return trrqInctypedesc;
    }

    public void setTrrqInctypedesc(String trrqInctypedesc) {
        this.trrqInctypedesc = trrqInctypedesc;
    }

    public String getTrrqIncdetails() {
        return trrqIncdetails;
    }

    public void setTrrqIncdetails(String trrqIncdetails) {
        this.trrqIncdetails = trrqIncdetails;
    }

    public String getCouponcode() {
        return couponcode;
    }

    public void setCouponcode(String couponcode) {
        this.couponcode = couponcode;
    }

    public Object getTrrwInctype() {
        return trrwInctype;
    }

    public void setTrrwInctype(Object trrwInctype) {
        this.trrwInctype = trrwInctype;
    }

    public String getTrrwInctypedesc() {
        return trrwInctypedesc;
    }

    public void setTrrwInctypedesc(String trrwInctypedesc) {
        this.trrwInctypedesc = trrwInctypedesc;
    }

    public Object getTrrwIncVal() {
        return trrwIncVal;
    }

    public void setTrrwIncVal(Object trrwIncVal) {
        this.trrwIncVal = trrwIncVal;
    }

    public Object getTrrwRedempRate() {
        return trrwRedempRate;
    }

    public void setTrrwRedempRate(Object trrwRedempRate) {
        this.trrwRedempRate = trrwRedempRate;
    }

    public Object getTrrwIncQty() {
        return trrwIncQty;
    }

    public void setTrrwIncQty(Object trrwIncQty) {
        this.trrwIncQty = trrwIncQty;
    }

    public String getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(String createdatetime) {
        this.createdatetime = createdatetime;
    }

    public String getTermInternalId() {
        return termInternalId;
    }

    public void setTermInternalId(String termInternalId) {
        this.termInternalId = termInternalId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getTotalTerms() {
        return totalTerms;
    }

    public void setTotalTerms(Integer totalTerms) {
        this.totalTerms = totalTerms;
    }

    public String getInexflag() {
        return inexflag;
    }

    public void setInexflag(String inexflag) {
        this.inexflag = inexflag;
    }

    public Boolean getuInexflag() {
        return uInexflag;
    }

    public void setuInexflag(Boolean uInexflag) {
        this.uInexflag = uInexflag;
    }

    public String getItype() {
        return itype;
    }

    public void setItype(String itype) {
        this.itype = itype;
    }

    public String getInumbr() {
        return inumbr;
    }

    public void setInumbr(String inumbr) {
        this.inumbr = inumbr;
    }

    public Boolean getTtDeal() {
        return ttDeal;
    }

    public void setTtDeal(Boolean ttDeal) {
        this.ttDeal = ttDeal;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Distribution getDistribution() {
        return distribution;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    public List<Custgrp> getCustgrp() {
        return custgrp;
    }

    public void setCustgrp(List<Custgrp> custgrp) {
        this.custgrp = custgrp;
    }

    public Boolean getValidforseasnsource() {
        return validforseasnsource;
    }

    public void setValidforseasnsource(Boolean validforseasnsource) {
        this.validforseasnsource = validforseasnsource;
    }

    public Boolean getValidforseasntarget() {
        return validforseasntarget;
    }

    public void setValidforseasntarget(Boolean validforseasntarget) {
        this.validforseasntarget = validforseasntarget;
    }

}
