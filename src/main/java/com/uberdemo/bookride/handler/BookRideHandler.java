package com.uberdemo.bookride.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uberdemo.bookride.repository.DriverDetailsRepo;
import com.uberdemo.bookride.service.ServiceImpl;
import com.uberdemo.bookride.vo.BookRideVO;
import com.uberdemo.bookride.vo.BookedRideDetails;
import com.uberdemo.bookride.vo.DriverDetailsVO;
import com.uberdemo.bookride.vo.SearchRequestVO;

@Component
public class BookRideHandler {

  @Autowired ServiceImpl service;

  @Autowired DriverDetailsRepo driverDetailsRepo;

  public BookedRideDetails saveBookRide(SearchRequestVO searchRequestVO){
    BookRideVO bookRideVO = new BookRideVO();
    bookRideVO.setCarNo(searchRequestVO.getCarNo());
    bookRideVO.setDriverDetailsVO(driverDetailsRepo.getOne(1));
    bookRideVO.setActualPrice(searchRequestVO.getActualPrice());
    bookRideVO.setDisPrice(searchRequestVO.getDisPrice());
    service.saveBookRideInfo(bookRideVO);

    BookedRideDetails bookedRideDetails = new BookedRideDetails();
    bookedRideDetails.setCarNo(bookRideVO.getCarNo());
    return bookedRideDetails;
  }
}
