package com.example.bigohealthinternshiptask.dataclass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class City{
  @SerializedName("city")
  @Expose
  private String city;
  public void setCity(String city){
   this.city=city;
  }
  public String getCity(){
   return city;
  }
}