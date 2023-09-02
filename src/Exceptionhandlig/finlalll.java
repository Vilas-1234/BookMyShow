package Exceptionhandlig;

import java.util.Comparator;

class finlalll {
    public static void main(String[] args) {
        String str="sjlskajslakfsjfklsajslkafsdhjfhsaowhtoetjglknxvm,xcczvncvjdhgkjdfgoieither";
        int arr[]=new int[126];
        for (int i = 0; i < str.length (); i++) {
            arr[str.charAt (i)]=arr[str.charAt (i)]+1;
            for (int j = 0; j < str.length (); j++) {
                if (arr[j]>0){
                    System.out.println ((char)j+"   occurs in  :  "+arr[j]+"   times ");

                }
            }
        }
    }
    }

