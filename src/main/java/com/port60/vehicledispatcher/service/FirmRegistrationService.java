package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.Company;
import com.port60.vehicledispatcher.model.OperatorFirm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class FirmRegistrationService {

  /**
   * this will be a persistence store in real life
   */
    Map<Long,Company> companies = new HashMap<>();

    public Company registerFirm(Company company){
        companies.put(company.getId(), company);
        return company;
    }

    public Company addOperatorFirm(OperatorFirm operatorFirm){
      Company company = companies.get(operatorFirm.getCompany().getId());
      if(company.getOperatorFirms() == null){
        List<OperatorFirm> firms = new ArrayList<>();
        firms.add(operatorFirm);
        company.setOperatorFirms(firms);
      } else {
        company.getOperatorFirms().add(operatorFirm);
      }
      return company;
    }

}
