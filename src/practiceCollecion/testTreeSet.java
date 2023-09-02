package practiceCollecion;

import java.util.Comparator;
import java.util.TreeSet;

public class testTreeSet implements Comparable {
    String name;
    int age;

    String std;


    public testTreeSet(String name, int age, String std) {
        this.name = name;
        this.age = age;
        this.std = std;
    }


    public static void main(String[] args) {
//        testTreeSet t1= new testTreeSet ("vilas", 25, "B.sc");
//        testTreeSet t2= new testTreeSet ("vishal", 24, "M.sc");
//        testTreeSet t3= new testTreeSet ("Ashish", 28, "B.com");
//        testTreeSet t4= new testTreeSet ("Ganesh", 32, "B.tech");
//        testTreeSet t5= new testTreeSet ("Srinath", 21, "B.CA");
//        TreeSet <testTreeSet> tt=new TreeSet<> ();
//        tt.add (t1);
//        tt.add (t5);
//        tt.add (t2);
//        tt.add (t4);
//        tt.add (t3);
//        System.out.println (tt);

        show ( );
    }

    @Override
    public int compareTo(Object o) {
        testTreeSet ttt = (testTreeSet) o;
        int val = this.std.compareTo (ttt.std);
        return val;
    }

    @Override
    public String toString() {
        return name + " \n" + age + " \n" + std;

    }

    public static void show() {
        String str = "skjfhskfshkjpwojwflkj6546987655465132188+++***///---   #$%^&%&**(*(())()(##$@$#@$%^&*((*(()())_)" +
                "*)(*(**^&&^";
        int arr[] = new int[125];
        for (int i = 0; i < str.length ( ); i++)
            arr[str.charAt (i)] = arr[str.charAt (i)] + 1;
        for (int i = 0; i < str.length ( ); i++)
            if (arr[i] > 1) {
                System.out.println ((char) i + "    occurs in :  " + arr[i] + "   times");
            }
    }

}
