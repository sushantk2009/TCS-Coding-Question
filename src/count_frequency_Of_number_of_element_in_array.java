import java.util.HashMap;
import java.util.Map;

public class count_frequency_Of_number_of_element_in_array {
    public static void main(String[] args) {


        int arr[]={10,5,4,2,10,4,10,6,10,5};
        Map<Integer,Integer> freqMap =new HashMap<>();
        for( int i=0;i<arr.length;i++){
            int num= arr[i];
                freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){

            System.out.println(entry.getKey()+" ---> "+ entry.getValue());
        }


    }
}
