import java.util.Scanner;

public class gymManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int months;
        int amount = 0;

        System.out.print("Enter number of months for membership: ");
        months = sc.nextInt();

        if (months == 1) {
            amount = 2000;
        }
        else if (months >= 2 && months <= 3) {
            amount = 3000;
        }
        else if (months >= 4 && months <= 6) {
            amount = 7000;
        }
        else if (months > 6 && months <= 9) {
            amount = 12000;
        }
        else if (months > 9 && months <= 12) {
            amount = 15000;
        }
        else {
            System.out.println("Invalid membership duration!");
            return;
        }

        System.out.println("Membership Amount: ₹" + amount);
    }
}