package com.example.bigohealthinternshiptask.dataclass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Data{
  @SerializedName("city")
  @Expose
  private String city;
  @SerializedName("doc_fee")
  @Expose
  private Integer doc_fee;
  @SerializedName("about")
  @Expose
  private String about;
  @SerializedName("doc_middlename")
  @Expose
  private String doc_middlename;
  @SerializedName("language_id")
  @Expose
  private Integer language_id;
  @SerializedName("experience")
  @Expose
  private Integer experience;
  @SerializedName("numBeds")
  @Expose
  private Integer numBeds;
  @SerializedName("doc_url")
  @Expose
  private String doc_url;
  @SerializedName("searchTerm")
  @Expose
  private String searchTerm;
  @SerializedName("doc_firstname")
  @Expose
  private String doc_firstname;
  @SerializedName("address_line2")
  @Expose
  private String address_line2;
  @SerializedName("address_line1")
  @Expose
  private String address_line1;
  @SerializedName("doc_img_url")
  @Expose
  private String doc_img_url;
  @SerializedName("rank")
  @Expose
  private Integer rank;
  @SerializedName("state")
  @Expose
  private String state;
  @SerializedName("landmark")
  @Expose
  private String landmark;
  @SerializedName("ayush")
  @Expose
  private Integer ayush;
  @SerializedName("doc_discounted_fee")
  @Expose
  private Integer doc_discounted_fee;
  @SerializedName("doc_lastname")
  @Expose
  private String doc_lastname;
  @SerializedName("pincode")
  @Expose
  private Integer pincode;
  @SerializedName("from_hospital")
  @Expose
  private Integer from_hospital;
  @SerializedName("NumRating")
  @Expose
  private Integer NumRating;
  @SerializedName("hospital_id")
  @Expose
  private String hospital_id;
  @SerializedName("firebase_token")
  @Expose
  private String firebase_token;
  @SerializedName("doc_id")
  @Expose
  private String doc_id;
  @SerializedName("book_appt")
  @Expose
  private Integer book_appt;
  @SerializedName("qualification")
  @Expose
  private String qualification;
  @SerializedName("onlinePayFee")
  @Expose
  private Integer onlinePayFee;
  @SerializedName("specialisation")
  @Expose
  private String specialisation;
  @SerializedName("TotalRatings")
  @Expose
  private Integer TotalRatings;
  @SerializedName("general_slot")
  @Expose
  private String general_slot;
  @SerializedName("awards")
  @Expose
  private String awards;
  public void setCity(String city){
   this.city=city;
  }
  public String getCity(){
   return city;
  }
  public void setDoc_fee(Integer doc_fee){
   this.doc_fee=doc_fee;
  }
  public Integer getDoc_fee(){
   return doc_fee;
  }
  public void setAbout(String about){
   this.about=about;
  }
  public String getAbout(){
   return about;
  }
  public void setDoc_middlename(String doc_middlename){
   this.doc_middlename=doc_middlename;
  }
  public String getDoc_middlename(){
   return doc_middlename;
  }
  public void setLanguage_id(Integer language_id){
   this.language_id=language_id;
  }
  public Integer getLanguage_id(){
   return language_id;
  }
  public void setExperience(Integer experience){
   this.experience=experience;
  }
  public Integer getExperience(){
   return experience;
  }
  public void setNumBeds(Integer numBeds){
   this.numBeds=numBeds;
  }
  public Integer getNumBeds(){
   return numBeds;
  }
  public void setDoc_url(String doc_url){
   this.doc_url=doc_url;
  }
  public String getDoc_url(){
   return doc_url;
  }
  public void setSearchTerm(String searchTerm){
   this.searchTerm=searchTerm;
  }
  public String getSearchTerm(){
   return searchTerm;
  }
  public void setDoc_firstname(String doc_firstname){
   this.doc_firstname=doc_firstname;
  }
  public String getDoc_firstname(){
   return doc_firstname;
  }
  public void setAddress_line2(String address_line2){
   this.address_line2=address_line2;
  }
  public String getAddress_line2(){
   return address_line2;
  }
  public void setAddress_line1(String address_line1){
   this.address_line1=address_line1;
  }
  public String getAddress_line1(){
   return address_line1;
  }
  public void setDoc_img_url(String doc_img_url){
   this.doc_img_url=doc_img_url;
  }
  public String getDoc_img_url(){
   return doc_img_url;
  }
  public void setRank(Integer rank){
   this.rank=rank;
  }
  public Integer getRank(){
   return rank;
  }
  public void setState(String state){
   this.state=state;
  }
  public String getState(){
   return state;
  }
  public void setLandmark(String landmark){
   this.landmark=landmark;
  }
  public String getLandmark(){
   return landmark;
  }
  public void setAyush(Integer ayush){
   this.ayush=ayush;
  }
  public Integer getAyush(){
   return ayush;
  }
  public void setDoc_discounted_fee(Integer doc_discounted_fee){
   this.doc_discounted_fee=doc_discounted_fee;
  }
  public Integer getDoc_discounted_fee(){
   return doc_discounted_fee;
  }
  public void setDoc_lastname(String doc_lastname){
   this.doc_lastname=doc_lastname;
  }
  public String getDoc_lastname(){
   return doc_lastname;
  }
  public void setPincode(Integer pincode){
   this.pincode=pincode;
  }
  public Integer getPincode(){
   return pincode;
  }
  public void setFrom_hospital(Integer from_hospital){
   this.from_hospital=from_hospital;
  }
  public Integer getFrom_hospital(){
   return from_hospital;
  }
  public void setNumRating(Integer NumRating){
   this.NumRating=NumRating;
  }
  public Integer getNumRating(){
   return NumRating;
  }
  public void setHospital_id(String hospital_id){
   this.hospital_id=hospital_id;
  }
  public String getHospital_id(){
   return hospital_id;
  }
  public void setFirebase_token(String firebase_token){
   this.firebase_token=firebase_token;
  }
  public String getFirebase_token(){
   return firebase_token;
  }
  public void setDoc_id(String doc_id){
   this.doc_id=doc_id;
  }
  public String getDoc_id(){
   return doc_id;
  }
  public void setBook_appt(Integer book_appt){
   this.book_appt=book_appt;
  }
  public Integer getBook_appt(){
   return book_appt;
  }
  public void setQualification(String qualification){
   this.qualification=qualification;
  }
  public String getQualification(){
   return qualification;
  }
  public void setOnlinePayFee(Integer onlinePayFee){
   this.onlinePayFee=onlinePayFee;
  }
  public Integer getOnlinePayFee(){
   return onlinePayFee;
  }
  public void setSpecialisation(String specialisation){
   this.specialisation=specialisation;
  }
  public String getSpecialisation(){
   return specialisation;
  }
  public void setTotalRatings(Integer TotalRatings){
   this.TotalRatings=TotalRatings;
  }
  public Integer getTotalRatings(){
   return TotalRatings;
  }
  public void setGeneral_slot(String general_slot){
   this.general_slot=general_slot;
  }
  public String getGeneral_slot(){
   return general_slot;
  }
  public void setAwards(String awards){
   this.awards=awards;
  }
  public String getAwards(){
   return awards;
  }
}