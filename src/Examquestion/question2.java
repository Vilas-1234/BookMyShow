package Examquestion;

import java.util.Arrays;

public class question2 {
    public static void main(String[] args) {

    question2 s= new question2 ();
    s.show ();

    }
    public void show(){
       int arr[]={2,5,4,7,8,0,3,1,0,6};
       int n=2,j;
//        Arrays.sort(arr);
//        for (int i = 0; i <arr.length ; i++) {
////            System.out.println (arr[i] );
//        }
        for (int i = 0; i <n; i++) {
            int first=arr[0];
            for ( j = 0; j < arr.length-1; j++) {
                arr[j]=arr[i+1];
                arr[j]=first;
                System.out.print(arr[j]+"\n");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[i] );
        }
    }
}
