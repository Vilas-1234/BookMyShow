package StringPrograms;

import java.util.Scanner;

public class countwords {
    public static void main(String[] args) {
//        AssignmentQ13.countwords cw= new AssignmentQ13.countwords ();
//        cw.count();
        countword ();


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
    public static void countword(){
        String st="vilas vilals vkddi sdkfj";
        char []arr=st.toCharArray ();
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==' '){
                count++;
            }
        }
        System.out.println ("word occur  : " +count+"  times");
    }

}
