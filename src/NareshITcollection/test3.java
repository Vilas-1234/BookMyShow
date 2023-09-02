package NareshITcollection;

import java.util.Comparator;

class test3 implements Comparator<test> {
    @Override
    public int compare(test o1,test o2){
//        return o1.getId() - o2.getId ();
        return  o1.getName ().compareTo (o2.getName ());
    }
}
