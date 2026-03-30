import java.util.*;
public class gym_subscriotiion_System {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int months;
        int amount=0;
        System.out.print("Enter the month of membership : ");
        months=sc.nextInt();

        if (months == 1){
            amount=2000;
        }
        else if(months>=2 && months<=3){
            amount=5000;
        }
        else if(months>=4 && months <=6){
            amount=9000;
        }
        else if (months>=7 && months<=9){
            amount=12000;
        }
        else if (months>=10 && months<=12){
            amount =15000;
        }
        else {
            System.out.println("Error");
            return;
        }
        System.out.println("Membership amount in rupees is : "+ amount);

    }
}
