package Examquestion;

import java.io.Serializable;
import java.util.Optional;

public  class sssss
{
    public static void main(String[] args) {
        String word[]=new String[10];

        Optional<String> optional=Optional.ofNullable (word[5]);
        if (optional.isPresent ()){
            String st=word[5].toLowerCase ();
            System.out.println (st);
        }
        else {
            System.out.println ("value is not present" );
        }
    }
}

