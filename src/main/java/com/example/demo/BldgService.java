package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BldgService {
  @Autowired
  private BldgRepository repogitory;

  public List<Bldg> test() {
    List<Bldg> response = new ArrayList<>();
    repogitory.findAll().forEach(e -> response.add(e));

    return response;
  }
}