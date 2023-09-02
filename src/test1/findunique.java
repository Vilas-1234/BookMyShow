package test1;

public class findunique {
    public static void main(String[] args) {

//    int arr[]= {1,2,3,4,5,6,7,8,9,3,2,1,4,5,6};
//    int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length-1 ; j++) {
//                if (arr[i]!=arr[j]&&(i!=j)){
//                    count++;
//                }
//            }
//        }
//        if (count==0){
//            for (int k = 0; k < arr.length; k++) {
//                System.out.println (arr[k] );
//            }
//        }


        int arr1[]={2,4,5,2,8
                ,4,5};

        int findnumber=findunique(arr1);
        System.out.println(findnumber);

    }
    public static int findunique(int arr1[]){
        int finduniquenumber=0;
        for(int i=0;i<arr1.length;i++){
            finduniquenumber ^= arr1[i];

        }
        return finduniquenumber;
    }
}
