package com.uberdemo.bookride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uberdemo.bookride.handler.BookRideHandler;
import com.uberdemo.bookride.vo.BookedRideDetails;
import com.uberdemo.bookride.vo.SearchRequestVO;

@RestController
public class BookRideController {
  @Autowired BookRideHandler bookRideHandler;

  @PostMapping("/bookRide")
  @ResponseBody
  public BookedRideDetails bookRide(@RequestBody SearchRequestVO searchRequestVO){
      return bookRideHandler.saveBookRide(searchRequestVO);
  }
}
