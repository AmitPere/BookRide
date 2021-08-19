package com.uberdemo.bookride.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uberdemo.bookride.repository.BookRideRepo;
import com.uberdemo.bookride.vo.BookRideVO;

@Service
public class ServiceImpl implements IService {

  @Autowired BookRideRepo bookRideRepo;

  @Override public long saveBookRideInfo(BookRideVO bookRideVO) {
    return bookRideRepo.save(bookRideVO).getId();
  }
}
