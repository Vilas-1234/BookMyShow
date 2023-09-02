package practiceCollecion;

public class Occurance {
    public static void main(String[] args) {
count ();
checkmethod ();
    }
    public static void checkmethod(){
        String str1=new String ("Vilas");
        String str2=new String ("vilas");
        String str3="vilas";
        String str4="vilas";
        System.out.println (str1.equals (str2 ) );
        System.out.println (str1==str2);
        System.out.println (str1.equals (str3 ) );
        System.out.println (str4==str3 );

    }
    public static void count(){
        String str="vilas manik pokarne aloor degloor nanded";
        int count=1;
        for (int i = 0; i < str.length (); i++) {
            if (str.charAt (i)==' '&&str.charAt (i+1)!=' '){
                count++;
            }
        }
        System.out.println ( "  count  word "+count+"  times");
    }
    public static void occurance(){
        String str=
                "ksjdksjlwopjaldkjfsflksddjpworweorijklksnnfjlskkfjdslkkffjslfkjprowioperitjad" +
                        "//][{}{{}}{{}})*^*&^^&%^%$%$##$@#$#$^&^*&(*" +
                        "(())()**&%&^^%$%$#$%#@$#%$$^&()@@)#(@)*#()" +
                        "$&(*#$$';.,;[]';.,><>><<>??>><<>>>>???"
+
                        "::::{{}}}GDJKSJKDHSDKOEIHWEHKJFHKSDJHFKSDJHFJOEIUWIOHHEKJDSKJLFSKJLslkfjskfjsfpiiweruweioerjewklfsdjflksjfdfklgjdfl;" +
                        "gkeujoierjlkjalkgd6544646+32165574988765131655496846131";
        int arr[]= new int[500];
        for (int i = 0; i < str.length (); i++)
            arr[str.charAt (i)]=arr[str.charAt (i)]+1;
            for (int j = 0; j < str.length (); j++)
                if (arr[j]>0)
                    System.out.println ((char)j+"   occurs in  :  "+arr[j]+"   times ");
        }
        public static void pairElement(){
        int arr[]={1,2,3,4,5,6,7,8,9};
          int totle=8;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                   if( arr[i]+arr[j]==totle){
                       System.out.println (arr[j]+"  +  "+arr[i]+"  =  " +totle);
                   }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length-1; j >i; j--) {
                    if (arr[j] + arr[i] == totle) {
                        System.out.println (arr[i] + "  +  " + arr[j] + "  =  " + totle);
                    }
                }
            }
        }
    }

