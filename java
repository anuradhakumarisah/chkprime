import java.util.*;

class ChkPrime{
  public static void main(String args[])
    {
      int i,c=0,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to check :");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        if(n%i==0)
          {
            c++;
          }
      }
      if(c==2)
        {
          System.out.println("Prime number ");
        }
      else
      {
        System.out.println(" not prime");
      }
    }
}
