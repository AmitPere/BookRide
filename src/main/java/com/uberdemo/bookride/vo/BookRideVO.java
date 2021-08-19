package com.uberdemo.bookride.vo;

import javax.persistence.*;


import com.uberdemo.bookride.utils.DbTables;

@Entity
@Table(name = DbTables.BOOK_RIDE)
public class BookRideVO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "car_no")
  private String carNo;

  @Column(name = "actual_price")
  private float actualPrice;

  @Column(name = "dis_price")
  private float disPrice;

  @Column(name = "from_lat")
  private double fromLat;

  @Column(name = "to_lat")
  private double toLat;

  @Column(name = "from_lon")
  private double fromLon;

  @Column(name = "to_lon")
  private double toLon;

  @Column(name = "max_person")
  private int maxPerson;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "driver_id")
  private DriverDetailsVO driverDetailsVO;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id")
  private UserDetailsVO userDetailsVO;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public double getFromLat() {
    return fromLat;
  }

  public void setFromLat(double fromLat) {
    this.fromLat = fromLat;
  }

  public double getToLat() {
    return toLat;
  }

  public void setToLat(double toLat) {
    this.toLat = toLat;
  }

  public double getFromLon() {
    return fromLon;
  }

  public void setFromLon(double fromLon) {
    this.fromLon = fromLon;
  }

  public double getToLon() {
    return toLon;
  }

  public void setToLon(double toLon) {
    this.toLon = toLon;
  }

  public int getMaxPerson() {
    return maxPerson;
  }

  public void setMaxPerson(int maxPerson) {
    this.maxPerson = maxPerson;
  }

  public DriverDetailsVO getDriverDetailsVO() {
    return driverDetailsVO;
  }

  public void setDriverDetailsVO(DriverDetailsVO driverDetailsVO) {
    this.driverDetailsVO = driverDetailsVO;
  }

  public UserDetailsVO getUserDetailsVO() {
    return userDetailsVO;
  }

  public void setUserDetailsVO(UserDetailsVO userDetailsVO) {
    this.userDetailsVO = userDetailsVO;
  }
}
