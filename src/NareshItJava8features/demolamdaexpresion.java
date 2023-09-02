package NareshItJava8features;

import static NareshItJava8features.ram.*;

public class demolamdaexpresion {
    void show(){
//        IT i=(s,p)->{
//            if (s>p)
//                System.out.println ("hi" );
//            else
//                System.out.println ("hello" );
//        };
//        i.show (55, 99);
         IT t=(s,p)->{
            int  arr[]={5,3,2,7,8,9,4,2,1,60};
            int sum=0;
            for (int i = 0; i < arr.length; i++)
                if(arr[i]%2==0)
                     sum = sum+arr[i];
            System.out.println (sum );
        };
        t.show ( 55,55);
    }
    public static void main(String[] args) {
new demolamdaexpresion().show ();
    }
}
interface ram{
    void show(int a,int b);
}
interface  IT{
    void show(int a,int b);
}

