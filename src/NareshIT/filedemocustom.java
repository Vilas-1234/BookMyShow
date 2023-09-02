package NareshIT;

import java.io.*;

public class filedemocustom {
    public static void main(String[] args) throws Exception {
        FileOutputStream fo = new FileOutputStream ("C:\\Users\\Lenovo\\" +

                "IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        ObjectOutputStream ob1 = new ObjectOutputStream (fo);
        UserId u = new UserId ( );
        ob1.writeObject (u);//order of  object may  be very importtant for the serialzation...
        ob1.close ( );
        fo.close ( );
        FileInputStream fs = new FileInputStream ("C:\\Users\\Lenovo\\IdeaProjects" +
                "\\corejava\\src\\NareshIT\\rama.txt");
        ObjectInputStream ob = new ObjectInputStream (fs);
        UserId u1 = (UserId) ob.readObject ( );
        System.out.println (u1.userid + "\n" + u1.pass);

    }
}
    class  UserId implements Serializable{
       transient String userid="vilaspokarne121@gmail.com";
       transient String pass="pragati143";

    }

