package test1;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1 ( );
//        t.show ( );
//        t.fabnacci ( );
//        t.fact ( );
//        t.factors ( );
       t.prime ( );
//        t.checkprime ( );
//        t.additioncout ( );
//        t.duplicate ( );
//        t.reverse ( );
//        t.createnegativearray ( );
//t.determinant ();
//        t.transpose ( );
//        t.sumoftwoarray ();
//        t.findstring ();
//        t.stringrev ( );
//        t.changeString ( );
//        t.deltaarray ();
//        t.additionarray ( );
//        t.avarage ();
        t.maxmin ();

    }

    public void show() {
        int n = 3, n1 = 4;
        for (int i = 1; i <= 10; i++) {
            System.out.print (n * i + ",");
            System.out.print (n1 * i + ",");
        }
        System.out.println ( );
    }

    void fabnacci() {
        int a = 0, b = 1, c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.print (c + ",");
            a = b;
            b = c;
        }
        System.out.println ( );
    }

    void fact() {
        int fact = 1;
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
        }
        System.out.println (fact);
        System.out.println ( );
    }

    void factors() {
        int n = 32;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println (i);
            }
        }
    }

    void prime() {
        int p = 56, t = 0;
        for (int i = 2; i <= p; i++) {
            if (p % 2 == 0) {
                t = t + 1;
            }
        }
        if (t == 0) {
            System.out.println ("is prime");
        } else {
            System.out.println ("is not");
        }
    }

    void checkprime() {
        System.out.println ( );
        int n = 100;
        int s = 50;
        for (int i = s; i <= n; i++) {
            int p = 0;
            for (int j = 2; j <= i; j++) {
                if (i % 2 == 0) {
                    p = p + 1;
                }
            }
            if (p == 0) {
                System.out.print (i + " , ");
            }
        }

    }

    void additioncout() {
        int p = 10;
        int arr[] = {6, 1, 4, 2, 5, 7, 8, 9, 10, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (p == arr[i] + arr[j]) {
                    System.out.println (arr[i] + "  " + arr[j]);
                }
            }
        }
    }

    void duplicate() {
        int arr[] = {1, 2, 3, 4, 5, 5, 6, 7, 4, 8, 1, 2, 3, 8, 8, 9, 5};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (i != j)) {
                    System.out.println (arr[j]);
                }
            }
        }
    }

    void reverse() {
        int arr[] = {5, 4, 3, 2, 1, 0};
        int p = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[p - 1] + " ");
            p--;
        }
    }

    void createnegativearray() {
        int arr[] = {2, 5, 4, -7, 8};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -(arr[i]);
        }
        System.out.println ( );
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i] + " ");
        }
    }

    void determinant() {
        System.out.println ( );
        Scanner sc = new Scanner (System.in);
        System.out.println ("plz enter the size");
        int arr[][] = new int[sc.nextInt ( )][sc.nextInt ( )];
        System.out.println ("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt ( );
            }
        }
        int total = arr[0][0] * arr[1][1] + arr[0][1] * arr[1][0];
        System.out.println (total);

    }

    void transpose() {
        System.out.println ( );
        int arr[][] = {{1, 2}, {3, 4}, {5, 6}};
        int row = arr.length;
        int col = arr[0].length;
        int arr1[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print (arr[i][j] + " ");
            }
            System.out.println ( );
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print (arr1[i][j] + " ");
            }
            System.out.println ( );
        }
    }

    void sumoftwoarray() {
        int arr[][][] = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}};
        int arr1[][][] = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}};
        int arr2[][][] = new int[arr.length][arr1.length][arr1.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {

                    arr2[i][j][k] = arr[i][j][k] + arr1[i][j][k];
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    System.out.print (arr2[i][j][k] + " ");
                }
            }
            System.out.println ( );
        }
    }

    void findstring() {
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter the String");
        String name = sc.nextLine ( );
        if (name.equals ("+")) {
            System.out.println ("addition");
        } else if (name.equals ("-")) {
            System.out.println ("substraction");
        } else if (name.equals ("*")) {
            System.out.println ("multiplication");

        } else if (name.equals ("/")) {
            System.out.println ("division");
        }
    }

    void stringrev() {
        String st = "vilas";
        char arr[] = st.toCharArray ( );
        String s="";
        for (int i = 0; i < st.length ( ); i++) {
            arr[i] = st.charAt (i);
        }
        System.out.println ( );
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print (arr[i]);
        }
        System.out.print (Arrays.toString (arr));
    }

    void changeString() {
        String str = "RAjesh";
        String s = "";
        String strr = "";
        ;
        s = str.substring (0, 2);
        s = s.toLowerCase ( );
        strr = str.substring (2, 6);
        strr = strr.toUpperCase ( );
        s = s + strr;
        System.out.println (s);
        String vp = "BraiN";
        String n = "";
        n = vp.substring (0, 1).toLowerCase ( ) + vp.substring (1, 4).toUpperCase ( ) + vp.substring (4).toLowerCase ( );
        System.out.println (n);

    }


//    class vina{
//    void ssss (){
//
//    }
//     void sss(){
//        System.out.println ("private method" );
//    }
//    }
//    class rama extends vina{
//    @Override
//     void sss(){
//        super.sss ();
//        System.out.println ("child method");
//    }
//        public static void main(String[] args) {
//     vina r= new rama ();
//    r.sss ();
//
//        }
//    }
//    class rajaram{
//    private  static rajaram  Single_object=null;
//    private  rajaram(){}
//  public  static rajaram getInstace(){
//        if (Single_object==null){
//            Single_object=new rajaram ();
//        }
//      return Single_object;
//  }
//
//        public static void main(String[] args) {
//            rajaram r= new rajaram ();
//            System.out.println (r.getClass () );
//
//        }
//
//}

    void deltaarray() {
        int arr[][] = {{4, 1}, {6, 5}};
        int arr1[][] = {{2, 8}, {7, 9}};
        int arr2[][] = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i][j] > arr1[i][j]) {
                    arr2[i][j] = (arr[i][j]) - (arr1[i][j]);
                    System.out.print (arr2[i][j] + " ");
                } else {
                    arr2[i][j] = (arr1[i][j]) - (arr[i][j]);
                    System.out.print (arr2[i][j] + " ");
                }
            }
        }
    }

    void additionarray() {
        int arr[] = {2, 5, 7, 8, 9, 1, 3};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
                total = total+arr[i];
            }
        System.out.println (total);
    }
    void avarage(){
        int arr[] = {2, 5, 7, 8, 9, 1,5, 3,88};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total=total+arr[i];
        }
        System.out.println (total );
        int avr=total/arr.length;
        System.out.println (avr );
    }
    void maxmin(){
        int arr[] = {112, 5, 7, 8, 9, 1,5,0,111, 3,88};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            } else if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println (min );
        System.out.println (max );
    }

}