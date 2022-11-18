package com.example.finaldemo.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GatewaysInfo {

    @SerializedName("gravtyApiKey")
    @Expose
    private String gravtyApiKey;
    @SerializedName("gravtyClientId")
    @Expose
    private String gravtyClientId;
    @SerializedName("gravtyClientSecret")
    @Expose
    private String gravtyClientSecret;
    @SerializedName("gravtyScope")
    @Expose
    private String gravtyScope;
    @SerializedName("gravtyGrantType")
    @Expose
    private String gravtyGrantType;
    @SerializedName("qwikCilverUserName")
    @Expose
    private String qwikCilverUserName;
    @SerializedName("qwikCilverPassword")
    @Expose
    private String qwikCilverPassword;
    @SerializedName("qwikCilverForwardEntityId")
    @Expose
    private String qwikCilverForwardEntityId;
    @SerializedName("qwikCilverForwardEntityPassword")
    @Expose
    private String qwikCilverForwardEntityPassword;
    @SerializedName("razorPayUserId")
    @Expose
    private String razorPayUserId;
    @SerializedName("razorPayPassword")
    @Expose
    private String razorPayPassword;
    @SerializedName("mosambeeMId")
    @Expose
    private String mosambeeMId;
    @SerializedName("mosambeeUserKey")
    @Expose
    private String mosambeeUserKey;

    public String getGravtyApiKey() {
        return gravtyApiKey;
    }

    public void setGravtyApiKey(String gravtyApiKey) {
        this.gravtyApiKey = gravtyApiKey;
    }

    public String getGravtyClientId() {
        return gravtyClientId;
    }

    public void setGravtyClientId(String gravtyClientId) {
        this.gravtyClientId = gravtyClientId;
    }

    public String getGravtyClientSecret() {
        return gravtyClientSecret;
    }

    public void setGravtyClientSecret(String gravtyClientSecret) {
        this.gravtyClientSecret = gravtyClientSecret;
    }

    public String getGravtyScope() {
        return gravtyScope;
    }

    public void setGravtyScope(String gravtyScope) {
        this.gravtyScope = gravtyScope;
    }

    public String getGravtyGrantType() {
        return gravtyGrantType;
    }

    public void setGravtyGrantType(String gravtyGrantType) {
        this.gravtyGrantType = gravtyGrantType;
    }

    public String getQwikCilverUserName() {
        return qwikCilverUserName;
    }

    public void setQwikCilverUserName(String qwikCilverUserName) {
        this.qwikCilverUserName = qwikCilverUserName;
    }

    public String getQwikCilverPassword() {
        return qwikCilverPassword;
    }

    public void setQwikCilverPassword(String qwikCilverPassword) {
        this.qwikCilverPassword = qwikCilverPassword;
    }

    public String getQwikCilverForwardEntityId() {
        return qwikCilverForwardEntityId;
    }

    public void setQwikCilverForwardEntityId(String qwikCilverForwardEntityId) {
        this.qwikCilverForwardEntityId = qwikCilverForwardEntityId;
    }

    public String getQwikCilverForwardEntityPassword() {
        return qwikCilverForwardEntityPassword;
    }

    public void setQwikCilverForwardEntityPassword(String qwikCilverForwardEntityPassword) {
        this.qwikCilverForwardEntityPassword = qwikCilverForwardEntityPassword;
    }

    public String getRazorPayUserId() {
        return razorPayUserId;
    }

    public void setRazorPayUserId(String razorPayUserId) {
        this.razorPayUserId = razorPayUserId;
    }

    public String getRazorPayPassword() {
        return razorPayPassword;
    }

    public void setRazorPayPassword(String razorPayPassword) {
        this.razorPayPassword = razorPayPassword;
    }

    public String getMosambeeMId() {
        return mosambeeMId;
    }

    public void setMosambeeMId(String mosambeeMId) {
        this.mosambeeMId = mosambeeMId;
    }

    public String getMosambeeUserKey() {
        return mosambeeUserKey;
    }

    public void setMosambeeUserKey(String mosambeeUserKey) {
        this.mosambeeUserKey = mosambeeUserKey;
    }

}
