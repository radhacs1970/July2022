public class ques10
{
    int m; 
    double n; 
    public ques10(int i)
    {        m = i;    }
 
    public ques10(double d)
    {        n = d;    }
 
    public static void main(String[] args)
    {
        ques10 a1 = new ques10(500); 
        ques10 a2 = new ques10(50.0); 
        System.out.println(a1.m+" : "+a1.n); 
        System.out.println(a2.m+" : "+a2.n);
    }
}
ANs: 500 : 0
0 : 50.0
