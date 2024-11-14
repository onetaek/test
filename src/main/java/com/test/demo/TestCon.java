package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCon {


  @GetMapping("test")
  public String test() {
    return "test";
  }
}
