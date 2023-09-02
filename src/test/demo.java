package test;

import java.util.Scanner;

public class demo {
    demo(int b, int c){
        super();

        this.show ();
    }
    demo(int a){

    }
    void sshow(){

        Scanner sc= new Scanner (System.in);
        System.out.println ( " enter the number ..." );
        int n=sc.nextInt ();
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=fact*i;
        }
        System.out.println (fact );
    }
    public static void main(String[] args) {

        new demo (2 ).show ( );
    }

    void show() {
       int tem = 0;
        System.out.println ("i am "
        );

//
//        for (int i = 1; i <= 100; i++) {
//
//            for (int j = 2; j < i ; j++) {
//                if (i % j== 0) {
//                    tem = tem + 1;
//                }
//            }
//            if (tem > 0) {
//                System.out.println ("number is prime");
//            } else {
//                System.out.println ("number is not prime");
//            }
//        }
        int arr[]={1,2,4,5,8,7,9,3,6};
        int find=5;
        for (int i = 0; i <arr.length ; i++) {
if (arr[i]==find){
    System.out.println ("it is present at index position "+i );
tem++;
}
        }
        if (tem==0){
            System.out.println ("item is not found" );
        }
    }
}
