class ques6{ 
	static String str;  
	int k;  
	 
  static{
  str = "training";
  System.out.println("static block is invoked");
  } 
 
  {
    System.out.println("initialiazation block");
     k = 5;
	System.out.println(" value of k is : "  + k );
  }
 
  public static void main(String args[]){ 
		int m; 
		ques6  anything = new ques6(); 
		ques6  as1 = new ques6(); 
	
   System.out.println("Hello main");  
   System.out.println(str);
  }  
}  

/*
static block is invoked
initialiazation block
value of k is : 5
initialiazation block
value of k is : 5
Hello main
training
*/
