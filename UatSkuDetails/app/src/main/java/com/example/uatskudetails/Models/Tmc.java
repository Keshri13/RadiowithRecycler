
package com.example.uatskudetails.Models;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Tmc {

    @SerializedName("_id")
    @Expose
    private Id id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("taxday")
    @Expose
    private Integer taxday;
    @SerializedName("taxcen")
    @Expose
    private Integer taxcen;
    @SerializedName("taxcur")
    @Expose
    private Long taxcur;
    @SerializedName("taxopc")
    @Expose
    private String taxopc;
    @SerializedName("storeid")
    @Expose
    private Integer storeid;
    @SerializedName("taxcat")
    @Expose
    private String taxcat;
    @SerializedName("taxsku")
    @Expose
    private String taxsku;
    @SerializedName("taxbiz")
    @Expose
    private String taxbiz;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getTaxday() {
        return taxday;
    }

    public void setTaxday(Integer taxday) {
        this.taxday = taxday;
    }

    public Integer getTaxcen() {
        return taxcen;
    }

    public void setTaxcen(Integer taxcen) {
        this.taxcen = taxcen;
    }

    public Long getTaxcur() {
        return taxcur;
    }

    public void setTaxcur(Long taxcur) {
        this.taxcur = taxcur;
    }

    public String getTaxopc() {
        return taxopc;
    }

    public void setTaxopc(String taxopc) {
        this.taxopc = taxopc;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getTaxcat() {
        return taxcat;
    }

    public void setTaxcat(String taxcat) {
        this.taxcat = taxcat;
    }

    public String getTaxsku() {
        return taxsku;
    }

    public void setTaxsku(String taxsku) {
        this.taxsku = taxsku;
    }

    public String getTaxbiz() {
        return taxbiz;
    }

    public void setTaxbiz(String taxbiz) {
        this.taxbiz = taxbiz;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
