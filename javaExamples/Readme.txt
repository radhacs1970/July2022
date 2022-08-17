1. Install jdk8
2. Install visual studio code 
3. maven
4. we will connecting with the database
5. mysql server, remember th username, password
6. mysql workbench




abstract class Shape { 
  abstract void draw();
  abstract void fillshape();
}
abstract class Shape2D extends Shape{
  abstract void draw(){
    sysout("draw any shape");
  }
  abstract void draw2d();

  final void draw2dLine(){
    sysout();
  }
}

class Rectangle extends Shape {

} // can be instantiated.
// this isa  concrete class

class Rectangle2D extends Shape2D {

  // I have implement the method 
    // fillshape(); and draw2D();
}// can be instantiated.
// this isa  concrete class



interface A{
  float PI = 3.14f;
  public void add();
  public void add ( int, int)
}
interface B extends A{
  public void multiply();
}

public class Calculate implements B{
  public void add(){
    return 1+ 1;
  }
  public void add(int a, int b){
    return a + b ;
  }
  public void multiply(){
    return 5*9;
  }
}