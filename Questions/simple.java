
class simple  {
public static void main(String[ ] args) {
      simple obj = new simple( );
     obj.start( );
}
void start( ) {
  int [ ] P= {5,4,3};
  int [ ] Q= method (P);
  System.out.println (P[0] );
  System.out.println (Q[0]);
}
 int [ ] method (int [ ] R) {
    R [0]=7;
   return R;
}
}

Ans 7
7

