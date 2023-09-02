package Examquestion;

import java.util.StringTokenizer;

public class replaceaws {
    public static void main(String[] args) {
        String st = "AWAWAWSSSG";
        while (st.contains ("AWS")) {
            st = st.replace ("AWS", "");
        }
        System.out.println (st);
        String sst = "     Vilas         manik    pokarne ";
//    int count=0;
//        StringTokenizer stt= new StringTokenizer (sst);
//        while(stt.hasMoreElements ()==true){
//            System.out.println (stt.nextElement () );
//            count++;
//        }
//        System.out.println (count);
//    }

    }
}
