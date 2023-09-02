package Examquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class replaceaws {
    public static void main(String[] args) {
        String st = "AWAWAWSSSSGS";
        while (st.contains ("AWS")) {
            st = st.replace ("AWS", "");
        }

        System.out.println (st );
    String str= "VilasManikPokarne";
        int arr[]= new int [126];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        Map <Character, Integer> map=new HashMap<> ();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0)
                map.put ((char)i,arr[i]);

    }
        System.out.println (map );
}
}
