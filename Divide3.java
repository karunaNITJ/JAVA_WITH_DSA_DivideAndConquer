import java.util.Arrays;
import java.util.*;

  public class Divide3 { 
    public static void main(String[] args) {
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < 0) {
                negative.add(arr[i]);
            }
            else {
                positive.add(arr[i]);
            }
        }
        negative.addAll(positive);
        
       for(int i =0;i<negative.size();i++) {
        System.out.print(negative.get(i)+" ");
       }
       // System.out.println(Arrays.toString(arr));
    }
}
