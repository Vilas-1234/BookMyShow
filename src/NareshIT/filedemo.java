package NareshIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class filedemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw= new FileWriter("vp.text");
        fw.write(65);
        fw.write(65);
        fw.write(65);
        fw.write(65);
        fw.write(65);
        fw.flush();
        fw.close();
    }
}
