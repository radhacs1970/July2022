public interface Language{
	
	int count = 10; // public static final
	//private void writeEng();
	//protected String ReadRegional();
	public void  chatWithme(); //public abstract
	void playwithme(); // public abstract
}

class A {
	void disp(){
		System.out.println( " Displaying A");
	}
}  // overriding - overwriting
class B extends A {
	void disp(){
		System.out.println( " Displaying B Method ");
	}
}
public class inherit {
	public static void main(String[] args){
			 A b1 = new B();
			 b1.disp();
			 
	}
}
Ans: Displaying B Method
