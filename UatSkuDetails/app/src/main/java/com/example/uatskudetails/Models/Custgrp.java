
package com.example.uatskudetails.Models;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Custgrp {

    @SerializedName("_id")
    @Expose
    private Id__2 id;
    @SerializedName("deal_id")
    @Expose
    private String dealId;
    @SerializedName("groupid")
    @Expose
    private String groupid;
    @SerializedName("identification")
    @Expose
    private String identification;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("createdatetime")
    @Expose
    private String createdatetime;

    public Id__2 getId() {
        return id;
    }

    public void setId(Id__2 id) {
        this.id = id;
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(String createdatetime) {
        this.createdatetime = createdatetime;
    }

}
