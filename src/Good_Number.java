import java.util.Scanner;

public class Good_Number {
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;int sum=0;
        while(n>0)
        {
            sum=sum+(n%10);

            n/=10;
        }
        if(temp%sum==0)
            System.out.println("Good");
        else
            System.out.println("Bad");

    }
}