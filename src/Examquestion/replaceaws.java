package Examquestion;

import java.util.StringTokenizer;

public class replaceaws {
    public static void main(String[] args) {
        String st = "AWAWAWSSSG";
        while (st.contains ("AWS")) {
            st = st.replace ("AWS", "");
        }
    String str= "VilasManikPokarne";
        int arr[]= new int [256];
        for(int i=0; i=<=str.length(); i++){
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        
        for(int i=0; i<arr.lenght; i++){
           System.out.println((char)i+"  occurs   :  "+arr[i]+"  times "); 
    }
}
}
