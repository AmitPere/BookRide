package com.uberdemo.bookride.vo;

public class SearchRequestVO {

  Location fromLoc;
  Location toLoc;
  String type;
  String carNo;
  float actualPrice;
  float disPrice;
  int maxPerson;
  int driverId;
  int userId;

  public Location getFromLoc() {
    return fromLoc;
  }

  public void setFromLoc(Location fromLoc) {
    this.fromLoc = fromLoc;
  }

  public Location getToLoc() {
    return toLoc;
  }

  public void setToLoc(Location toLoc) {
    this.toLoc = toLoc;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCarNo() {
    return carNo;
  }

  public void setCarNo(String carNo) {
    this.carNo = carNo;
  }

  public float getActualPrice() {
    return actualPrice;
  }

  public void setActualPrice(float actualPrice) {
    this.actualPrice = actualPrice;
  }

  public float getDisPrice() {
    return disPrice;
  }

  public void setDisPrice(float disPrice) {
    this.disPrice = disPrice;
  }

  public int getMaxPerson() {
    return maxPerson;
  }

  public void setMaxPerson(int maxPerson) {
    this.maxPerson = maxPerson;
  }

  public int getDriverId() {
    return driverId;
  }

  public void setDriverId(int driverId) {
    this.driverId = driverId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
