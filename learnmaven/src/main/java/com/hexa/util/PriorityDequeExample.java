package com.hexa.util;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityDequeExample {
  public static void main (String[] args){
    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
    pQueue.offer(99);
    pQueue.offer(30);
    pQueue.offer(15);
    pQueue.offer(25);
    pQueue.offer(12);
    pQueue.offer(37);
    System.out.println(pQueue);

    System.out.println(" Peeking the queue "+ pQueue.peek());

    System.out.println(" remove from  the queue "+ pQueue.poll());
    System.out.println(" remove from  the queue "+ pQueue.poll());
    System.out.println(" remove from  the queue "+ pQueue.poll());
    System.out.println(" remove from  the queue "+ pQueue.poll());
    System.out.println(" remove from  the queue "+ pQueue.poll());
    
  }
}