package AssignmentQ13;

import java.util.Scanner;

public class countwords {
    public static void main(String[] args) {
        countwords cw= new countwords ();
        cw.count ();


    }
    public void count(){
        Scanner sc= new Scanner (System.in);
        System.out.println ("enter the String ..." );
        String str=sc.nextLine ();
        int count=1;
        for (int i = 0; i < str.length()-1; i++) {
           if ((str.charAt(i)==' ')&&(str.charAt (i+1)!=' ')) {
               count++;
           }
        }
        System.out.println (count );
    }
    public void countduplicateword(){
        Scanner sc= new Scanner (System.in);
        System.out.println ("enter the String ..." );
        String str=sc.nextLine ();

    }
}
