package com.uberdemo.bookride.vo;

import javax.persistence.Column;

public class BookedRideDetails {

  private String carNo;
  private float actualPrice;
  private float disPrice;
  private int maxPerson;
  private String type;
  private long dropTime;
  private String message;
  private DriverDetails driverDetails;

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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getDropTime() {
    return dropTime;
  }

  public void setDropTime(long dropTime) {
    this.dropTime = dropTime;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DriverDetails getDriverDetails() {
    return driverDetails;
  }

  public void setDriverDetails(DriverDetails driverDetails) {
    this.driverDetails = driverDetails;
  }
}

class DriverDetails {

  String name;
  String mobileNo;
  float rating;

}
