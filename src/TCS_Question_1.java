//1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187....
import java.util.Scanner;

public class TCS_Question_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number :");
        int N=sc.nextInt();
        Long Result;

        if (N % 2 == 1){
            Result =(long)Math.pow(2,(N-1)/2);
        }else {
            Result=(long)Math.pow(3,(N/2)-1 );
        }
        System.out.println("The "+N+"th Number of the series is :"+Result);


    }
}
