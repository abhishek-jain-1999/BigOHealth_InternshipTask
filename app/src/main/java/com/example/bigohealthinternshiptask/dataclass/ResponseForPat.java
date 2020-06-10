package com.example.bigohealthinternshiptask.dataclass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseForPat {
    @SerializedName("data")
    @Expose
    private List<PatAppData> data;

    public List<PatAppData> getData() {
        return data;
    }

    public void setData(List<PatAppData> data) {
        this.data = data;
    }
}
