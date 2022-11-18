package com.example.finaldemo.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dataset {

    @SerializedName("sdiday")
    @Expose
    private Integer sdiday;
    @SerializedName("sdicen")
    @Expose
    private Integer sdicen;
    @SerializedName("sdicur")
    @Expose
    private Long sdicur;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("storeid")
    @Expose
    private String storeid;
    @SerializedName("sdicod")
    @Expose
    private String sdicod;
    @SerializedName("sdides")
    @Expose
    private String sdides;
    @SerializedName("reprin")
    @Expose
    private Integer reprin;
    @SerializedName("bnkcod")
    @Expose
    private Object bnkcod;
    @SerializedName("tndplu")
    @Expose
    private String tndplu;
    @SerializedName("tndtyp")
    @Expose
    private String tndtyp;
    @SerializedName("tndidg")
    @Expose
    private String tndidg;
    @SerializedName("tndbiz")
    @Expose
    private String tndbiz;
    @SerializedName("stdat")
    @Expose
    private Long stdat;
    @SerializedName("stendat")
    @Expose
    private Long stendat;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    public Integer getSdiday() {
        return sdiday;
    }

    public void setSdiday(Integer sdiday) {
        this.sdiday = sdiday;
    }

    public Integer getSdicen() {
        return sdicen;
    }

    public void setSdicen(Integer sdicen) {
        this.sdicen = sdicen;
    }

    public Long getSdicur() {
        return sdicur;
    }

    public void setSdicur(Long sdicur) {
        this.sdicur = sdicur;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getSdicod() {
        return sdicod;
    }

    public void setSdicod(String sdicod) {
        this.sdicod = sdicod;
    }

    public String getSdides() {
        return sdides;
    }

    public void setSdides(String sdides) {
        this.sdides = sdides;
    }

    public Integer getReprin() {
        return reprin;
    }

    public void setReprin(Integer reprin) {
        this.reprin = reprin;
    }

    public Object getBnkcod() {
        return bnkcod;
    }

    public void setBnkcod(Object bnkcod) {
        this.bnkcod = bnkcod;
    }

    public String getTndplu() {
        return tndplu;
    }

    public void setTndplu(String tndplu) {
        this.tndplu = tndplu;
    }

    public String getTndtyp() {
        return tndtyp;
    }

    public void setTndtyp(String tndtyp) {
        this.tndtyp = tndtyp;
    }

    public String getTndidg() {
        return tndidg;
    }

    public void setTndidg(String tndidg) {
        this.tndidg = tndidg;
    }

    public String getTndbiz() {
        return tndbiz;
    }

    public void setTndbiz(String tndbiz) {
        this.tndbiz = tndbiz;
    }

    public Long getStdat() {
        return stdat;
    }

    public void setStdat(Long stdat) {
        this.stdat = stdat;
    }

    public Long getStendat() {
        return stendat;
    }

    public void setStendat(Long stendat) {
        this.stendat = stendat;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}