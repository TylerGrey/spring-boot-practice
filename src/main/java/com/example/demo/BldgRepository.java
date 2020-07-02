package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface BldgRepository extends CrudRepository<Bldg, Long> {

  Bldg findById(long id);
}