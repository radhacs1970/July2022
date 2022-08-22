package com.hexa;

// mvn exec:java -Dexec.mainClass=com.hexa.Cricket
public class Cricket {
  private int numPlayers;
  private String testMatch;

  public Cricket(int numPlayers, String testMatch) {
    this.numPlayers = numPlayers;
    this.testMatch = testMatch;
  }

  public int getNumPlayers() {
    return numPlayers;
  }

  public void setNumPlayers(int numPlayers) {
    this.numPlayers = numPlayers;
  }

  public String getTestMatch() {
    return testMatch;
  }

  public void setTestMatch(String testMatch) {
    this.testMatch = testMatch;
  }

  @Override
  public String toString() {
    return "Cricket [numPlayers=" + numPlayers + ", testMatch=" + testMatch + "]";
  }
  
  public static void main(String[] args) {
    Cricket cOne = new Cricket(11,"EngVsIndia");
    Cricket cTwo = new Cricket(14, "AusvsNewzealand");

    System.out.println(cOne.toString());
    System.out.println(cTwo);
  }
  
}