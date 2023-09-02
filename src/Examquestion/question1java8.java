package Examquestion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class question1java8 {
    public static void main(String[] args) {
        question1java8  q= new question1java8 ();
//        q.cheackeven ();
//        System.out.println ("--------------------" );
//        q.cheackodd ();
//        System.out.println ("---------------------" );
//        q.oddinrev ();
//        q.goldnum ();
//        q.revstring ();
//        q.checkStringleng ();
//        q.countword ();
//        q.contain ();
//        q.sort();
        q.revarray ();

    }
    void cheackeven(){
        int rem; int count=0;
        int num =123458;
        while (num>0){
            rem=num%10;
            num=num/10;
            if(rem%2==0){
                System.out.print( rem);
                count++;
            }
        }
    }
    void cheackodd(){
        int rem; int count=0;
        int num =123458;
        while (num>0){
            rem=num%10;
            num=num/10;
            if(rem%2!=0){
                System.out.print( rem);

            }
        }
    }
    void goldnum() {
        System.out.println ( );
        int rem;
        int gold = 0;
        int no = 7657;
        while (no > 0) {
            rem = no % 10;
            no = no / 10;
            gold = gold + rem;
        }
        System.out.println (gold );
        if(gold%5==0){
            System.out.println ("is golden no " );
        }
        else {
            System.out.println ( " is not golden no" );
        }
    }
    void oddinrev() {
        int no = 65;
        while (no > 0) {
            if (no % 2 != 0) {
                System.out.print (no + ",");
            }
            no--;
        }
    }
    void revstring(){
        String str="vilas pokarne";
        StringBuffer sb= new StringBuffer ( str );
        sb.reverse ();
        System.out.println (sb );
    }
    void sortarray() {
        int arr[] = {7, 3, 9, 12, 2, 0, 4, 0};


    }
    void checkStringleng(){
        ArrayList al= new ArrayList ( );
        al.add ("vishal");
        al.add ("raj");
        al.add ("ram");
        al.add ("vilas");
        Stream<String > st=al.stream ();
        st.filter (e->e.length ()>3).forEach(e->System.out.println ( e ));
    }
 void countword(){
        String str= "vilas manikrao pokarne";
        int count=0;
     StringTokenizer st= new StringTokenizer (str);
     while (st.hasMoreElements ()){
         System.out.println (st.nextElement () );
         count++;
      }
     System.out.println (count );
 }
 void contain(){
        ArrayList al= new ArrayList (  );
        al.add (1);
        al.add (3);
        al.add (5);
        al.add (7);
        al.add (8);
     ArrayList al1= new ArrayList ();
     al1.add (3);
     al1.add (6);
     al1.add (5);
     al1.add (8);
     List <Integer> lt=(List<Integer>) al.stream ().filter (al1::contains).collect(Collectors.toList());
     System.out.println (lt );
    }
    void sort(){
       ArrayList al= new ArrayList (  );
       al.add (9);
       al.add (5);
       al.add (1);
       al.add (2);
       al.add (3);
       al.add (8);
       Stream <Integer>st= al.stream ();
       st.filter (e->e==e).sorted ().forEach (e-> System.out.println (e));
       Integer min= st.min ((a,b)->a.compareTo (b)).get ();
        System.out.println (min);
    }
    void deccending(){
        ArrayList al= new ArrayList (  );
        al.add (1);
        al.add (2);
        al.add (3);
        al.add (4);
        al.add (5);
        al.add (6);
        ArrayList al1= new ArrayList (  );
        al1.add (1);
        al1.add (2);
        al1.add (3);
        al1.add (4);
        al1.add (7);
        al1.add (8);


    }
    void revarray(){
        int arr[]={5,4,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            int swap;
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print( arr[j]);
        }
    }


    }


