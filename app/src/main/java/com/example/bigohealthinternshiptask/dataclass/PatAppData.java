package com.example.bigohealthinternshiptask.dataclass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PatAppData {
    @SerializedName("docImgUrl")
    @Expose
    private String docImgUrl;
    @SerializedName("docName")
    @Expose
    private String docName;
    @SerializedName("docSpecialisation")
    @Expose
    private String docSpecialisation;
    @SerializedName("patName")
    @Expose
    private String patName;
    @SerializedName("patAge")
    @Expose
    private Integer patAge;
    @SerializedName("patAddress")
    @Expose
    private String patAddress;

    public String getDocImgUrl() {
        return docImgUrl;
    }

    public void setDocImgUrl(String docImgUrl) {
        this.docImgUrl = docImgUrl;
    }

    public PatAppData(String docImgUrl, String docName, String docSpecialisation, String patName, Integer patAge, String patAddress, String date, String slot) {
        this.docImgUrl = docImgUrl;
        this.docName = docName;
        this.docSpecialisation = docSpecialisation;
        this.patName = patName;
        this.patAge = patAge;
        this.patAddress = patAddress;
        this.date = date;
        this.slot = slot;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocSpecialisation() {
        return docSpecialisation;
    }

    public void setDocSpecialisation(String docSpecialisation) {
        this.docSpecialisation = docSpecialisation;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public Integer getPatAge() {
        return patAge;
    }

    public void setPatAge(Integer patAge) {
        this.patAge = patAge;
    }

    public String getPatAddress() {
        return patAddress;
    }

    public void setPatAddress(String patAddress) {
        this.patAddress = patAddress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public PatAppData() {

    }



    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("slot")
    @Expose
    private String slot;
}
