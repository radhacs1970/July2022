public class ques1
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("This is try block");
        }
        System.out.println("statement after try block");
 
        catch(Exception ex)
        {
            System.out.println("This is catch block");
        }
         System.out.println("statement after catch block");
        finally
        {
            System.out.println("This is finally block");
        }
    }
}

Ans: No statements between try close and catch start ...

