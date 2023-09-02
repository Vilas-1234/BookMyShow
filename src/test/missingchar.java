package test;

import java.util.Arrays;

public class missingchar {
    public static void main(String[] args) {

  show ();
        String[] str_arra = {"A", "B", "D", "E"};
        //String[] str_arra = {"a", "b", "c", "e"};
        //String[] str_arra = {"p", "r", "s", "t"};
        System.out.printf ("Original array of elements:\n" + Arrays.toString (str_arra));
        String result = test (str_arra);
        System.out.printf ("\nMissing letter in the said array: " + result);
    }

    public static String test(String[] str_arra) {
        for (int i = 0; i < str_arra.length - 1; i++) {
            if (str_arra[i + 1].charAt (0) - str_arra[i].charAt (0) > 1) {
                String result_char = "" + (char) ((int) str_arra[i].charAt (0) + 1);
                return result_char;
            }
        }
        return "";
    }
    static void show(){
        for (int i = 0; i <6 ; i++) {
            for (int j = 6; j >i ; j--) {
                System.out.print (" " );
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print ("* " );
            }
            System.out.println ( );

        }
}}
