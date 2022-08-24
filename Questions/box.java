 public class box extends String{
 int h;
 int w;
 int l;
 
 private box(){ }
 protected box( int h, int w){}
 public box (int h, int w , int l){ }
 }
class B{

 
public static void main(String[] args){
	  box bx = new box(10, 20);
	  System.out.println(bx);
}
}

Ans: Cannot extend from final String class  