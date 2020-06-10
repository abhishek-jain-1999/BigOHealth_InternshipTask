package com.example.bigohealthinternshiptask.dataclass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PatId {

    @SerializedName("PatId")
    @Expose
    private String patId;
    public void setPatId(String patId){
        this.patId = patId;
    }

    public PatId(String patId) {
        this.patId = patId;
    }

    public String getPatId(){
        return patId;
    }
}
