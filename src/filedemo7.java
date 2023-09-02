import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filedemo7 {
    public static void main(String[] args)throws Exception {
        filedemo7 ff= new filedemo7 ();
        ff.show ();
        ff.show1 ();
    }
    void show()throws Exception{

        FileInputStream fis= new FileInputStream ("C:\\Users\\Lenovo\\" +
                "IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        DataInputStream dt= new DataInputStream (fis);
        System.out.println (dt.readInt () );//he aplyala sgl jas apn file madhe data write kart ahot tyach serial pramane ch
        // aplyala read  krav lagel nahitr aplyala data print krych ahe ts hot nahi manun
        // if we does not to change it serial  then it will be getting out put is changeble we accept output will not give u..
        System.out.println (dt.readBoolean () );
        System.out.println (dt.readChar () );
        System.out.println (dt.readInt () );
        int i;
        while ((i=dt.read ())!=-1){
            System.out.print ((char)i );
        }
        dt.close ();

    }
    void show1()throws Exception{

        FileOutputStream fos= new FileOutputStream ("C:\\Users\\Lenovo\\" +
                "IdeaProjects\\corejava\\src\\NareshIT\\rama.txt",true);
        DataOutputStream Do= new DataOutputStream (fos);
        Do.writeInt (1000);
         Do.writeBoolean (true);
        Do.writeChar ('V');
        Do.writeInt (2000);
        String s="\n where are u bro ...";
        Do.writeUTF (s);

        Do.close ();
        System.out.println ( );
        System.out.println ("-----------------" );


    }

}
