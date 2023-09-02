package test;

import NareshIT.vilas;

import java.util.regex.Pattern;

public final class demostring {
    public static void main(String[] args)throws Exception {
//        demostring d= new demostring ("Pragati",18);
//        demostring d1= new demostring ("vilas",25);
//        System.out.println ( d);
//        System.out.println (d1 );
        demostring d= new demostring ("Manikrao..");
        System.out.println (d.getDadname () );
        d.show1 ();
        new demostring("v");



    }
    String name;
    int age;
    static String city="Degloor";
    demostring (String name, int age, String dadname){
        this.name=name;
        this.age =age;
        Dadname = dadname;
        this.city=city;

        }

    public String toString (){
        return name+" "+age+" "+city;
    }
    final String Dadname ;
    public demostring(String Dadname){
        this.Dadname=Dadname;

        class vilas{
            void show(){
                System.out.println ( );
            }
        }
    }

    public String getDadname(){
        return Dadname;
    }
    public void show1(){
        System.out.println (Pattern.matches (".s","shd"));
        System.out.println ( Pattern.matches ("Vilas","Vilas"));
        System.out.println ( Pattern.matches ("...s","vins"));
        System.out.println ( Pattern.matches ("...v","vika"));
    }



}
