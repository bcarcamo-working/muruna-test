package com.muruna.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Phone {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;

 private String number;
 private String citycode;
 private String countrycode;
}
