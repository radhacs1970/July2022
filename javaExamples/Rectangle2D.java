
public class Rectangle2D extends Shape2D{

  {
    borderColor = " blue ";
    fillcolor = "green";
  }
  @Override
  void draw2d() {
     System.out.println(" Drawing rectangle with shade "+
      " in 2D ");
  }

  @Override
  void draw() {
    System.out.println(
        "implementing draw border color "+
    borderColor);
  }

  @Override
  void fillshape() {
    System.out.println(" fill shape with color " +
          fillcolor);

  }

}