
package com.example.uatskudetails.Models;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Id {

    @SerializedName("taxcat")
    @Expose
    private String taxcat;
    @SerializedName("taxsku")
    @Expose
    private String taxsku;

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

}
