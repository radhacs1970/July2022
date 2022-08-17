package zoo;

public class Animal {
  private String name;
  private int legs;

  public Animal() {
    this.name="NoAnimal";
    this.legs = -1;
  }

  public Animal(String name, int legs) {
    this.name = name;
    this.legs = legs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  @Override
  public String toString() {
    return "Animal class : [name=" + name +
       ", legs=" + legs + "]";
  }

  private void whereILive(){
      System.out.println(" Where I Live is a private method");
  }
  
  protected void makeSound(){
    System.out.println("oooops its protected");
  }

  void whatIEat(){
    System.out.println( " Animal's class eat everthing, which is default");
  }
}