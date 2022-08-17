/*
Create a car with the speed, mileage, numofgears, model and brand
use no arg constructor to initialize numofgears and mileage.
use three arg constructor to initialize speed, mileage, numofgears
use instance block to initialize model and brand
create carFord  object  with no arg
create car audi with three arg
add appropriate getter and setter
change the numofgears in audi to 10
change the brand of carFord to kia.
display the attributes using toString method.
*/

public class Car{
  private int speed;
  private float mileage;
  private int numOfgears;
  private String model;
  private String brand;

  public Car(){
    numOfgears = 4;
    mileage = 17.5f;
    System.out.println( "Car no args is called ");
  }
  public Car ( int speed, float mileage, int numOfgears){
    this.speed = speed;
    this.mileage= mileage;
    this.numOfgears= numOfgears;
  }

  {
    System.out.println(" inside instance bloc");
    brand = " Maruthi";
    model = "WagonR";
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public float getMileage() {
    return mileage;
  }

  public void setMileage(float mileage) {
    this.mileage = mileage;
  }

  public int getNumOfgears() {
    return numOfgears;
  }

  public void setNumOfgears(int numOfgears) {
    this.numOfgears = numOfgears;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Car [brand=" + brand + ", mileage=" + mileage + ", model=" + model + ", numOfgears=" + numOfgears
        + ", speed=" + speed + "]";
  }  
/*  public static void main(String[] args) {
    Car carFord = new Car();
    Car carAudi = new Car(150,11.5f,5);
     
    carAudi.setNumOfgears(10);
    carFord.setBrand("kia");

    System.out.println(carAudi);
    System.out.println(carFord.toString());
  }*/
}