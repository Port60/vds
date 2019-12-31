package com.port60.vehicledispatcher.model;

import java.util.List;
import lombok.Data;

@Data
public class Driver {

  private Long id;

  private String name;

  private Address address;

  private OperatorFirm firm;

  // typically the local council registration id
  private String authorityId;

  // the local council name
  private String authorityName;

  private DRIVER_TYPE driverType;

  // A driver can have more than one licence, i.e for a car and a minibus, or a bus
  // Licences must correlate with issuing country guidelines
  private List<DrivingLicence> drivingLicences;

  private boolean evidenceUpToDate;

  private WorkingShift workingShift;

  /**
   * This helps determine if the driver is allowed to be assigned
   * during the time.
   */

  private SHIFT_FLEXIBILITY shiftFlexibility;
}
