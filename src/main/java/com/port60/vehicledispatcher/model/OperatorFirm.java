package com.port60.vehicledispatcher.model;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * A company can trade under multiple names locally
 * or it can be based in multiple cities, so we want to allow companies to align
 * there driver network across multiple cities.
 */
@Data
public class OperatorFirm {

  private Long id;

  private String name;

  private Address address;

  private String operatorLicence;

  private LocalDateTime operatorLicenceExpiryDate;

  private Company company;

  private boolean isEvidenceUpToDate;

}
