package zoowild;

import zoo.Cat;

public class Tiger extends Cat {
  String zooname;
  public Tiger(String name, int legs, String color) {
    super(name, legs, color);
     zooname = "vandalur";
  }

  public void makeSound(){
    System.out.println("grrrr  roaring");
  }

  public void getMyLocation(){
    System.out.println(" I live in the zoo called " 
      + this.zooname);
  }

}