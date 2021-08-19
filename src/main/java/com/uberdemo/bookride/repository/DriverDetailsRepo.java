package com.uberdemo.bookride.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uberdemo.bookride.vo.DriverDetailsVO;

public interface DriverDetailsRepo extends JpaRepository<DriverDetailsVO, Integer> {

  @Override DriverDetailsVO getOne(Integer id);
}
