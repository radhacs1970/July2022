package com.hexa.util;

import java.util.PriorityQueue;

public class PriorityQueueCar {
  public static void main(String[] args) {
    PriorityQueue<Car> pQueue = new PriorityQueue<Car>();
    pQueue.offer(new Car(2022,"Sumo",1600000l));
    pQueue.offer(new Car(2010,"Audi",2600000l));
    pQueue.offer(new Car(2008,"Benze",1300000L));
    pQueue.offer(new Car(2009,"Amabasador",300000L));
    pQueue.offer(new Car(2018,"Celrio",300000L));


    System.out.println(pQueue.peek());
    System.out.println(pQueue.poll());
    System.out.println(pQueue.poll());
    System.out.println(pQueue.poll());
    System.out.println(pQueue.poll());
    System.out.println(pQueue.poll());
    System.out.println(pQueue.isEmpty());

    //System.out.println(pQueue);
  }
}