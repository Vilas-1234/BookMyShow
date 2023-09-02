package practical;

public class FindDuplicateAndUnique {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 4, 3, 7};
       boolean b=false;
       int dupli=0;
        int uni=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
               if (arr[i]==arr[j]){
                 b=true;
               }
               if (b=true){
                   dupli++;
               }
               else {
                   uni++;
               }
            }
        }
        System.out.println (dupli+"  "+uni );
    }

}
