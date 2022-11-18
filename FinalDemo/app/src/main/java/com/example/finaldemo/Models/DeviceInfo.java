package com.example.finaldemo.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DeviceInfo {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("TerminalId")
    @Expose
    private String terminalId;
    @SerializedName("MosambeeUserId")
    @Expose
    private String mosambeeUserId;
    @SerializedName("MosambeePassword")
    @Expose
    private String mosambeePassword;
    @SerializedName("StoreCode")
    @Expose
    private String storeCode;
    @SerializedName("DeviceId")
    @Expose
    private String deviceId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getMosambeeUserId() {
        return mosambeeUserId;
    }

    public void setMosambeeUserId(String mosambeeUserId) {
        this.mosambeeUserId = mosambeeUserId;
    }

    public String getMosambeePassword() {
        return mosambeePassword;
    }

    public void setMosambeePassword(String mosambeePassword) {
        this.mosambeePassword = mosambeePassword;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

}

