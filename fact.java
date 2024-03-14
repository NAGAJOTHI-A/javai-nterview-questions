import java.util.*;
public class fact{
    public static void main(String args[]){
      int f=1,n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      n=sc.nextInt();
      for(i=1;i<=n;i++){
        f=f*i;
      }
      System.out.println("factorial of "+n+" is "+f);
    }
}
