
public abstract class Shape2D extends Shape{
  abstract void draw2d();

  final void draw2dLine(){
    System.out.println(
       " draw 2Dline using "+ borderColor);
  }
}