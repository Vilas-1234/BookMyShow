package NareshItJava8features;

public class demomethodreference {
    public static void main(String[] args) {
        sham sh= new sham ();
        vilas i=sh::vp1;
  // jab app method reference ka use krna hai to ah app functional interface ke
        //method ko refer krne keliy use hota hai....
        // jab aap functional interface ke method ke reference se
        // dusre class ke method ki implimention get krne ke liye...
//        vilas i2=sh::vp1;
        i.vp ();
        }
    }
@FunctionalInterface //method reference is used only for the functional interfaces...
    interface  vilas {
        void vp();
//        void vp2();
    }
        class sham {
            public  void vp1() {
                System.out.println ("vilas vp1 method ");
            }
        }

