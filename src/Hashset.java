import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class Hashset{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
//        creating hashset
         HashSet<Integer> set =new HashSet<>();

//         insert in HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

//        Size of set
        System.out.println("Size of HashSet is "+set.size());

//        Print all Element
        System.out.println(set);

//        Search
        if(set.contains(1)) {
            System.out.println("It Contains element.");
        }
        else {
            System.out.println("Element not contains.");
        }

//        delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("Set does not contain: ");
        }

//        Iterate Elements

//        Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
        }