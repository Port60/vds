package com.port60.vehicledispatcher.model;

import java.util.List;
import lombok.Data;

@Data
public class Company {

  private Long id;

  private String companyName;

  private Address address;

  private List<OperatorFirm> operatorFirms;


}
