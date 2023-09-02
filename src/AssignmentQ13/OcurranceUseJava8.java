package AssignmentQ13;

import java.util.*;

public class OcurranceUseJava8 {
    public static void main(String[] args) {


//        String str = "aabbccdd";
//
//        char c[] = str.toCharArray ( );
//
//
//        Map<Character, Integer> map = new HashMap<> ( );
//        for (char c2 : c) {
//            map.put (c2, map.getOrDefault (c2, 0) + 1);
//        }
//        for (Map.Entry<Character, Integer> eee : map.entrySet ( )) {
//            System.out.print (eee.getKey ( ) + " = " + " " + eee.getValue ( ));
//            System.out.println ( );
//        }
//        String st = "vilas manik pokarne";
//        int count = 1;
//        for (int i = 0; i < st.length ( ) - 1; i++) {
//            if (st.charAt (i) == ' ' && st.charAt (i + 1) != ' ') {
//                count++;
//            }
//        }
//
//        System.out.println (count);
//
//        String sss = "klsjfdklsjgjlldksfjdlksjdflksjlkfjlksAfsk";
//        for (char i = 'a'; i < 'z'; i++) {
//            int count1 = 0;
//
//            for (int j = 0; j < sss.length ( ); j++) {
//                if (i == sss.charAt (j)) {
//                    count1++;
//                }
//            }
//
//            if (count1!=0){
//                System.out.println (i+" "+count1 );
//
//            }
//
//        }
//
//
//String vilas="kslhgfadsjkghkjKJDSAFFKLJDGOEITU4721547328178&*$#*@^(!&&*#^*%@+++---*//><>";
        String str="vilavilas";
        int Arr[]=new int[256];
        for (int i = 0; i < str.length (); i++) {
            Arr[str.charAt (i)]=Arr[str.charAt (i+1)]+1;
        }

        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i]>0){

                System.out.println ((char)i +"  occures in "+Arr[i]+"  times");
            }
        }
    }}
