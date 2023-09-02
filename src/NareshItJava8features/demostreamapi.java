package NareshItJava8features;

public class demostreamapi {
    void display(){
        functionalInterface ab=(age,name)->System.out.println ( age+" , "+name);
        ab.show (25,"Vilas");
    }

    public static void main(String[] args) {
        new demostreamapi ().display ();
    }
}
