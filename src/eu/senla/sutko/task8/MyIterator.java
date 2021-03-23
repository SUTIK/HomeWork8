package eu.senla.sutko.task8;

import java.util.Iterator;

public class MyIterator <T> implements Iterator<T> {

    int i;
    T [] massiv;

    public MyIterator(T[] massiv) {
        this.massiv = massiv;
    }

    @Override
    public boolean hasNext() {
        return i< massiv.length;
    }

    @Override
    public T next() {
        return massiv[i++];
    }
}
