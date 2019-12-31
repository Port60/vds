package com.port60.vehicledispatcher.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.port60.vehicledispatcher.model.Fare;
import java.util.Queue;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FareIngestServiceTest {


  private FareIngestService fareIngestService;

  @BeforeEach
  public void setup(){
    fareIngestService = new FareIngestService();
  }

  @Test
  void addFareToQueue() {
    Fare fare = new Fare();
    fare.setPickupLocation("A");

    fareIngestService.addFareToQueue(fare);

    Queue<Fare> fares = fareIngestService.getFares();
    assertThat(fares.size(), is(1));
  }

  @Test
  void fareIngestService_poll_returnsFirst() {
    Fare fare1 = new Fare();
    fare1.setPickupLocation("A");

    Fare fare2 = new Fare();
    fare2.setPickupLocation("B");

    fareIngestService.addFareToQueue(fare1);
    fareIngestService.addFareToQueue(fare2);

    Fare fare  = fareIngestService.dispatchFare();
    assertThat(fare.getPickupLocation(),is("A"));
  }

}
