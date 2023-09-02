package test;

public class question1 {
    public static void main(String[] args) {
        String str = "aabbcajfkldjaslkdsDSSKLAFJLSDKFJOIWEJcdd13246547798853^&%$$%#%&&*(()()_)_#@!@#!@~!@#%%&^*(*()";
        int arr[] = new int[256];
        for (int i = 0; i < str.length ( ); i++)
            arr[str.charAt (i)] = arr[str.charAt (i)] + 1;
            for (int j = 0; j < str.length(); j++) {
                if (arr[j] > 0)
                    System.out.println ((char) j + " occurs in " + arr[j] + "   times ");
            }

//        String str = "aabbccdd";
//        int[] arr = new int[126];
//
//        for (int i = 0; i < str.length ( ); i++)
//            arr[str.charAt (i)] = arr[str.charAt (i)] + 1;
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] > 1)
//                System.out.println ((char) j + " occurs in " + arr[j] + " times");

    }

//            }
//        }




}
