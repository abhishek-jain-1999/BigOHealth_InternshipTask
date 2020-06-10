package com.example.bigohealthinternshiptask.dataclass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class Response{
  @SerializedName("data")
  @Expose
  private List<Data> data;
  @SerializedName("city")
  @Expose
  private List<City> city;
  public void setData(List<Data> data){
   this.data=data;
  }
  public List<Data> getData(){
   return data;
  }
  public void setCity(List<City> city){
   this.city=city;
  }
  public List<City> getCity(){
   return city;
  }
}