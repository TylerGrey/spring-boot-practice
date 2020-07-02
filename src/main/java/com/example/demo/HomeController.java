package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @Autowired
  BldgService bldgService;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public List<Bldg> helloString() {

    return bldgService.test();
  }

}