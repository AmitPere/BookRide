package com.uberdemo.bookride.vo;

import javax.persistence.*;


import com.uberdemo.bookride.utils.DbTables;

@Entity
@Table(name = DbTables.DRIVER_DETAILS)
public class DriverDetailsVO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "name")
  private String name;

  @Column(name = "add")
  private String add;

  @Column(name = "mobile_no")
  private String mobileNo;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAdd() {
    return add;
  }

  public void setAdd(String add) {
    this.add = add;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }
}
