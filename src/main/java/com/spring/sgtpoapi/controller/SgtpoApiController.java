package com.spring.sgtpoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sgtpoapi.Repository.SgtpoApiRepository;
import com.spring.sgtpoapi.entity.SgtpoApiEntity;

@RestController
@RequestMapping("/consortiums")
public class SgtpoApiController {

  @Autowired
  private SgtpoApiRepository sgtpoApiRepository;

  @GetMapping
  public List<SgtpoApiEntity> listar() {
    return sgtpoApiRepository.findAll();
  }


}
