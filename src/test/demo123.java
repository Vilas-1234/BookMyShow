package test;

public class demo123 {

    static {
        int s=20;
    }
     public static int gets() {
        return  gets ();
    }

    public static void main(String[] args) {
//        System.out.println ();
//        int t=show (1,2,3,4,5,6,7,8,9,10);
//        System.out.println (t);

    }
 static int  show(int ...p){
        int addition=0;
     for (int i = 0; i < p.length; i++) {
         addition+=p[i];
     }
     return addition;
    }
    void coppyarray(){
        int arr[]={1,2,3};
        int arr1[]={4,5,6};
        int arr2[]=new int[arr.length+arr1.length];
       System.arraycopy (arr,0,arr.length,0,arr.length);
    }
}
