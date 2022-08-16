
public class ArraysExample {
  public static void main(String[] args) {
    int[] a1;
    a1 = new int[3];
    a1[0] = 100;
    a1[1] = 200;
    a1[2] = 300;

    int[] a2 = new int[]{1,2,3};

    int[] a3 = new int[5];
    a3[0] = 111;
    a3[1] = 222;
    a3[2] = 333;
    a3[3] = 444;
    a3[4] = 555;

    for ( int k: a1)
      System.out.println("value in a1 is "+ k );
    for ( int k: a2)
      System.out.println("value in a2 is "+ k );
    for ( int k: a3)
      System.out.println("value in a3 is "+ k );
  }

}