import java.util.*;
public class fibo{
    public static void main(String args[]){
      int num1=-1,num2=1,num3,limit,i;
      System.out.println("Enter the limit of fibonachi series:");
      Scanner sc=new Scanner(System.in);
      limit=sc.nextInt();
      for(i=1;i<=limit;i++){
        num3=num1+num2;
        System.out.print(num3+" ");
        num1=num2;
        num2=num3;
      }
    }
}