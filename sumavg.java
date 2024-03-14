import java.util.*;
public class sumavg
{
    public static void main(String args[]){
        int limit,number,sum=0;
        System.out.println("Enter the limit of the numbers:");
        Scanner sc=new Scanner(System.in);
        limit=sc.nextInt();
        for(int i=1;i<=limit;i++){
            System.out.println("Enter "+i+" th Number:");
            number=sc.nextInt();
            sum=sum+number;
        }
        System.out.println("Sum of given numbers:"+sum);
        System.out.println("Average of given numbers:"+sum/limit);
    }
}