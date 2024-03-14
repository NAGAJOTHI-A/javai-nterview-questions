import java.util.*;
public class amstrong{
 public static void main(String args[]){
    int num,temp,rem,cube1,cube2,cube3,sum;
    System.out.println("Enter the Amstrong Number:");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    temp=num;
    rem=num%10;
    cube1=rem*rem*rem;
    num=num/10;
    rem=num%10;
    cube2=rem*rem*rem;
    num=num/10;
    rem=num%10;
    cube3=rem*rem*rem;
    sum=cube1+cube2+cube3;
    if(sum==temp){
    System.out.println(temp+" is a Amstrong Number");
    }
    else{
    System.out.println(temp+" is Not a Amstrong Number");
    }
 }
}