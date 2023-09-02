package NareshITcollection;
import java.util.Scanner;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,4,3,2,1};
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<arr.length; j++) {
                if ((arr[i] == arr[j]) && (i!=j)) {
                    count++ ;
                }
            }
            System.out.println (count );
            if(count==0) {
                System.out.println(arr[i]);
            }
        }
            }
        }
