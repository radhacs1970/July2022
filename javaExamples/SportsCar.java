// example for single inheritance
public class SportsCar extends Car {
  int numOfWheels;
  String tournament;

  
 
  @Override
  public String toString() {
    String str = "SubClas - SportsCar [numOfWheels=" + 
      numOfWheels + ", tournament=" + tournament + "]\r\n";
    //String str1 = super.toString(); // calling the parent
    String str1 = "Super class Car details [brand=" + getBrand() + 
      ", model=" + getModel() +
      ", numOfgears=" + getNumOfgears() +
     "]";
    str = str + str1;
    return str;
  }
  public SportsCar(){
    System.out.println( "SportsCar no args is called ");
  }
  public SportsCar(int numOfWheels, String tournament){
    /* super(100,10.5f,4);
    this.numOfWheels = numOfWheels;
    this.tournament= tournament; */
    // constructor overloading.
    this(100, 10.5f, 5, numOfWheels, tournament );
    
  }
  // constructor overloading.
  public SportsCar(int speed, float mileage, int numOfgears, 
       int numOfWheels, String tournament) {
    super(speed, mileage, numOfgears);
    this.numOfWheels = numOfWheels;
    this.tournament = tournament;
    System.out.println(" Sports car 5 Args ");
  }

  
}