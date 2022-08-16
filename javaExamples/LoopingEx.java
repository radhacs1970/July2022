import java.util.Scanner;

public class LoopingEx {
 public static void main(String[] args) {
  for ( int j = 0; j <=5; j++ ){
    System.out.println( "using for loop "+ j);
  }
  int k = 6;
  for (; k<=10; k++)
    System.out.println( "using for second loop "+ k);
  
  k = 20;
  for ( ;k<50;){
    System.out.println( "using for third loop "+ k);
    k += 5;
  }
  // infinite loop
  int i = 0;

  for ( ;; ){
    if ( i >=3 )
      break;
    i++;
    System.out.println( "infinite loop in for " );
  }
  i = 0;
  for ( ;; ){
    i++;
    System.out.println(" first line in the loop");
    if ( i %2 == 0)
      continue;
    System.out.println( " odd number " + i);
    if( i > 10)
      break;
  }

  // while loop example
  String[] colors; // declare array variable
  colors = new String[5];  // String 5 references
  int count = 0;
  Scanner sc = new Scanner(System.in);
  while ( count < 5 ){
    System.out.println( " Enter a color: ");
    colors[count] =  sc.nextLine();
    count ++;
  }
  count = 0;
  do {
    System.out.println( " Color is " + colors[count]);
    count ++;
  } while (count < 5);
} 
}