package AssignmentQ13;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Vilas {
    public static void main(String[] args) {

//        List<Integer> list1 = Arrays.asList(10,3,4,5,73,22,33,43,23,90);
//        Integer sum= list1.stream().filter(e->e%2==0).reduce(0,(a,b)->a+b);
//        System.out.println(sum);
        List<Integer> list1 = Arrays.asList(10,3,4,5,73,22,33,43,23,90);
        Integer sum= list1.stream().filter(e->e%2!=0).reduce(0,(a,b)->a+b);

       // System.out.println(sum);
        List<Integer> list = Arrays.asList(10,3,4,5,73,22,33,43,23,90);
        Integer sum1= list1.stream().filter(e->e%2!=0).reduce(0,(a,b)->a+b);

//        System.out.println(sum1);

        String str = "aaabbbccdd";

        int num=123123;

        String s = String.valueOf (num);

//        System.out.println (s);

        List ss=
                s.chars ().mapToObj (c->(char) c).filter (c->s.indexOf (c)!=s.lastIndexOf (c)).distinct ().
        collect(Collectors.toList());
//        System.out.println (ss );

        int[]arr={1,2,3,4,54,5};
       List ll= (List) Arrays.stream (arr).filter (e->Collections.frequency (Collections.singleton (arr),e)>1);
        System.out.println (ll);

        //Arrays.stream ()

       List l = str.chars ().mapToObj (o->(char) o).filter (o->str.indexOf (o)!= str.lastIndexOf (o)).distinct ().collect(Collectors.toList());
//        System.out.println (l );

    }
}
