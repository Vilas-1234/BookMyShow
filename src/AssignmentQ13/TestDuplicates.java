package AssignmentQ13;

public class TestDuplicates {

    public static void main(String[] args) {
        show ();
    }

    public static void show(){

        int arr[]= {1,2,3,4,5,6,7,2,8,1,9,3};
        boolean t=false;
        int duplicount=0;
        int uniquecount=0;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = i+1; j <arr.length ; j++) {
               if (arr[i]==arr[j]){
                   t=true;
                   break;
               }
            }
            if(t){
                duplicount++;
            }else
            {
                uniquecount++;
            }
        }

        System.out.println (duplicount );
        System.out.println (uniquecount );
    }
}
