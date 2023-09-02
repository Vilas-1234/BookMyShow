package practical;

import java.util.ArrayList;
import java.util.List;

public class Streamdemo {
    int age;
    String name;
    String vilage;
    Streamdemo(int age,String name,String vilage){
        this.age=age;
        this.name=name;
        this.vilage=vilage;
    }
    public static void main(String[] args) {
        ArrayList <Streamdemo>al= new ArrayList ();
        al.add (new Streamdemo (25,"vilas","Alur"));
        al.add (new Streamdemo (22,"Ganesh","hangrga"));
        al.add (new Streamdemo (24,"Ashish","Alur"));
        al.add (new Streamdemo (25,"VIshal","Degloor"));
        al.add (new Streamdemo (27,"Basvaraj","Alur"));
        List l= new ArrayList();
        for (Streamdemo ob:al) {
            if(ob.age>22){
                l.add (ob.age);
            }
        }
        System.out.println (l );
    }
}
