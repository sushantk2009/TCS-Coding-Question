import java.util.*;
public class Exception_Handling {
    public static void main (String[] args){


        int arr[]= new int [5];
        System.out.println("Hello word");

       // Alag alag exceptiom handel kr raha hai
//        try{
//            int result=5/0;
//            System.out.println(arr[5]);
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("try to access tha out of bond element ");
//        } catch(ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }




        // Ek Saath  2  ya 3 .... Exceptional handel karega
//        try{
//            System.out.println(arr[6]);
//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println("Handling the Exception.");
//        }

        //Sare Exception ko ek saath handel karise kre
        try {
            System.out.println(arr[7]);
        }catch (Exception e){
            System.out.println("All Exception Handled.");

        }
        System.out.println("Bye Guys");
    }
}
