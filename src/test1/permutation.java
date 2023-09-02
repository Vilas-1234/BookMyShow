package test1;

public class permutation {
    void display (String s ){
         show("",s);
    }
void show(String str,String s){
 int l=s.length ();
 if(l==0){
     System.out.println (str);
 }else{
     for (int i = 0; i < l; i++) {
         show(str+s.charAt(i),s.substring (0,i)+ s.substring (i+1,l));
     }
 }
}
//void display(String st) {show("",st);}
//    void show (String st, String s){
//        int leng = s.length ( );
//        if (leng == 0) {
//            System.out.println (st);
//        } else {
//            for (int i = 0; i < leng; i++) {
//
//                show (st + s.charAt (i), s.substring (0, i) + s.substring (i+1, s.length ( )));
//            }
//        }
//    }
    public static void main(String[] args) {
        permutation p= new permutation ();
        p.display ("raj");
    }
}
