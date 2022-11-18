
package com.example.uatskudetails.Models;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Id__1 {

    @SerializedName("taxcat")
    @Expose
    private String taxcat;
    @SerializedName("taxtyp")
    @Expose
    private String taxtyp;
    @SerializedName("taxfmt")
    @Expose
    private String taxfmt;
    @SerializedName("taxtmt")
    @Expose
    private String taxtmt;

    public String getTaxcat() {
        return taxcat;
    }

    public void setTaxcat(String taxcat) {
        this.taxcat = taxcat;
    }

    public String getTaxtyp() {
        return taxtyp;
    }

    public void setTaxtyp(String taxtyp) {
        this.taxtyp = taxtyp;
    }

    public String getTaxfmt() {
        return taxfmt;
    }

    public void setTaxfmt(String taxfmt) {
        this.taxfmt = taxfmt;
    }

    public String getTaxtmt() {
        return taxtmt;
    }

    public void setTaxtmt(String taxtmt) {
        this.taxtmt = taxtmt;
    }

}
