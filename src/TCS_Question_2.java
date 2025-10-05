//TCS Coding Question - 2
//Oddly Even:
//Given a maximum of 100 digit numbers as input, find the difference between the
// sum of odd and even position digits.
// Case 1:
//Input: 4567
//Expected Output: 2
//Explantion : Odd positions are 4 and 6 as they are pos: 1 and pos: 3, both have sum 10.
// Similarly, 5 and 7 are at even positions pos: 2 and pos: 4 with sum 12. Thus, difference is 12 - 10 = 2

import java.util.Scanner;

public class TCS_Question_2 {
    public static void main(String[] arg){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number = ");
        String number =sc.nextLine();

        int sumeven=0;
        int sumodd=0;
        for (int i=0; i<number.length();i++){
            int value =number.charAt(i)-'0';

            if((i+1) % 2 == 0){
                sumeven=sumeven+value;
            }
            else {
                sumodd=sumodd+value;
            }

        }
        System.out.print("Evan - Odd = ");
        System.out.println(Math.abs(sumeven-sumodd));

    }
}
