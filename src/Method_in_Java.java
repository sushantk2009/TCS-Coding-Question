import java.util.Scanner;
public class Method_in_Java{
    static int Logic(int x,int y){
        int z;
        if(x>y){
            z=x*y;
        }
        else {
            z=x+y;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int a= sc.nextInt();
        System.out.print("Enter B number ");
        int b=sc.nextInt();
        int c= Logic(a,b);
        System.out.println(c);

    }
}