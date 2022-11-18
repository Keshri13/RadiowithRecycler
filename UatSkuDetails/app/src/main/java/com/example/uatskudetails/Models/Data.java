
package com.example.uatskudetails.Models;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Data {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("upcday")
    @Expose
    private Integer upcday;
    @SerializedName("upccen")
    @Expose
    private Integer upccen;
    @SerializedName("upccur")
    @Expose
    private Long upccur;
    @SerializedName("upcopc")
    @Expose
    private String upcopc;
    @SerializedName("storeid")
    @Expose
    private Integer storeid;
    @SerializedName("upccde")
    @Expose
    private String upccde;
    @SerializedName("upcsku")
    @Expose
    private String upcsku;
    @SerializedName("upcccd")
    @Expose
    private String upcccd;
    @SerializedName("upcumr")
    @Expose
    private String upcumr;
    @SerializedName("upcbiz")
    @Expose
    private String upcbiz;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("sku")
    @Expose
    private Sku sku;
    @SerializedName("plu")
    @Expose
    private List<Plu> plu = null;
    @SerializedName("tmc")
    @Expose
    private List<Tmc> tmc = null;
    @SerializedName("tcd")
    @Expose
    private List<Tcd> tcd = null;
    @SerializedName("TotalDeals")
    @Expose
    private Integer totalDeals;
    @SerializedName("TotalOfferTerm")
    @Expose
    private Integer totalOfferTerm;
    @SerializedName("OfferTerm")
    @Expose
    private List<OfferTerm> offerTerm = null;

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

    public Integer getUpcday() {
        return upcday;
    }

    public void setUpcday(Integer upcday) {
        this.upcday = upcday;
    }

    public Integer getUpccen() {
        return upccen;
    }

    public void setUpccen(Integer upccen) {
        this.upccen = upccen;
    }

    public Long getUpccur() {
        return upccur;
    }

    public void setUpccur(Long upccur) {
        this.upccur = upccur;
    }

    public String getUpcopc() {
        return upcopc;
    }

    public void setUpcopc(String upcopc) {
        this.upcopc = upcopc;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getUpccde() {
        return upccde;
    }

    public void setUpccde(String upccde) {
        this.upccde = upccde;
    }

    public String getUpcsku() {
        return upcsku;
    }

    public void setUpcsku(String upcsku) {
        this.upcsku = upcsku;
    }

    public String getUpcccd() {
        return upcccd;
    }

    public void setUpcccd(String upcccd) {
        this.upcccd = upcccd;
    }

    public String getUpcumr() {
        return upcumr;
    }

    public void setUpcumr(String upcumr) {
        this.upcumr = upcumr;
    }

    public String getUpcbiz() {
        return upcbiz;
    }

    public void setUpcbiz(String upcbiz) {
        this.upcbiz = upcbiz;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public List<Plu> getPlu() {
        return plu;
    }

    public void setPlu(List<Plu> plu) {
        this.plu = plu;
    }

    public List<Tmc> getTmc() {
        return tmc;
    }

    public void setTmc(List<Tmc> tmc) {
        this.tmc = tmc;
    }

    public List<Tcd> getTcd() {
        return tcd;
    }

    public void setTcd(List<Tcd> tcd) {
        this.tcd = tcd;
    }

    public Integer getTotalDeals() {
        return totalDeals;
    }

    public void setTotalDeals(Integer totalDeals) {
        this.totalDeals = totalDeals;
    }

    public Integer getTotalOfferTerm() {
        return totalOfferTerm;
    }

    public void setTotalOfferTerm(Integer totalOfferTerm) {
        this.totalOfferTerm = totalOfferTerm;
    }

    public List<OfferTerm> getOfferTerm() {
        return offerTerm;
    }

    public void setOfferTerm(List<OfferTerm> offerTerm) {
        this.offerTerm = offerTerm;
    }

}
