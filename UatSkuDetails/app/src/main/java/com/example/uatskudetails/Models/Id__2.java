
package com.example.uatskudetails.Models;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Id__2 {

    @SerializedName("deal_id")
    @Expose
    private String dealId;
    @SerializedName("identification")
    @Expose
    private String identification;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("groupid")
    @Expose
    private String groupid;

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
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

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

}
