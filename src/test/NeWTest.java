package test;

import java.util.*;
import java.util.stream.Collectors;

public class NeWTest {
   // Count Occurrences: Write a function in Java to count the occurrences of
    // each element in an array and return the
    // counts as a map.

    public static void main(String[] args) {
//        String str="vilasvilas";
//        int arr[]=new int[256];
//        HashMap hash= new HashMap ();
//        for (int i = 0; i < str.length (); i++) {
//            arr[str.charAt (i)]=arr[str.charAt (i)]+1;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j]>0){
//                  //  System.out.println ((char)j+" occures in "+ arr[j]+" times ");
//                    hash.put ((char)j,arr[j]);
//
//                }
//            }
//        }
//        System.out.println (hash);


//        List<String> strings = Arrays.asList("apple", "banana", "car", "dog", "elephant");
//        System.out.println ( strings.stream ().Bo.collect (Collectors.groupingBy (Collectors.counting ()
//               ));




            int[] arr1 = {1, 2, 3, 4, 2, 3, 1, 1, 4, 4, 5};
            Map<Integer, Integer> occurrences = countOccurrences(arr1);

            for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time");
            }
        }

    public static Map<Integer, Integer> countOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        return occurrences;
    }
}
