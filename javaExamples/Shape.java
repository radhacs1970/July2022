
public abstract class Shape {
  static String details = " All geometric figures";
  String borderColor = "black";
  String fillcolor;

  abstract void draw();
  abstract void fillshape();

  public void drawborder(){
    System.out.println("border is drawn using the color" +
      borderColor);
  }

}