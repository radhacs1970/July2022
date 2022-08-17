import zoo.Animal;
import zoo.Cat;
import zoowild.Tiger;


public class TestAnimal {
  public static void main(String[] args) {
    
    Animal a1 = new Animal();
    System.out.println(a1);
    //a1.whatIEat();

    Cat c1 = new Cat("pinkie",4,"gray");
    System.out.println(c1);
    c1.catPublicMethod();
    

    Tiger t1 = new Tiger("harry",4,"gray");
    t1.catPublicMethod();
    t1.makeSound();


    Animal a2 = new Tiger("genie",4,"yellow");
    a2.setName("genius");

    Cat c2 = (Cat)a2;
    c2.getMyLocation();
    Tiger t2 = (Tiger) a2;
    t2.getMyLocation();
  }
}