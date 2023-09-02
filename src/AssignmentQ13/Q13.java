package AssignmentQ13;

public class Q13 {
    void changeString (){
        String str="RAjesh";
        String s="";
        String strr="";;
        s=str.substring (0,2);
        s= s.toLowerCase ( );
        strr=str.substring (2,6);
        strr=strr.toUpperCase ();
        s=s+strr;
        System.out.println (s );
        String vp="BraiN";
        String n="";
        n=vp.substring (0,1).toLowerCase ()+vp.substring (1,4).toUpperCase ()+vp.substring (4).toLowerCase (  );
        System.out.println (n );
    }
    public static void main(String[] args) {
        Q13 a= new Q13 ();
        a.changeString ();
        a.replace ();
    }
    void replace() {
////        zebra=afcsb
//        char c = 'a';
//        String st = "a";
//        String s = "";
//        for (int i = 0; i < st.length ( ); i++) {
//            if (st.charAt (i) == 'z') {
//                c++;
//                s = s + c;
//            } else if (st.charAt (i)==) {
//
//            }
//            System.out.println (s);
//        }
//    }

    String st="mthhhh";
    StringBuffer s= new StringBuffer ( st );



    }
}
