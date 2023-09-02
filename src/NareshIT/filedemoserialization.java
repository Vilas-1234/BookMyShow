package NareshIT;

import java.io.*;

public class filedemoserialization {
    public static void main(String[] args)throws Exception {
        System.out.println ("object Serialization.. " );
        FileOutputStream fo= new FileOutputStream ("C:\\Users\\Lenovo" +
                "\\IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        ObjectOutputStream ob1=  new ObjectOutputStream (fo);
        A a= new A();
        B b= new B();
        ob1.writeObject (a);
        ob1.writeObject (b);
        FileInputStream fi= new FileInputStream ("C:\\Users\\Lenovo\\IdeaProjects\\" +
                "corejava\\src\\NareshIT\\rama.txt");
        ObjectInputStream ob= new ObjectInputStream (fi);
       A aa= (A)ob.readObject ();
        B bb= (B)ob.readObject ();
        System.out.println (bb.x+ bb.y+aa.a+aa.b );
        ob1.close ();
        ob.close ();
    }
}
class A implements Serializable {
int a=20;
int b=40;
}
class B implements Serializable{
int x=200;
int y=400;
}
