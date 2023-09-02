package practical;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class demoarraysort {
    public static void main(String[] args) {
        demoarraysort dm= new demoarraysort ();
        dm.show ();
    }
     public void show() {
         int arr[] = {2, 5, 4, 7, 8, 6, 13, 9, 1, 0, 55, 44, 22, 11, 63, 98, 78};
         int temp;
         int flag=0;
         for (int i = 0; i < arr.length ; i++) {
             for (int j = 0; j < arr.length - 1; j++) {
                 if (arr[j] < arr[j+1 ]) {
                     temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     flag++;
                 }
             }
             if(flag==0){
                 break;
             }
         }
         for (int j = 0; j < arr.length; j++) {
             System.out.println (arr[j]);
         }

//         Arrays.sort (arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print (arr[i]+" ," );
//         }
//         System.out.println ( );
//         Arrays.parallelSort (arr,0,17 );
//         // parallel array sorting for the use of when u want to
//         // array sort a specific index position to  sort and to the...
//         System.out.println (Arrays.toString (arr));
         }
     }