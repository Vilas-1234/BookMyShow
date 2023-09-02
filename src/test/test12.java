package test;

import practical.System;

public class test12 {
    public static void main(String[] args) {
        test12 t= new test12 ();
        t.show ();
    }
    public void show() {
        int arr[] = {1, 2, 3, 4, 5, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]){
                    System.out.println (arr[i] );
                }
            }
        }
    }
}
