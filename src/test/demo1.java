package test;

import java.util.Arrays;
import java.util.Random;

public class demo1 {
    void coppyarray(){
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int merge[]=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merge[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[i+arr1.length]=arr2[i];
        }
        System.out.println (Arrays.toString (merge));
    }
    void sumandaverage(){
        int arr[]={78,52,84,84,62,80};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        float avr=sum/arr.length;
        System.out.println (avr );
    }

    void reverse(){
        int rev=0;
        int rec=0;
        int num=12321;
        while (num!=0){
           rev=num%10;
           num=num/10;
            rec=rec*10+rev;
        }
        System.out.println (rec );
    }
    void prime(){
        int t =100;
        int count =0;
        for (int i = 0; i < t; i++) {
            for (int j = 2; j < i; j++) {
                if (t % 2 == 0) {
                    count = count + 1;
                }
            }

            if (count == 0) {
                System.out.println ("is prime");
            }
        }
    }
    void swap(){
        int a=44;
        int b=55;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println (a +"   "+b );
    }
    void fabonecci(){
        int k,l=0,m=1;
        int num=10;
        for (int i = 1; i <=10; i++) {
        k=l;
        l=m;
        m=k+l;
            System.out.println (m );
        }
    }
    void armstrong(){
        int n,nu,num=0,rem;
        n=154;
        nu=n;
        while (nu!=0){
            rem=nu%10;
            num=num+rem*rem*rem;
            nu=nu/10;

        }if (num==n){
            System.out.println ("true" );
        }else System.out.println ("false" );
    }

    public static void main(String[] args) {
        demo1 dd= new demo1 ();
        dd.coppyarray ();
        dd.sumandaverage ();
        dd.swap ();
        dd.reverse ();
        dd.prime ();
        dd.fabonecci ();
        dd.armstrong ();
    }
}
