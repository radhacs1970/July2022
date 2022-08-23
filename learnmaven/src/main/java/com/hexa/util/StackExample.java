package com.hexa.util;

import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    Stack<Character> sc = new Stack<Character>();
    sc.push('Q');
    sc.push('U');
    sc.push('I');
    sc.push('C');
    sc.push('K');

    System.out.println(sc);
    sc.pop();
    System.out.println("top of the stack is " + sc.peek());
    System.out.println(" search of K is " + sc.search('K'));
    System.out.println(" search of U is " + sc.search('U'));
    System.out.println("first element is " + sc.firstElement());
    System.out.println("last element is " + sc.lastElement());
  }
}