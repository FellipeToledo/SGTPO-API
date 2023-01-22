package com.spring.sgtpoapi.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsortiumEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  @Column(nullable = false)
  public String name;

  @Column(nullable = false)
  public String cnpj;

  @Column(nullable = false)
  public String juridicalNature;

  @Column(nullable = false)
  @JsonFormat(pattern = "yyyy-MM-dd")
  public Date openingDate;

  @Column(nullable = false)
  public String address;
}
