package NareshIT;

import java.io.*;

public class filedemo2 {
    public static void main(String[] args)throws Exception {
        filedemo2 ff= new filedemo2();
        ff.filewrite();
        ff.read();
    }
    void filewrite()throws Exception{
        FileWriter fw= new FileWriter("Pragati.text");
        BufferedWriter bw= new BufferedWriter(fw);
        FileOutputStream bb= new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\Pragati.test");
        String a="I am a java fulstack developer ";
        byte[]arr=a.getBytes();
        bb.write(arr);
        System.out.println("Data is written");
        bb.close();
        bw.write("I am a vilas \n I am from Nanded \n but I am currently live in Pune\n ");
        bw.write(a+"\n");
        bw.close();
    }
    void read()throws Exception{
      FileInputStream ff= new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\Pragati.text");
        int i;
        while((i=ff.read())!=-1){
            System.out.print((char)i);
        }
    }
}
