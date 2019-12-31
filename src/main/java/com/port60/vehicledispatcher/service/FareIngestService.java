package com.port60.vehicledispatcher.service;

import com.port60.vehicledispatcher.model.Fare;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import org.springframework.stereotype.Service;

@Service
public class FareIngestService {

  private Queue<Fare> fareQueue = new LinkedList<>();

  public void addFareToQueue(Fare fare) {
    fareQueue.add(fare);
  }

  public Fare dispatchFare() {
    return fareQueue.poll();
  }


  public Queue<Fare> getFares() {
    return fareQueue;
  }
}
