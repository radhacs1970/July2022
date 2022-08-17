
public class TestShapes {
  public static void main(String[] args) {
   /**** 
    //Shape s1 = new Shape(); // throws error
    
    Rectangle rc = new Rectangle();
    rc.draw();
    rc.fillshape();
    rc.drawRectwithdots();

    Shape sr = new Rectangle(); // works
    sr.draw();
    sr.fillshape();
    sr.drawborder();

    Rectangle r2 = (Rectangle)sr;
    r2.drawRectwithdots();
    //sr.drawRectwithdots(); // cannot access
  **/

  //Shape2D s2d = new Shape2D(); /// throws error cannot instantiate

    Rectangle2D r2d = new Rectangle2D();
    r2d.draw2dLine();

    System.out.println(Shape.details); // static variable.
  }
} 