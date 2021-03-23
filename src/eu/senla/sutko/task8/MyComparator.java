package eu.senla.sutko.task8;

import java.util.Comparator;

public class MyComparator <T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if(o1.hashCode()>o2.hashCode()){
            return 1;
        }
        if(o1.hashCode()<o2.hashCode()){
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
