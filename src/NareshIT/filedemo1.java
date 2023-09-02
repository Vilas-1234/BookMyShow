package NareshIT;

import java.io.*;
public class filedemo1 {
    public static void main(String[] args)throws Exception {
        FileWriter fw=new FileWriter("vp.text");
        BufferedWriter bw=new BufferedWriter(fw);
        String data="vilas pokarne";
        byte []arr= data.getBytes();
        bw.write(" I am a vilas pokarne ");
        bw.write("I am from nanded But I am currently live in Pune");
        bw.close();
        FileReader fr= new FileReader("vp.text");
        BufferedReader br=new BufferedReader(fr);
       int r;
        while ((r=fr.read())!=-1){
            System.out.print((char)r);
        }

    }

    }
