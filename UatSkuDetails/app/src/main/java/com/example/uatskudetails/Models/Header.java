
package com.example.uatskudetails.Models;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Header {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("correlationid")
    @Expose
    private String correlationid;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("deal_id")
    @Expose
    private String dealId;
    @SerializedName("deal_type")
    @Expose
    private String dealType;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("effective_date")
    @Expose
    private String effectiveDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("term_style")
    @Expose
    private String termStyle;
    @SerializedName("dealdist")
    @Expose
    private String dealdist;
    @SerializedName("anniversary")
    @Expose
    private String anniversary;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("hour")
    @Expose
    private String hour;
    @SerializedName("days")
    @Expose
    private String days;
    @SerializedName("createdatetime")
    @Expose
    private String createdatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCorrelationid() {
        return correlationid;
    }

    public void setCorrelationid(String correlationid) {
        this.correlationid = correlationid;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTermStyle() {
        return termStyle;
    }

    public void setTermStyle(String termStyle) {
        this.termStyle = termStyle;
    }

    public String getDealdist() {
        return dealdist;
    }

    public void setDealdist(String dealdist) {
        this.dealdist = dealdist;
    }

    public String getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(String anniversary) {
        this.anniversary = anniversary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(String createdatetime) {
        this.createdatetime = createdatetime;
    }

}
