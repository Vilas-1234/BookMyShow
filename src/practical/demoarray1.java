package practical;

import java.util.SortedSet;
import java.util.TreeSet;

public class demoarray1 {
    public static void main(String[] args) {
demoarray1 dm= new demoarray1 ();
//dm.uniqnumber ();
dm.uniqenumb1();
    }
//    public void uniqnumber(){
//        int arr[]={1,2,4,3,1,5,7,8,11,5,87,100,9,21,6};
//        int arr1[]={2,5,7,4,3,1,99,5,8,62,1,8,4,3,1,55,1,2,1};
//        boolean b=false;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if(arr[i]==arr1[j]){
//                    b=true;
//                }
//            }
//            if(b==false){
//                System.out.println (arr[i] );
//            }else {
//                b=false;
//            }
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr1[i]==arr[j]&&(i!=j)){
//                    b=true;
//                }
//            }
//            if (b==false){
//                System.out.println (arr1[i] );
//            }else {
//                b=false;
//            }
//        }
//
//    }
    void uniqenumb1(){
        System.out.println ("--------------------" );
        int arr[]={1,2,3,4,7,8,5,6,91,1,2,3,4,6};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = i+1; j <arr.length ; j++) {
                if((arr[i]==arr[j])&&(i!=j)){
                    count++;
                }
            }
            if(count==0){
                System.out.println (arr[i] );
            }
        }
    }
}
