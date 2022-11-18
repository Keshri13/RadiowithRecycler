package com.example.finaldemo.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("emploc")
    @Expose
    private String emploc;
    @SerializedName("empno")
    @Expose
    private String empno;
    @SerializedName("empnm")
    @Expose
    private String empnm;
    @SerializedName("empfnm")
    @Expose
    private String empfnm;
    @SerializedName("emplnm")
    @Expose
    private String emplnm;
    @SerializedName("empfn")
    @Expose
    private String empfn;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("password_last_updated")
    @Expose
    private String passwordLastUpdated;
    @SerializedName("password_expiry")
    @Expose
    private String passwordExpiry;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("primary_group")
    @Expose
    private String primaryGroup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmploc() {
        return emploc;
    }

    public void setEmploc(String emploc) {
        this.emploc = emploc;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEmpnm() {
        return empnm;
    }

    public void setEmpnm(String empnm) {
        this.empnm = empnm;
    }

    public String getEmpfnm() {
        return empfnm;
    }

    public void setEmpfnm(String empfnm) {
        this.empfnm = empfnm;
    }

    public String getEmplnm() {
        return emplnm;
    }

    public void setEmplnm(String emplnm) {
        this.emplnm = emplnm;
    }

    public String getEmpfn() {
        return empfn;
    }

    public void setEmpfn(String empfn) {
        this.empfn = empfn;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPasswordLastUpdated() {
        return passwordLastUpdated;
    }

    public void setPasswordLastUpdated(String passwordLastUpdated) {
        this.passwordLastUpdated = passwordLastUpdated;
    }

    public String getPasswordExpiry() {
        return passwordExpiry;
    }

    public void setPasswordExpiry(String passwordExpiry) {
        this.passwordExpiry = passwordExpiry;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPrimaryGroup() {
        return primaryGroup;
    }

    public void setPrimaryGroup(String primaryGroup) {
        this.primaryGroup = primaryGroup;
    }

}