import java.util.*;
public class reverse{
    public static void main(String args[]){
     int num,rev=0,rem,temp;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");
     num=sc.nextInt();
     temp=num;
     while(num!=0){
     rem=num%10;
     rev=(rev*10)+rem;
     num=num/10;
     }
     System.out.println("reverse of "+temp+" is "+rev);
    }
}