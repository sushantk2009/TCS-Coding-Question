//TCS Coding Question - 1
//        Consider the following series: 1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187....
//        This series is a mixture of 2 series : all the odd terms in this series form a geometric series and all the even terms form yet another geometric series.
//        Write a program to find the Nth term in the series.
//
//        Explantion : The value N is a positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than the value of the nth term, no other character/string or message should be written to STDOUT.
//        For example: if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.
//        You can assume that N will not exceed 30.
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
