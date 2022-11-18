package com.example.finaldemo.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Data {

    @SerializedName("store_session_id")
    @Expose
    private String storeSessionId;
    @SerializedName("session_id")
    @Expose
    private String sessionId;
    @SerializedName("store_status")
    @Expose
    private String storeStatus;
    @SerializedName("AuthToken")
    @Expose
    private String authToken;
    @SerializedName("password_reset_days")
    @Expose
    private Integer passwordResetDays;
    @SerializedName("ServerTime")
    @Expose
    private Long serverTime;
    @SerializedName("passwordReset")
    @Expose
    private Integer passwordReset;
    @SerializedName("Employee")
    @Expose
    private Employee employee;
    @SerializedName("store_details")
    @Expose
    private StoreDetails storeDetails;
    @SerializedName("access")
    @Expose
    private Access access;
    @SerializedName("DeviceInfo")
    @Expose
    private DeviceInfo deviceInfo;
    @SerializedName("GatewaysInfo")
    @Expose
    private GatewaysInfo gatewaysInfo;
    @SerializedName("access_store")
    @Expose
    private List<Object> accessStore = null;

    public String getStoreSessionId() {
        return storeSessionId;
    }

    public void setStoreSessionId(String storeSessionId) {
        this.storeSessionId = storeSessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public Integer getPasswordResetDays() {
        return passwordResetDays;
    }

    public void setPasswordResetDays(Integer passwordResetDays) {
        this.passwordResetDays = passwordResetDays;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public Integer getPasswordReset() {
        return passwordReset;
    }

    public void setPasswordReset(Integer passwordReset) {
        this.passwordReset = passwordReset;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public StoreDetails getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(StoreDetails storeDetails) {
        this.storeDetails = storeDetails;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public GatewaysInfo getGatewaysInfo() {
        return gatewaysInfo;
    }

    public void setGatewaysInfo(GatewaysInfo gatewaysInfo) {
        this.gatewaysInfo = gatewaysInfo;
    }

    public List<Object> getAccessStore() {
        return accessStore;
    }

    public void setAccessStore(List<Object> accessStore) {
        this.accessStore = accessStore;
    }

}
