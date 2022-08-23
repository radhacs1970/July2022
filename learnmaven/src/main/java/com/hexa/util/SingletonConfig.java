package com.hexa.util;

public class SingletonConfig {

  private String url;
  private String username;
  private String password;

  public static SingletonConfig sc = null;

  private SingletonConfig(){
    System.out.println( " Called only once...");
   url = "www.google.com";
   username = "radha";
   password = "Password123";
  }

  public static  SingletonConfig getSingletonConfig(){
    if ( sc == null )
      sc = new SingletonConfig();
    
    return sc;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}