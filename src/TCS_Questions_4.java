import java.util.Scanner;

//TCS Coding Question - 4
//Prime Number: Write a code to check whether no is prime or not. Condition use function check() to find whether entered no is positive or
// negative,if negative then enter the no, And if yes pas no as a parameter to prime() and check whether no is prime or not?
//
//Explantion : A number that is divisible by only and only 1 and itself is known as a Prime Number.
//For example: 11 is only divisible by 1, so 11 is prime, while 10 is divisible by 1, 2, and 5 so 10 is not a prime number.
public class TCS_Questions_4 {
    static void check(int num){
        if(num<0){
            System.out.println("The number is negative... please enter the positive number");
        }
        else {
            prime(num);

        }
    }
    static void prime(int num){
        if(num <=1){
            System.out.println(num +"is not a prime number. ");
            return;
        }

        Boolean isprime=true;
        for(int i=2; i<=num/2;i++){
            if (num % 2 ==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println(num+"The number is prime number. ");
        }else {
            System.out.println(num+"The number is not a prime.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :-");
        int number =sc.nextInt();
        check(number);

    }
}
