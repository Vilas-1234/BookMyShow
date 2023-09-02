package Examquestion;

public class pairelement {
    public static void main(String[] args) {
        pairelement p= new pairelement ();
        p.show ();
    }
    void show(){
        int arr[]={1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 7) {
                    System.out.println (+arr[i] + " - " + arr[j]);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
                for (int k = arr.length-1; k > 0 ; k--) {
                    if(arr[k]+arr[i]==7){
                        System.out.println (arr[k]+" - "+arr[i] );
                    }
                }
        }
    }
}
