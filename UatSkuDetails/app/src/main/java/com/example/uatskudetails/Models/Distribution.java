
package com.example.uatskudetails.Models;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Distribution {

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
    @SerializedName("storeid")
    @Expose
    private String storeid;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("pulled_flag")
    @Expose
    private String pulledFlag;
    @SerializedName("processed_flag")
    @Expose
    private String processedFlag;
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

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPulledFlag() {
        return pulledFlag;
    }

    public void setPulledFlag(String pulledFlag) {
        this.pulledFlag = pulledFlag;
    }

    public String getProcessedFlag() {
        return processedFlag;
    }

    public void setProcessedFlag(String processedFlag) {
        this.processedFlag = processedFlag;
    }

    public String getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(String createdatetime) {
        this.createdatetime = createdatetime;
    }

}
