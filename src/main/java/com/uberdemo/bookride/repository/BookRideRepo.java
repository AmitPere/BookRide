package com.uberdemo.bookride.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uberdemo.bookride.vo.BookRideVO;

public interface BookRideRepo extends JpaRepository<BookRideVO, Long> {

}
