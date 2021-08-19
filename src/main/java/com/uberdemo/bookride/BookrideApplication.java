package com.uberdemo.bookride;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BookrideApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(BookrideApplication.class, args);
  }

  @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return super.configure(builder);
  }
}
