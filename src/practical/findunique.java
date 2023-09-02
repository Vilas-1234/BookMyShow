package practical;

import java.util.Scanner;

public class findunique {
    public static void main(String[] args) {
        findunique un = new findunique ( );
        un.show ( );
    }

    public void show() {
//        Scanner sc= new Scanner (System.in);
//        System.out.println (" enter the array size" );
//        int size=sc.nextInt ();
//        int arr[]=new int[size];
//        System.out.println ("enter the array elements" );
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt ();
//        }
        int arr[] = {1, 2, 3, 4,3, 5, 6, 7, 8, 9, 6, 5, 4,3,3, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j])&&(i!=j)) {
                    count++;
                }
            }
            if(count==0){
                System.out.println (arr[i] );
            }
        }
    }
}
