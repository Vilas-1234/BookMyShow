package test;



import com.sun.javaws.IconUtil;

import java.util.ArrayList;
import java.util.Arrays;



    //    void show(){
//        int b=10;
//        int countb=0;
//        int countc=0;
//
//        int c=25;
//        for (int i = 1; i <=b; i++) {
//            if(b%i==0){
//            System.out.println (i );
//            countb++;
//            }
//        }
//        System.out.println ("------------" );
//        System.out.println (countb );
//        System.out.println ("------------" );
//        for (int i = 1; i <=c; i++) {
//            if(c%i==0){
//                System.out.println (i );
//                countc++;
//        }}
//        System.out.println ("------" );
//        System.out.println (countc );
//        System.out.println ("------" );
//        if(countb>countc){
//            System.out.println ("factor of  "+b+  "  has most factor");
//        }else {
//            System.out.println ("factor of  "+c+"  has most factor" );
//
//        }
//
//
//
//
//        int arr[]={1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%2==0){
//                System.out.println(arr[i] );
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]%2!=0){
//                System.out.println (arr[i] );
//            }
//        }
//
//
//
//
//        int arr2[]={55,42,77,88,99,11,25};
//        int arr3[]={2,4,6,0,1,3,5};
//        int arr4[]=new int[arr2.length];
//        for (int i = 0; i < arr4.length; i++) {
//            arr4[arr3[i]]=arr2[i];
//        }
//        for (int i = 0; i < arr4.length; i++) {
//            arr2[i]=arr4[i];
//            arr3[i]=i;
//        }
//        System.out.print (Arrays.toString (arr2)+"," );
//        System.out.println ( );
//        System.out.print (Arrays.toString (arr3)+"," );
//
//
//
//    }
  public class ddd {


        public static void main(String[] args) {
            String inputString = "My name is Guarav Kukade!";
            ddd.printDuplicates ("vilas mamamamandjsffjksffeuewiuh");
        ddd d= new ddd ();
        d.shhh ();
        String  arr[]={"a","b","d","e"};



        }

        public static void printDuplicates(String inputString) {
            // count
            int count = 0;

            // a temp list of ch for which we have already printed the count
            ArrayList<Character> charList = new ArrayList<> ( );

            for (int i = 0; i < inputString.length ( ); i++) {

                char ch = inputString.charAt (i);

                // count the number of occurrences of the char ch in inputString
                for (int j = 0; j < inputString.length ( ); j++) {
                    if (inputString.charAt (j) != ch) {
                        continue;
                    }
                    count++;

                }

                // check if we have already printed for ch
                if (!charList.contains (ch)) {
                    // check if count is more than 1 i.e. duplicate and char should not be space
                    if (count > 1 && ch != ' ') {

                        System.out.println ("Char: " + ch + ", Count: " + count + " times.");
                        charList.add (ch);
                    }
                }

                // set counter to zero for next ch
                count = 0;
            }
            System.out.println (charList);
        }
  public void shhh(){
            String s="vilasssfsdfsdfsj";
            String st=s;
            char ch[]=s.toCharArray ();
             int a=0;
      for (int i = 0; i <s.length (); i++) {
          for (int j = 0; j < st.length (); j++) {
              if(s.charAt (i)==st.charAt (j)){
                  a++;
                  System.out.println (st.charAt(j)+" "+a+"   times" );

              }
          }
      }

  }
  void show1(){
            String s="Army ";
            String ss="mary";
      System.out.println ("-------------" );
      char sss[]=s.toLowerCase (  ).toCharArray ();
      char ssss[]=ss.toLowerCase ().toCharArray ();
      Arrays.sort (sss);
      Arrays.sort (ssss);
      System.out.println (Arrays.equals (sss,ssss) );

  }
  void show2() {
  int arr1[]={55,44,2,11,44,66,9,88,77,};
  int ans= arr1.length-1;
  Arrays.sort (arr1);
      System.out.println (Arrays.toString (arr1) );
  for (int i=0;i< arr1.length;i++){
        if (ans<arr1[i]){
            ans=arr1[i-1];
        }
    }
      System.out.println (ans);
  }
  void show3(){
            int arr[]={1,2,3};
            int arr1[]={4,5,6};
            int arr2[]=new int[arr.length+arr1.length];
            System.arraycopy (arr,0,arr2,0,arr.length);
            System.arraycopy (arr1,0,arr2,arr.length,arr1.length);
      System.out.println (Arrays.toString (arr2) );
        }



  }



