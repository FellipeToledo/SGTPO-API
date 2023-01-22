package com.spring.sgtpoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sgtpoapi.Repository.ConsortiumRepository;
import com.spring.sgtpoapi.entity.ConsortiumEntity;

@RestController
@RequestMapping("/consortiums")
public class ConsortiumController {

  @Autowired
  private ConsortiumRepository consortiumRepository;

  @GetMapping
  public List<ConsortiumEntity> listAll() {
    return consortiumRepository.findAll();
  }

  @PostMapping
  public ConsortiumEntity save(@RequestBody ConsortiumEntity consortiumEntity) {
    return consortiumRepository.save(consortiumEntity);

  }

}
