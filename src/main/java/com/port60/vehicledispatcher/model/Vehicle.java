package com.port60.vehicledispatcher.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Vehicle {

  private String registrationNumber;

  private LocalDateTime motDate;

  private LocalDateTime authorityTestDate;

  private LocalDateTime annualTaxDate;

  private String insuranceCompanyName;

  private String insurancePolicyNumber;

  private LocalDateTime insuranceExpiryDate;

}
