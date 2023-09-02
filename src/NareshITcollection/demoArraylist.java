package NareshITcollection;

import java.util.*;
import java.util.stream.Collectors;

public class demoArraylist {
    public static void main(String[] args) {
        demoArraylist dm= new demoArraylist ();
        dm.show ();

    }
    void show(){
        Scanner sc= new Scanner (System.in);
        String arr[]= new String[6];
        System.out.println (" enter the object  into the Arraylist" );
        ArrayList ar= new ArrayList ( );
        //ArrayList is index based ...
        //it is follw the insertion order ...
        // we can add any number off null values...
        // we can add any number off duplicate values...
        // Arraylist was introduced by jdk 1.2 version...
        //it is not synchronized by default...
        //Arraylist by default capacity is 10...
        //then we  add the 11 th object then it will increase automatically
        // New capacity is (old capacity *3/2)+1= new capacity
        // the underline datastructure of arraylist is object[]array...
        System.out.println (ar.size () );
        for (int i = 0; i <6; i++) {
            arr [i]=sc.nextLine () ;
            ar.add (arr[i]); }
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort (arr);
            System.out.println (arr[i] );
       }
        System.out.println ( );
        System.out.println ( ar.remove (4) );// if we can use remove method then we wil
        //at specific index position then that position value will be return then  it will delete from the list...
        System.out.println (ar );
        System.out.println (ar.remove ("sham") );// if we can use remove method in that method we want the remove from
        // specific object in to the list then it will remove from the object and return the if that
        //object is remove from the list then it will return true and otherwise it will return false...
        System.out.println (ar );
        System.out.println (ar.contains (55) );// if that element is present in that list then
        // it will return the true and otherwise return false...
        System.out.println (ar.isEmpty () );//if that method is check the in that list elements are present or not
        // if elements are present then it return true otherwise it return false...
        Collections.sort (ar);
        System.out.print(ar+"," );
        System.out.println ( );
        System.out.print(ar+"," );
        Iterator it= ar.iterator ();
        while (it.hasNext ()==true){
            System.out.println (it.next () );
        }
        System.out.print (ar+" , ");
    }
}
