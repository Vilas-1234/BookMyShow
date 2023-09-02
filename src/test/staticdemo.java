package test;

import java.util.Spliterator;

public  class staticdemo {
//    public static   class sho{
//        static void show(){
//            System.out.println (" i am static class method..." );
//        }
//    }
    int age;
    String name;
    static String branch="IT";
    staticdemo(int age,String name){
        this.age=age;
        this.name=name;
    }void shos(){
        System.out.println ("age = "+age );
        System.out.println ( "name = "+name);
        System.out.println ( "branch = "+branch);
    }
    public static void main(String[] args) {
//        sho s= new sho ();
staticdemo st= new staticdemo (25,"vilas");
staticdemo st1= new staticdemo (24,"Ashish");
staticdemo st2= new staticdemo (22,"Ganesh");
st.shos ();
st1.shos ();
st2.shos ();


    }
}
