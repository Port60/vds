package com.port60.vehicledispatcher.model;

import java.time.LocalDateTime;

public class DrivingLicence {

  /**
   * Issuing country and licence type should correlate
   */
  private String issuingCountry;

  private String driverLicenceNumber;

  private LocalDateTime driverLicenceExpiryDate;

  private LICENCE_TYPE licenceType;
}
