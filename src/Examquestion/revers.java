package Examquestion;

public class revers {
    public static void main(String[] args) {
        revers s= new revers ();
        s.show ();

        int no=12345;
        int gold=0;
        int rem;
        while (no>0){

            rem=no%10;
            no=no/10;
//             gold=gold+rem;
            if(rem%2==0){
                System.out.print(rem+"," );
            }
        }

    }void show() {

        String s[] = "Vilas Manik Pokarne At Post".split (" ");
        String st = "";
        for (int i = s.length - 1; i >= 0; i--) {
            st += s[i]+ " ";
        }
        System.out.println (st.substring (0,st.length ()) );
    }
}
