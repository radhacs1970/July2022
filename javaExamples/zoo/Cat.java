package zoo;

public class Cat extends Animal {
  private String color;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  {
    this.color = "black";
  }
  
  public Cat(String name, int legs, String color) {
    super(name, legs);
    this.color = color;
  }

  @Override
  public String toString() {
    String str =  "Cat class [color=" + color + "]";
    String st1 = super.toString();
    return str + "    " + st1 ;
  }

  public void catPublicMethod(){
    makeSound();
    whatIEat();
  }
  

  protected void makeSound(){
    System.out.println("meouuu");
  }
}