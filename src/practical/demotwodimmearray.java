package practical;
import java.util.Scanner;

public class demotwodimmearray {
    public static void main(String[] args) {
demotwodimmearray ad= new demotwodimmearray ();
ad.additional3rdarray ();
    }
    public void additional3rdarray() {
        Scanner sc= new Scanner (System.in);
        System.out.println ("enter the size off arr" );
        int size=sc.nextInt ();
        int arr1[][]= new int[size][size];
        System.out.println ("enter the arry1 elements" );
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=sc.nextInt ();
                System.out.print (arr1[i][j]+" " );
            }
            System.out.println ( );
        }
        int arr2[][]= new int[size][size];
        System.out.println ("enter the arry1 elements" );
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j]=sc.nextInt ();
                System.out.print (arr2[i][j]+" " );
            }
            System.out.println ( );
        }
        System.out.println ("print the arr3 elements" );
        int arr3[][] = new int[arr1.length][arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" " );
         }
            System.out.println ( );
        }
    }
}
