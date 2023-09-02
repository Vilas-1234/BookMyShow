package test;

import practical.System;
import practical.findunique2;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

    public class findarrayunique {
        public static void main(String[] args) {
            findarrayunique un= new findarrayunique ();
            un.show();
        }
        public void show(){
            int arr[]=new int[]{1,2,3,10,9,4,5,6};
            int arr1[]=new int[]{5,6,1,2,3,7,8,9,11,14,55,1,22,3,10};
            boolean contains=false;
            ArrayList ll= new ArrayList (  );
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if(arr[i]==arr1[j]){
                        contains=true;
                        break;
                    }
                }
                if(contains==false){
                    ll.add(arr[i]);
                }else{
                    contains=false;
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr1[i] == arr[j]) {
                        contains = true;
                        break;
                    }
                }
                if (contains==false) {
                    ll.add (arr1[i]);
                } else {
                    contains = false;
                }
            }
            System.out.println (ll );
        }
    }

